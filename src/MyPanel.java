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
        balls[0].drawCube1(g);
//        g.fillOval(400, 400, 20, 20 );




            balls[0].draw(g);
            balls[0].direction();
//            balls[0].finish();
            boolean blah = balls[0].restart(g, balls);
            if(blah == true){

                Main.frame.getContentPane().removeAll();
                Main.frame.getContentPane().add(new SecondPanel());
                balls[0].drawCube2(g);
            }



















        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();

    }
}
