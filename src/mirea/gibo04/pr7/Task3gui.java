package mirea.gibo04.pr7;

import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class Task3gui {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\slays\\Downloads\\pesiki.jpg";
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(300,250);
        f.setVisible(true);
    }
}
