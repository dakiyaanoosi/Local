package Swing;
import javax.swing.*;
public class p4
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setSize(400,400);
        JRadioButton r1=new JRadioButton("Male");
        r1.setBounds(100,100,80,20);
        JRadioButton r2=new JRadioButton("Femle");
        r2.setBounds(100,140,80,20);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        f.setLayout(null);
        f.setVisible(true);
    }
}
