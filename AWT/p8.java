package AWT;
import java.awt.*;
public class p8
{
    public static void main(String[] args) {
        Frame f=new Frame("List Demo");
        f.setSize(400,400);
        f.setBackground(Color.red);
        List l=new List();
        l.setBounds(160,150,80,100);
        l.add("Apple");
        l.add("Banana");
        l.add("Peaches");
        l.add("WaterMelon");
        l.add("Mango");
        l.add("Guava");
        f.add(l);
        f.setLayout(null);
        f.setVisible(true);
    }
}
