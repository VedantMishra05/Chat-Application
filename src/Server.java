import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Server extends JFrame implements ActionListener{

    public Server() {

        // Settign the layout to border
        setLayout(null);

        // Adding top panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        add(p1);

        // Adding back button to the green header
        JLabel back = iconLabel("icons/3.png", 5, 20, 25, 25);
        p1.add(back);
        // Adding an event listner to the back button -> exits the program
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        // Adding profile pic
        p1.add(iconLabel("icons/1.png", 40, 10, 50, 50));

        // Adding video icon
        p1.add(iconLabel("icons/video.png", 300, 20, 30, 30));

        // Adding phone icon
        p1.add(iconLabel("icons/phone.png", 360, 20, 30, 30));

        // Adding morvert(3 dots) icon
        p1.add(iconLabel("icons/3icon.png", 420, 20, 10, 25));

        // Adding name
        p1.add(textLabel("Vedant", 110, 15, 100, 18, 18));
        
        // Adding status (active now)\
        p1.add(textLabel("Active Now", 110, 35, 100, 18, 10));



        // Creating new panel
        JPanel p2 = new JPanel();
        p2.setBounds(5, 75, 440, 570);
        add(p2);
        
        JTextField text = new JTextField();
        text.setBounds(5, 655, 310, 40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(text);
        
        
        JButton btn = new JButton("Send");
        btn.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        btn.setBounds(320, 655, 123, 40);
        btn.setOpaque(true);
        btn.setBorderPainted(false);
        btn.setBackground(new Color(7, 94, 84));
        btn.setForeground(Color.WHITE);
        add(btn);
        
        // Setting the size of the window
        setSize(450, 700);
        setLocation(200, 50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        
        // Making the window visible
        setVisible(true);
    }
    
    // Function to create label in the desired location with file paths
    public JLabel textLabel(String text, int x, int y, int width, int height, int fontSize) {
        JLabel element = new JLabel(text);
        element.setBounds(x, y, width, height);
        element.setForeground(Color.WHITE);
        element.setFont(new Font("SAN_SERIF", Font.BOLD, fontSize));
        return element;
    }

    // Function to create icon label in the desired location with file paths
    public JLabel iconLabel(String filePath, int x, int y, int width, int height) {
        JLabel element = setImage(filePath);
        element.setBounds(x, y, width, height);
        return element;
    }

    // Function to return a label with scaled image
    public JLabel setImage(String filePath) {
        // Adding back button to the green header
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(filePath));
        Image i2 = (filePath.equals("icons/3icon.png")) ? i1.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT)  : i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        return back;
    }
    
    public static void main(String[] args) {
        new Server();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
