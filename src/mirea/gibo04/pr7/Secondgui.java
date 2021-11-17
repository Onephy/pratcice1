package mirea.gibo04.pr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Secondgui {
    public static void main(String[] args) {
        JFrame f = new JFrame("Second task");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.GRAY);
        p1.setPreferredSize(new Dimension(450,200));
        JLabel l1 = new JLabel("Надпись 1");
        l1.setFont(new Font("Serif", Font.PLAIN, 24)); // Изменение шрифта
        l1.setForeground(Color.GREEN); // Изменение цвета текста
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.PINK);
        p2.setPreferredSize(new Dimension(500,250));
        JLabel l2 = new JLabel("Надпись 2");
        l2.setFont(new Font("Calibri", Font.BOLD, 32)); // Изменение шрифта
        l2.setForeground(Color.RED); // Изменение цвета текста
        p2.add(l2);

        JPanel osn = new JPanel();
        osn.setBackground(Color.BLUE);
        osn.add(p1);
        osn.add(p2);
        f.getContentPane().add(osn);
        f.pack();
        f.setVisible(true);
    }
}
