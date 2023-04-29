import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatHistory implements IterableByUser{
    private final List<Message> messages;

    public ChatHistory() {
        messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    @Override
    public Iterator<Message> iterator(User targetUser) {
        return new SearchMessagesByUser(targetUser, messages);
    }
}
