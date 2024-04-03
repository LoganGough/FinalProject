import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel
{
    Walls[] balls = new Walls[10];
boolean blah = false;
    public MyPanel() {
        setBackground(Color.BLACK);
        balls[0] = new Walls(250,500);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 37){
                    balls[0].moveLeft();
                }

                if(e.getKeyCode() == 39){
                    balls[0].moveRight();
                }

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
        g.fillRect(100, 400, 300, 10);
        g.fillRect(500, 400, 100, 10);
            balls[0].draw(g);
            balls[0].collision();
            balls[0].level1Restart();
            balls[0].level1RestartAgain();
            blah = balls[0].restart();
        balls[0].moves();
            if(blah){
                Main.frame.getContentPane().removeAll();
                Main.frame.getContentPane().add(new SecondPanel());
                Main.frame.setVisible(true);
            }
        if(blah == false){
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
            repaint();
        }

    }
}
