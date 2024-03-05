import javax.swing.*;

public class Main {
    public static JFrame frame = new JFrame();
    public static void main(String[] args) {




        MyPanel panel = new MyPanel();
       SecondPanel panel2 = new SecondPanel();
        frame.setSize(800,800);






       frame.add(panel);

        frame.setVisible(true);


    }
}