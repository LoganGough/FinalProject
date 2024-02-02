import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Today you will take an IQ test");

        ImageIcon icon = new ImageIcon();

        JOptionPane.showMessageDialog(null, "How old are you?", "IQ test", 1, icon);



//        frame.add(panel);
//
//        frame.setVisible(true);


    }
}