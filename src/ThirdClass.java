import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ThirdClass extends JPanel
{

    int xp;
    int yp;

    Walls[] balls3 = new Walls[5];



    public ThirdClass() {
        setBackground(Color.BLACK);
        balls3[0] = new Walls(250, 300);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                xp = e.getX();
                yp = e.getY();
                balls3[0].setPos(xp-12, yp-12);
            }


        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                balls3[0].collision();
            }
        });

        setFocusable(true);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(100, 100, 10, 450);
        g.fillRect(100, 600, 500, 10);
        g.fillRect(590, 100, 10, 500);
        g.fillRect(100, 100, 500, 10);
        balls3[0].draw(g);
        balls3[0].collision();








        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();

    }
}
