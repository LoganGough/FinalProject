import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static JFrame frame = new JFrame();
    public static void main(String[] args) {




        MyPanel panel = new MyPanel();

        frame.setSize(800,800);






       frame.add(panel);

        frame.setVisible(true);






    }
}