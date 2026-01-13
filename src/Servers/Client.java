package Servers;
import UI.WhatsappInterface;

public class Client {
    public Client() {
        new WhatsappInterface("Apsara", "icons/apsara.png", 900, 50);
    }
    public static void main(String[] args) throws Exception {
        new Client();
    }
}
