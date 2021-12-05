package mirea.gibo04.pr11;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {
    JTextField t1 = new JTextField(10);
    Font font1 = new Font("Calibri", Font.BOLD, 14);
    JButton but1 = new JButton("Кнопка1");
    JLabel l1 = new JLabel("Привет");
    JLabel l2 = new JLabel("Как дела?");
    public Window() {
        super("Новое окно");
        setLayout(new BorderLayout());
        setSize(300, 200);
        add(t1, BorderLayout.SOUTH);
        add(but1, BorderLayout.CENTER);
        add(l1, BorderLayout.EAST);
        add(l2, BorderLayout.WEST);
        t1.setForeground(Color.PINK);
        t1.setFont(font1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
