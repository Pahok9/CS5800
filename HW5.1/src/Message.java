import java.util.List;

class Message {
    private String sender;
    private List<User> recipients;
    private String content;
    private float timestamp;

    public Message(String sender, List<User> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    public String getSender() {
        return sender;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public String getContent() {
        return content;
    }

    public float getTimestamp() {
        return timestamp;
    }

    public MessageMemento setMemento() {
        return new MessageMemento(content, timestamp);
    }

    public void undoFromMemento(MessageMemento memento) {
        content = memento.getContent();
        timestamp = memento.getTimestamp();
    }
}
