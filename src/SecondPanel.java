//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//public class SecondPanel extends JPanel
//{
//    Walls[] balls2 = new Walls[5];
//    public SecondPanel() {
//        System.out.println("second panel contstructor");
//        setBackground(Color.BLACK);
//        balls2[0] = new Walls(250,500);
//        setFocusable(true);
//        requestFocus();
//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println(e.getKeyCode());
//                if(e.getKeyCode() == 37){
//                    balls2[0].moveLeft();
//                }
//
//                if(e.getKeyCode() == 39){
//                    balls2[0].moveRight();
//                }
//
//            }
//        });
//    }
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//
//        g.setColor(Color.WHITE);
//        g.fillRect(100, 100, 10, 500);
//        g.fillRect(100, 600, 500, 10);
//        g.fillRect(590, 100, 10, 500);
//        g.fillRect(100, 100, 100, 10);
//        g.fillRect(350, 100, 250, 10);
//        g.fillRect(100, 400, 300, 10);
//        g.fillRect(500, 400, 100, 10);
//        g.fillRect(100, 200, 100, 10);
//        g.fillRect(300, 200, 300, 10);
//        balls2[0].draw(g);
//        balls2[0].collision();
//        balls2[0].moves();
//        balls2[0].level1Restart();
//        balls2[0].level1RestartAgain();
//        boolean blah = balls2[0].end2();
//        if(blah){
//            Main.frame.getContentPane().removeAll();
//            Main.frame.getContentPane().add(new ThirdClass());
//            Main.frame.setVisible(true);
//        }
//        if(blah == false)
//        try {
//            Thread.sleep(10);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        repaint();
//
//    }
//}
