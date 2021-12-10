package mirea.gibo04.pr12;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;



public class Gif extends JFrame {

    private JLabel label1;
    private int a = 1;

    private Gif(){
        this.setSize(900, 1200);
        label1 = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        getContentPane().add(label1);

        Timer timer = new Timer(1100, e -> nextImg());
        timer.start();
    }

    private void nextImg(){
        label1.setIcon(new ImageIcon(getClass().getResource((++a)+".jpg")));
        if(a == 5) a = 0;
    }

    public static void main(String[] args) {
        Gif images = new Gif();
        images.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        images.setVisible(true);
    }
}


