package prathamesh;

import javax.swing.*;

public class Game extends JFrame {

    public Game(){
        init();
    }

    public void init(){
        setTitle("BreakOut");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Game().setVisible(true));
    }
}
