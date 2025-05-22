package Swing;
import javax.swing.*;
public class p1
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Frame Demo");
        f.setSize(400,400);
        JButton b=new JButton("Click me");
        b.setBounds(150,190,100,20);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
}
