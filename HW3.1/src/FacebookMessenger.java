public class FacebookMessenger extends MessengerApp {
    public FacebookMessenger(MessageType messageType) {
        this.messageType = messageType;
    }

    public void sendMessage() {
        System.out.print("Facebook: ");
        messageType.sendMessage();
    }
}
