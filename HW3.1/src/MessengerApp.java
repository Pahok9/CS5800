public class MessengerApp {

}

public interface MessageType {
    void sendMessage();
}

public class TextMessage implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Text message sent.");
    }
}

public class ImageMessage implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Image sent.");
    }
}

public class VideoMessage implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Video sent.");
    }
}

public abstract class MessagingApp {
    protected MessageType messageType;

    public MessagingApp(MessageType messageType) {
        this.messageType = messageType;
    }

    public abstract void sendMessage();
}

public class WhatsAppMessagingApp extends MessagingApp {
    public WhatsAppMessagingApp(MessageType messageType) {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        System.out.print("WhatsApp: ");
        messageType.sendMessage();
    }
}

public class TelegramMessagingApp extends MessagingApp {
    public TelegramMessagingApp(MessageType messageType) {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        System.out.print("Telegram: ");
        messageType.sendMessage();
    }
}

public class FacebookMessagingApp extends MessagingApp {
    public FacebookMessagingApp(MessageType messageType) {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        System.out.print("Facebook: ");
        messageType.sendMessage();
    }
}

public class DriverProgram {
    public static void main(String[] args) {
        // Send text message via WhatsApp
        MessagingApp messagingApp = new WhatsAppMessagingApp(new TextMessage());
        messagingApp.sendMessage();

        // Send image message via Telegram
        messagingApp = new TelegramMessagingApp(new ImageMessage());
        messagingApp.sendMessage();

        // Send video message via Facebook
        messagingApp = new FacebookMessagingApp(new VideoMessage());
        messagingApp.sendMessage();
    }
}
