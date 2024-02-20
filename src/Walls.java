import java.awt.*;

public class Walls
{

    private int size;
    private Color color;
    private int xspeed;
    private int yspeed;
    private int x, y;
    private int centerx, centery;
    private int radius;
    private int speed;





    public Walls(int x, int y){
        centerx = x + size;
        centery = y + size;
        this.x = x;
        this.y = y;
        size = 25;
        xspeed = 2;
        yspeed = 2;
        int random1 = (int)(Math.random()*200)+1;
        int random2 = (int)(Math.random()*200)+1;
        int random3 = (int)(Math.random()*200)+1;
        color = new Color(255, 255, 255);
    }
    public void draw(Graphics g2){

        g2.setColor(color);
        g2.fillOval(x,y,size,size);

    }


    public void collision(){
        x+= xspeed;
        y+= yspeed;
        if(x < 100){
            xspeed = xspeed*-1;
        }
        else if(x > 520){
            xspeed = xspeed*-1;
        }
        else if(y < 100){
            yspeed = yspeed*-1;
        }
        else if(y > 520){
            yspeed = yspeed*-1;
        }
        else if (x < 250 && x > 100){
            xspeed = xspeed;
        }
    }
    public void randomDirection(){

    }



}