package SnakeGame;
import javax.swing.*;
public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake Game");
        add(new Board());   // Board has created as a panel
        pack();     //change the function on frame to reflect
//        setLocation(100, 100);
//        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);

    }
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
