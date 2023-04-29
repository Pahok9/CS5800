import java.util.Iterator;

public class User implements IterableByUser {
    private final String name;
    private final ChatHistory chatHistory;

    public User(String name, ChatHistory chatHistory) {
        this.name = name;
        this.chatHistory = chatHistory;
    }

    public void sendMessage(User receiver, String content) {
        Message message = new Message(this, receiver, content);
        chatHistory.addMessage(message);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Iterator<Message> iterator(User targetUser) {
        return chatHistory.iterator(targetUser);
    }
}
