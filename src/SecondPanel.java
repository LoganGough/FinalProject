import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SecondPanel extends JPanel
{

    Walls[] balls2 = new Walls[5];



    public SecondPanel() {
        setBackground(Color.BLACK);
        balls2[0] = new Walls(250, 300);


        setFocusable(true);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        balls2[0].drawCube2(g);




















        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();

    }
}
