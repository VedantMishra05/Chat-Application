package Servers;
import javax.swing.*;
import UI.WhatsappInterface;

public class Server extends JFrame{

    public Server() {
        new WhatsappInterface("Vedant", "icons/1.png", 200, 50);
    }
    
    public static void main(String[] args) {
        new Server();
    }
}
