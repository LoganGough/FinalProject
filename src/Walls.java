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
    public static int count;


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

        if(x < 100){
            reset();
        }
        else if(x > 580){
            reset();
        }
        else if(y < 100){
            reset();
        }
        else if(y > 580){
            reset();
        }

    }
    public void setPos(int xpos, int ypos){
        x = xpos;
        y = ypos;
    }
    public void reset(){
        x = 250;
        y = 500;
    }

//
    public void moveRight(){
        for(int i = 0;i < 21;i++) {
            x ++;
        }
    }
    public void moveLeft(){
        for(int i = 0;i < 21;i++) {
            x--;
        }

    }


    public void moves(){
        y-=.5;
    }

    public void finish(){
        if (x < 350 && x > 150 && y == 105){
           x = 300;
           y=200;

        }
    }
    public boolean restart(){

        if (x < 350 && x > 175 && y == 105) {

            return true;

        }
        else{
            return false;
        }
    }

    public void out(){
        if(x > 500 && x < 100){
            System.out.println("hi");
        }
        else if((y > 500 && y < 100)){
            System.out.println("hi");
        }
    }
    public boolean end2(){
        if(x > 100 && y > 590){
            return true;
        }
        return false;
    }




}
