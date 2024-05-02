import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Walls
{

    public static boolean up = true;
    private int size;
    private Color color;
    public static boolean side = true;
    private int xspeed;
    private int height;
    private int yspeed;
    private int x, y;
    private int centerx, centery;




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
    public Walls(int x, int y, int width){
        this.x = x;
        this.y = y;
        this.size = width;
    }
    public Walls(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.size = width;
        this.height = height;
    }
    public void draw(Graphics g2){

        g2.setColor(color);
        g2.fillOval(x,y,size,size);

    }
    public void draw2(Graphics g2){
        g2.setColor(Color.red);
        g2.fillRect(x,y,size,10);
        g2.setColor(Color.white);


    }

public void draw3(Graphics g2){
        g2.setColor(Color.red);
        g2.fillRect(x, y, 10, height);
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
    public void reset(){
        x = 300;
        y = 550;
    }


    public void moveRight(){
        for(int i = 0;i < 21;i++) {
            x++;
        }
    }
    public void moveLeft(){
        for(int i = 0;i < 21;i++) {
            x--;
        }

    }
    public void level1Restart(){
        if(y == 400 && x < 400 && x > 100){
            reset();
        }
    }
    public void level1RestartAgain(){
        if(y==400&& x >475){
            reset();
        }
    }


    public void moves(){
        y-=.5;
    }

    public boolean restart(){

        if (x < 350 && x > 175 && y == 105) {

            return true;

        }
        else{
            return false;
        }
    }


    public boolean end2(){
        if(x > 100 && y > 590){
            return true;
        }
        return false;
    }



    public void boost(){
        y-=10;
    }
    public void slow() {
        y+=5;
    }
    public void delete(){
        x=1000;
        y=1000;
    }
public void level2Restart(){
        if(y==200&&(x<200||x >275)){
            reset();
    }
}

public void level3Restart(){
        if(y==300 && x < 500){
            reset();
        }
}
public void level4Restart(){
        if(y==500&&x>175){
            reset();
        }
}
public void pause(){
        y+=1;
}
public void laser(){

    if (y == 100) {
        up = false;
    }
    else if(y==600){
        up = true;
    }
        if(up) {
            y-=1.5;
        }
        else if(up == false){
            y+=1.5;
        }

}
public void laser2(){
        if(x==100){
            side = false;
        }
        else if(x==600){
            side = true;
        }
        if(side){
            x-=1;
        }
        else if(side == false){
            x+=1;
        }
}
public int getY(){
        return y;
}
public int getX(){
        return x;
}



}
