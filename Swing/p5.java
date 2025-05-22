package Swing;
import javax.swing.*;
public class p5
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setSize(400,400);
        JOptionPane o=new JOptionPane("Welcome to Hindu Rashtra");
        o.setBounds(200,200,200,200);
        f.add(o);
        f.setLayout(null);
        f.setVisible(true);
    }
}
