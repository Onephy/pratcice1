package mirea.gibo04.pr11;

import javax.swing.*;
import java.awt.*;

public class GrEx extends JFrame {
    JPanel[] panel1 = new JPanel[12];
    public GrEx(){
        super("Окошечко");
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < panel1.length ; i++){
            int r = (int)(Math.random() * 255);
            int b = (int)(Math.random() * 255);
            int g = (int)(Math.random() * 255);
            panel1[i] = new JPanel();
            panel1[i].setBackground(new Color(r,g,b));
            add(panel1[i]);
        }
        panel1[4].setLayout(new BorderLayout());
        panel1[4].add(new JButton("one"),BorderLayout.WEST);
        panel1[4].add(new JButton("two"),BorderLayout.EAST);
        panel1[4].add(new JButton("three"),BorderLayout.SOUTH);
        panel1[4].add(new JButton("four"),BorderLayout.NORTH);
        panel1[4].add(new JButton("five"),BorderLayout.CENTER);
        panel1[10].setLayout(new FlowLayout());
        panel1[10].add(new JButton("one"));
        panel1[10].add(new JButton("two"));
        panel1[10].add(new JButton("three"));
        panel1[10].add(new JButton("four"));
        panel1[10].add(new JButton("five"));

        setSize(400,300);
        setVisible(true);
    }


}
