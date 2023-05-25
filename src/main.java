import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        JLabel label = new JLabel();

        label.setLayout(null);
        label.setLocation(55, 55);


        JLabel label2 = new JLabel();
        label2.setLayout(null);
        label2.setLocation(300,300);

        ImageIcon player = new ImageIcon("src/testspritetransparent.png");
        ImageIcon ball = new ImageIcon("src/Ball.png");

        Image image = ball.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        ball = new ImageIcon(newimg);  // transform it back


        label.setIcon(player);
        label2.setIcon(ball);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}
