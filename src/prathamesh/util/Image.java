package prathamesh.util;

import java.awt.*;

public class Image {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected java.awt.Image image;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public java.awt.Image getImage() {
        return image;
    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,image.getWidth(null),image.getHeight(null));
    }

    public void getDimension(){
        width = image.getWidth(null);
        height = image.getHeight(null);
    }
}
