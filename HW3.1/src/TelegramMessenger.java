public class TelegramMessenger extends MessengerApp{
    public TelegramMessenger(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public void sendMessage() {
        System.out.print("Telegram: ");
        messageType.sendMessage();
    }
}
