public class Main {

    public static void main(String[] args) {
        MessengerApp whatsApp = new WhatsAppMessenger(new TextMessage());
        whatsApp.sendMessage();
        whatsApp = new WhatsAppMessenger(new ImageMessage());
        whatsApp.sendMessage();

        MessengerApp telegram = new TelegramMessenger(new ImageMessage());
        telegram.sendMessage();

        MessengerApp facebook = new FacebookMessenger(new VideoMessage());
        facebook.sendMessage();
    }
}
