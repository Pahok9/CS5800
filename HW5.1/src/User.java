import java.util.Collections;
import java.util.List;

class User {
    private String username;
    private ChatHistory chatHistory;
    private Message lastSentMessage;
    private MessageMemento lastSentMessageMemento;

    public User(String username) {
        this.username = username;
        this.chatHistory = new ChatHistory();
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(List<User> recipients, String message) {
        Message sentMessage = new Message(username, recipients, message);
        chatHistory.addMessage(sentMessage);
        lastSentMessage = sentMessage;
        lastSentMessageMemento = sentMessage.setMemento();
        System.out.printf("%s sent a message to %s: %s%n", username, recipients, message);
    }

    public void receiveMessage(String sender, String message) {
        Message receivedMessage = new Message(sender, Collections.singletonList(this), message);
        chatHistory.addMessage(receivedMessage);
        lastSentMessage = receivedMessage;
        lastSentMessageMemento = receivedMessage.setMemento();
        System.out.printf("%s received a message from %s: %s%n", username, sender, message);
    }

    @Override
    public String toString() {
        return username;
    }

    public void undoLastMessage() {
        if (lastSentMessageMemento != null) {
            lastSentMessage.undoFromMemento(lastSentMessageMemento);
            System.out.printf("Last message has been deleted: %s%n", lastSentMessage.getContent());
        }
    }

    public void printChatHistory() {
        System.out.printf("Chat history for %s:%n", username);
        for (Message message : chatHistory.getMessages()) {
            if (message.getSender().equals(username)) {
                if (message == lastSentMessage && lastSentMessageMemento != null) {
                    continue;
                }
                System.out.printf("%s sent a message to %s: %s%n", message.getSender(), message.getRecipients(), message.getContent());
            }
        }
    }
}
