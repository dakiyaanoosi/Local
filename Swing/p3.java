package Swing;
import java.awt.Color;

import javax.swing.*;
public class p3
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setSize(400,400);
        JLabel l=new JLabel("Enter Password : ");
        l.setBounds(50,100,100,20);
        JPasswordField p=new JPasswordField();
        p.setBounds(180,100,80,20);
        f.setBackground(Color.red);
        f.add(l);
        f.add(p);
        f.setLayout(null);
        f.setVisible(true);
    }
}
