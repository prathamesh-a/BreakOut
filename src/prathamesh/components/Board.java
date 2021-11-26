package prathamesh.components;

import prathamesh.listener.keyListener;
import prathamesh.util.Config;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private Brick[] bricks;
    private Ball ball;
    private Paddle paddle;

    public Board(){
        boardInit();
    }

    private void boardInit(){
        addKeyListener(new keyListener());
        setFocusable(true);
        setPreferredSize(new Dimension(Config.WIDTH, Config.HEIGHT));
        start();
    }

    private void start(){
        bricks = new Brick[Config.BRICKS];
        ball = new Ball();
        paddle = new Paddle();
        int b = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                bricks[b] = new Brick(j * 40 + 30, i * 10 + 50);
                b++;
            }
        }
    }

    public void printComponent(){

    }


}
