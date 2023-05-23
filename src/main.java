import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("This is the label");

        ImageIcon ball = new ImageIcon("src/Ball.png");

        Image image = ball.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        ball = new ImageIcon(newimg);  // transform it back


        label.setIcon(ball);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}
