package AWT;
import java.awt.*;
public class p2
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Frame in Java");
        Panel p=new Panel();

        f.setSize(500,500);
        f.setBackground(Color.orange);
        f.setLayout(null);
        
        p.setSize(100,100);
        p.setBackground(Color.red);
        
        f.add(p);
        f.setVisible(true);
    }
}
