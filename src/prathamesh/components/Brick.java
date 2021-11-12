package prathamesh.components;

import prathamesh.util.Image;

import javax.swing.*;

public class Brick extends Image {

    private boolean isBroke;

    public Brick(int x, int y){
        create(x,y);
    }

    private void create(int x, int y){
        this.setX(x);
        this.setY(y);
        isBroke = false;
        load();
        getDimension();
    }

    private void load(){
        ImageIcon icon = new ImageIcon("src/img/brick.png");
        this.image = icon.getImage();
    }

    public boolean isBroke(){
        return isBroke;
    }

    public void setBroke(boolean broke) {
        isBroke = broke;
    }
}
