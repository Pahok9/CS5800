public class Message {
    private final User sender;
    private final User receiver;
    private final String content;

    public Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return sender + " sent a message to " + receiver + ": " + content;
    }
}
