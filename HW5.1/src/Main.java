import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User bob = new User("Bob");
        User carli = new User("Carli");
        User steven = new User("Steven");

        chatServer.registerUser(bob);
        chatServer.registerUser(carli);
        chatServer.registerUser(steven);

        chatServer.sendMessage(carli, Arrays.asList(bob, steven), "Hello Bob and Steven!");
        chatServer.sendMessage(carli, Arrays.asList(bob, steven), "How are you guys doing?");
        chatServer.sendMessage(bob, List.of(carli), "Hey hey Carli!");
        chatServer.sendMessage(steven, Arrays.asList(bob, carli), "Hi guys!");

        System.out.println();
        System.out.println("Undo last message for Carli:");
        carli.undoLastMessage();
        System.out.println();

        System.out.println("Bob blocks Carli, but not Steven:");
        chatServer.blockUser(bob, carli);
        chatServer.sendMessage(carli, List.of(bob), "Can you see this message, Bob?");
        chatServer.sendMessage(steven, List.of(bob), "Are you still there?");
        System.out.println();

        System.out.println("Steven received message from Bob:");
        chatServer.receiveMessage(List.of(steven), bob, "Yeah, still here");
        steven.printChatHistory();
    }
}
