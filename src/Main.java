import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static JFrame frame = new JFrame();
    public static void main(String[] args) {




        MyPanel panel = new MyPanel();
       SecondPanel panel2 = new SecondPanel();
        frame.setSize(800,800);


frame.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
        int key = e.getKeyCode();

    }
});



       frame.add(panel);

        frame.setVisible(true);


    }
}