package mirea.gibo04.pr7;

import java.awt.*;
import javax.swing.*;

public class Gui extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Hello World");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 155));
        panel.setBackground(Color.GREEN);
        JLabel label = new JLabel("Привет, Мир!");
        panel.add(label);
        f.getContentPane().add(panel);
        f.pack();
        f.setVisible(true);
    }

}
