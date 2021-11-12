package prathamesh.components;

import prathamesh.util.Config;
import prathamesh.util.Image;

import javax.swing.*;

public class Ball extends Image {

    private int dirX;
    private int dirY;

    public Ball(){
        create();
    }

    private void create(){
        dirX = 1;
        dirY = -1;
        load();
        getDimension();
        reset();
    }

    private void load(){
        ImageIcon icon = new ImageIcon("src/img/ball.png");
        image = icon.getImage();
    }

    public void move(){
        x += dirX;
        y += dirY;

        if (x == 0)setDirX(1);
        if (x == Config.WIDTH - width)setDirX(-1);
        if (y==0)setDirY(1);
    }

    public int getDirX() {
        return dirX;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public int getDirY() {
        return dirY;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    private void reset(){
        x = Config.BALL_X;
        y = Config.BALL_Y;
    }
}
