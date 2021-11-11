package prathamesh.util;

import java.awt.*;

public class Image {
    int x;
    int y;
    int width;
    int height;
    Image image;

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

    public Image getImage() {
        return image;
    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,image.getWidth(),image.getHeight());
    }

    public void getDimension(){
        width = image.getWidth();
        height = image.getHeight();
    }
}
