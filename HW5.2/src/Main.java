public class Main {

    public static void main(String[] args) {
        ChatHistory chatHistory = new ChatHistory();

        User steven = new User("Steven", chatHistory);
        User bob = new User("Bob", chatHistory);
        User goku = new User("Goku", chatHistory);

        steven.sendMessage(bob, "Hanging Bob?");
        bob.sendMessage(steven, "Ya Steve!");
        steven.sendMessage(bob, "Where?");
        bob.sendMessage(steven, "CPP!");
        goku.sendMessage(bob, "Kamehamehaaaaa!");

        System.out.println("Messages sent or received by Steven:");
        SearchMessagesByUser userConversation = (SearchMessagesByUser) chatHistory.iterator(steven);
        while (userConversation.hasNext()) {
            System.out.println(userConversation.next());
        }
    }
}
