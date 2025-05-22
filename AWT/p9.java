package AWT;
import java.awt.*;
public class p9
{
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(400,400);
        f.setBackground(Color.gray);
        Choice c=new Choice();
        c.setBounds(160,190,80,20);
        c.add("Choice 1");
        c.add("Choice 2");
        c.add("Choice 3");
        c.add("Choice 4");
        f.add(c);
        f.setLayout(null);
        f.setVisible(true);
    }
}
