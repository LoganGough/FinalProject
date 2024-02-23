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
        xspeed = 1;
        yspeed = 1;
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
        else if(x > 580){
            xspeed = xspeed*-1;
        }
        else if(y < 100){
            yspeed = yspeed*-1;
        }
        else if(y > 580){
            yspeed = yspeed*-1;
        }

    }
    public void randomDirection(){

    }
    public void setPos(int xpos, int ypos){
        x = xpos;
        y = ypos;
    }
    public void direction(){
        if(x < 250){
            collision();
        }
        if(x > 250){
            collision();
        }
        if(y < 250){
            collision();
        }
        if(y > 250){
            collision();
        }
    }
    public void moving(){

        x = 100;
        y = 100;
        xspeed = 0;
        yspeed = 0;
    }
    public void finish(){
        if (x < 350 && x > 100 && y == 100){
           moving();
        }
    }




}
