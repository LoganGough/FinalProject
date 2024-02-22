import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class MyPanel extends JPanel
{


    int xp;
    int yp;

    Walls[] balls = new Walls[10];




    public MyPanel() {
        setBackground(Color.BLACK);
        for(int i = 0;i < 10;i++){
            balls[i] = new Walls(250,300);
        }


        setFocusable(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                System.out.println("hi");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                xp = e.getX();
                yp = e.getY();
                balls[0].setPos(xp-12, yp-12);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//                xp = e.getX();
//                yp = e.getY();
            }


        });
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(100, 100, 10, 500);
        g.fillRect(100, 600, 500, 10);
        g.fillRect(590, 100, 10, 500);
        g.fillRect(100, 100, 250, 10);
        g.fillRect(490, 100, 100, 10);
//        g.fillOval(400, 400, 20, 20 );




            balls[0].draw(g);
            balls[0].direction();



















        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();

    }
}
