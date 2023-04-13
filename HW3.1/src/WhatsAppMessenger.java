public class WhatsAppMessenger extends MessengerApp{
    public WhatsAppMessenger(MessageType messageType) {
        this.messageType = messageType;
    }

    public void sendMessage() {
        System.out.print("WhatsApp: ");
        messageType.sendMessage();
    }
}
