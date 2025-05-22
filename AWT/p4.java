package AWT;
import java.awt.*;
public class p4
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Checkbox Demo");
        f.setSize(400,400);
        f.setBackground(Color.yellow);
        Checkbox c1=new Checkbox("C++");
        c1.setBounds(140,190,80,20);
        f.add(c1);
        Checkbox c2=new Checkbox("Java");
        c2.setBounds(220,190,80,20);
        f.add(c2);
        f.setLayout(null);
        f.setVisible(true);
    }
}
