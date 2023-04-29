import java.util.*;

public class ChatServer {
    private List<User> users = new ArrayList<>();
    private Map<User, List<User>> blockedUsers = new HashMap<>();
    private ChatHistory chatHistory;

    public void registerUser(User user) {
        users.add(user);
        blockedUsers.put(user, new ArrayList<>());
    }

    public void unregisterUser(User user) {
        users.remove(user);
        blockedUsers.remove(user);
    }

    public void sendMessage(User sender, List<User> recipients, String message) {
        for (User recipient : recipients) {
            if (!blockedUsers.get(recipient).contains(sender)) {
                sender.sendMessage(Collections.singletonList(recipient), message);
            }
        }
    }

    public void receiveMessage(List<User> recipients, User sender, String message) {
        for (User recipient : recipients) {
            if (!blockedUsers.get(recipient).contains(sender)) {
                recipient.receiveMessage(sender.getUsername(), message);
            }
        }
    }

    public void blockUser(User user, User blockedUser) {
        if (blockedUsers.containsKey(user)) {
            blockedUsers.get(user).add(blockedUser);
        }
    }
}
