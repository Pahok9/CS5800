import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        if(messages.size() > 0)
            return messages.get(messages.size() - 1);
        return null;
    }

    public List<Message> getMessages() {
        return messages;
    }
}