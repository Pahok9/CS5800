import java.util.Iterator;
import java.util.List;

public class SearchMessagesByUser implements Iterator<Message> {
    private final User targetUser;
    private int currentIndex;
    private final List<Message> messages;

    public SearchMessagesByUser(User targetUser, List<Message> messages) {
        this.targetUser = targetUser;
        this.currentIndex = 0;
        this.messages = messages;

    }

    @Override
    public boolean hasNext() {
        while (currentIndex < messages.size()) {
            Message currentMessage = messages.get(currentIndex);
            if (currentMessage.getSender().equals(targetUser) || currentMessage.getReceiver().equals(targetUser)) {
                return true;
            }
            else{
                currentIndex++;
            }
        }
        return false;
    }

    @Override
    public Message next() {
        if (hasNext()) {
            return messages.get(currentIndex++);
        }
        return null;
    }
}
