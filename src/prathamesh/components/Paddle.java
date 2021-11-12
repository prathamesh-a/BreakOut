package prathamesh.components;

import prathamesh.util.Config;
import prathamesh.util.Image;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Paddle extends Image {

    private int dirX;

    public Paddle(){
        create();
    }

    private void create(){
        load();
        getDimension();
        reset();
    }

    private void load(){
        ImageIcon icon = new ImageIcon("src/img/paddle.png");
        image = icon.getImage();
    }

    public void move(){
        x += dirX;
        if (x<=0)x=0;
        if (x>= Config.WIDTH - width)x=Config.WIDTH-width;
    }

    public void key(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)dirX = -1;
        if (key == KeyEvent.VK_RIGHT)dirX = 1;
    }

    public void keyRelease(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)dirX = 0;
        if (key == KeyEvent.VK_RIGHT)dirX = 0;
    }

    private void reset(){
        x= Config.PADDLE_X;
        y= Config.PADDLE_Y;
    }
}
