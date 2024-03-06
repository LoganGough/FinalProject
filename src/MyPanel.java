import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class MyPanel extends JPanel
{



    boolean blah2 = true;
    int xp;
    int yp;

    Walls[] balls = new Walls[10];
boolean blah = false;





    public MyPanel() {
        setBackground(Color.BLACK);
        balls[0] = new Walls(250,300);


        setFocusable(true);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                xp = e.getX();
                yp = e.getY();
                balls[0].setPos(xp-12, yp-12);
            }


        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                balls[0].collision();
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
        g.fillRect(100, 100, 100, 10);
        g.fillRect(350, 100, 250, 10);

            balls[0].draw(g);
            balls[0].collision();
        blah = balls[0].restart();
            if(blah){

                Main.frame.getContentPane().removeAll();
                System.out.println("hi");

                Main.frame.getContentPane().add(new SecondPanel());
                Main.frame.setVisible(true);
            }


        if(blah == false){
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
            repaint();
        }

    }
}
