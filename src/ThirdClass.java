//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//public class ThirdClass extends JPanel
//{
//    Walls[] balls3 = new Walls[10];
//    boolean blah = false;
//    public ThirdClass() {
//        setBackground(Color.BLACK);
//        balls3[0] = new Walls(250,500);
//        setFocusable(true);
//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println(e.getKeyCode());
//                if(e.getKeyCode() == 37){
//                    balls3[0].moveLeft();
//                }
//
//                if(e.getKeyCode() == 39){
//                    balls3[0].moveRight();
//                }
//
//            }
//        });
//    }
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        g.setColor(Color.WHITE);
//        g.fillRect(100, 100, 10, 500);
//        g.fillRect(100, 600, 500, 10);
//        g.fillRect(590, 100, 10, 500);
//        g.fillRect(100, 100, 100, 10);
//        g.fillRect(350, 100, 250, 10);
//        g.fillRect(100, 400, 300, 10);
//        g.fillRect(500, 400, 100, 10);
//        balls3[0].draw(g);
//        balls3[0].collision();
//        balls3[0].level1Restart();
//        balls3[0].level1RestartAgain();
//        blah = balls3[0].restart();
//        balls3[0].moves();
//
//        if(blah == false){
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            repaint();
//        }
//
//    }
//}
