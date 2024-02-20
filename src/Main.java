import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.setSize(800,800);

        frame.add(panel);
        frame.setVisible(true);



    }
}