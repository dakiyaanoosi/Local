package AWT;
import java.awt.*;
public class p5
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Label Demo");
        f.setSize(400,400);
        f.setBackground(Color.orange);
        Label l1=new Label("Namaste");
        l1.setBounds(150,175,100,50);
        Label l2=new Label("Pranaam");
        l2.setBounds(150,225,100,50);
        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setVisible(true);
    }
}
