import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel {
    Walls[] balls = new Walls[10];
    Walls[] laser = new Walls[2];


    static Font mainFont = new Font("Sanserif", Font.PLAIN, 30);
    static  Font bigFont = new Font("bigFont", Font.BOLD, 100);
    boolean blah = false;

    boolean restart = true;
    int i = 0;
    int o = 0;
    double k = 0;

    double current;
    double previous = 0;
    int level = 0;
    String timer = "";
    public MyPanel() {
        setBackground(Color.BLACK);
        for (int k = 0; k < balls.length; k++) {
            balls[k] = new Walls(300, 550);
        }
        laser[0] = new Walls(100, 150, 500);
        laser[1] = new Walls(100, 100, 10, 500);
        setFocusable(true);


        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == 37) {
                    if (o % 2 == 1) {
                        balls[i].moveLeft();
                    }
                }


                if (e.getKeyCode() == 39) {
                    if (o % 2 == 1) {
                        balls[i].moveRight();
                    }
                }
                if (e.getKeyCode() == 36) {
                    for (int j = 0; j < 20; j++) {
                        balls[i].slow();
                    }
                }
                if (e.getKeyCode() == 10) {
                    int red = (int)(Math.random()*255+1);
                    int green = (int)(Math.random()*255+1);
                    int blue = (int)(Math.random()*255+1);
                    Color rgb = new Color(red, green, blue);
                    setBackground(rgb);
                }
                if (e.getKeyCode() == 8) {
                    setBackground(Color.black);
                }
                if (e.getKeyCode() == 32) {
                    o++;
                }
                if(e.getKeyCode() == 82){
                    previous = k;
                    level = 0;
                    k = 0;
                    i = 0;
                    setBackground(Color.black);

                }


            }
        });
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


            g.setColor(Color.WHITE);
            g.fillRect(100, 100, 10, 500);
            g.fillRect(100, 600, 500, 10);
            g.fillRect(590, 100, 10, 500);
            g.fillRect(100, 100, 100, 10);
            g.fillRect(350, 100, 250, 10);
            g.fillRect(100, 400, 300, 10);
            g.fillRect(500, 400, 100, 10);
            if (i < 4) {
                if (level != 4)
                    k += .016;

            }


            timer = "" + (int) (k);
            g.setFont(mainFont);
            String message = "Stage " + (level + 1) + "\n" + "level " + (i + 1);
            g.drawString(timer, 700, 50);
            g.drawString(message, 275, 50);



                balls[i].draw(g);
                balls[i].collision();
                balls[i].level1Restart();
                balls[i].level1RestartAgain();
                blah = balls[i].restart();
                balls[i].moves();
                if (level == 1) {
                    laser[0].draw2(g);
                    laser[0].laser();
                    int ballY = balls[i].getY();
                    int laserY = laser[0].getY();


                    if (o % 2 == 0) {


                    } else if ((ballY == laserY) || ballY == laserY + 1 || ballY == laserY - 1) {
                        balls[i].reset();
                    }
                }


                if (blah) {
                    i++;
                    blah = false;
                }
                if (i == 1) {
                    g.fillRect(100, 200, 100, 10);
                    g.fillRect(300, 200, 300, 10);


                    balls[i].level2Restart();
                }
                if (i == 2) {


                    g.fillRect(100, 200, 100, 10);
                    g.fillRect(300, 200, 300, 10);
                    g.fillRect(100, 300, 400, 10);
                    balls[i].level2Restart();
                    balls[i].level3Restart();
                }
                if (i == 3) {


                    g.fillRect(100, 200, 100, 10);
                    g.fillRect(300, 200, 300, 10);
                    g.fillRect(100, 300, 400, 10);
                    g.fillRect(200, 500, 400, 10);
                    balls[i].level2Restart();
                    balls[i].level3Restart();
                    balls[i].level4Restart();


                }
                if (i == 4) {
                    level++;
                    i = 0;


                }
                if (o % 2 == 0) {
                    balls[i].pause();


                }
                if (level == 2) {
                    laser[0].draw2(g);
                    laser[0].laser();
                    int ballX = balls[i].getX();
                    int laserX = laser[1].getX();
                    laser[1].draw3(g);
                    laser[1].laser2();


                    int ballY = balls[i].getY();
                    int laserY = laser[0].getY();


                    if (o % 2 == 0) {


                    } else if ((ballY == laserY) || ballY == laserY + 1 || ballY == laserY - 1) {
                        balls[i].reset();
                    }
                    if (o % 2 == 0) {


                    } else if (ballX == laserX || ballX == laserX - 1 || ballX == laserX + 1 ||
                            ballX == laserX + 2 || ballX == laserX - 2 || ballX == laserX + 3 || ballX == laserX - 3 ||
                            ballX == laserX + 4 || ballX == laserX - 4 || ballX == laserX + 5 ||
                            ballX == laserX - 5 || ballX == laserX + 6 || ballX == laserX - 6 ||
                            ballX == laserX + 7 || ballX == laserX - 7 || ballX == laserX + 8 ||
                            ballX == laserX - 8 || ballX == laserX + 9 || ballX == laserX - 9 ||
                            ballX == laserX + 10 || ballX == laserX - 10 || ballX == laserX + 11 ||
                            ballX == laserX - 11 || ballX == laserX + 12 || ballX == laserX - 12 ||
                            ballX == laserX + 13 || ballX == laserX - 13 || ballX == laserX + 14 ||
                            ballX == laserX - 14 || ballX == laserX + 15 || ballX == laserX - 15) {
                        balls[i].reset();
                    }
                }
                if (level == 3) {
                    laser[0].draw2(g);
                    laser[0].laserFast();
                    int ballX = balls[i].getX();
                    int laserX = laser[1].getX();
                    laser[1].draw3(g);
                    laser[1].laser2Fast();


                    int ballY = balls[i].getY();
                    int laserY = laser[0].getY();


                    if (o % 2 == 0) {


                    } else if ((ballY == laserY) || ballY == laserY + 1 || ballY == laserY - 1) {
                        balls[i].reset();
                    }
                    if (o % 2 == 0) {


                    } else if (ballX == laserX || ballX == laserX - 1 || ballX == laserX + 1 ||
                            ballX == laserX + 2 || ballX == laserX - 2 || ballX == laserX + 3 || ballX == laserX - 3 ||
                            ballX == laserX + 4 || ballX == laserX - 4 || ballX == laserX + 5 ||
                            ballX == laserX - 5 || ballX == laserX + 6 || ballX == laserX - 6 ||
                            ballX == laserX + 7 || ballX == laserX - 7 || ballX == laserX + 8 ||
                            ballX == laserX - 8 || ballX == laserX + 9 || ballX == laserX - 9 ||
                            ballX == laserX + 10 || ballX == laserX - 10 || ballX == laserX + 11 ||
                            ballX == laserX - 11 || ballX == laserX + 12 || ballX == laserX - 12 ||
                            ballX == laserX + 13 || ballX == laserX - 13 || ballX == laserX + 14 ||
                            ballX == laserX - 14 || ballX == laserX + 15 || ballX == laserX - 15) {
                        balls[i].reset();
                    }

                }
                if (level == 4 && i == 0) {

                    String jo = "" + (int) (k);
                    g.setColor(Color.black);

//                    if(k < previous){
//                        previous = k;
//                        String temp = "High Score: " + previous;
//                        g.drawString(temp, 350, 250);
//                    }
//                    else{
//                        g.drawString(jo, 350, 250);
//                    }

                    g.drawString("you're done", 350, 350);
                    g.drawString(jo, 350, 250);
                    g.setFont(bigFont);
                    setBackground(Color.white);


                }



        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();
    }


}


