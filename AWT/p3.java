package AWT;
import java.awt.*;
public class p3
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Button Demo");
        f.setSize(400,400);
        f.setBackground(Color.yellow);
        Button b=new Button("Click me");
        b.setBounds(160,190,80,20);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
}