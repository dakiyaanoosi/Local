package AWT;
import java.awt.*;
public class p6
{
    public static void main(String[] args)
    {
        Frame f=new Frame("TextField Demo");
        f.setSize(400,400);
        f.setBackground(Color.orange);
        TextField t1=new TextField("Type.......");
        t1.setBounds(150,175,100,20);
        TextField t2=new TextField("Type.......");
        t2.setBounds(150,225,100,20);
        f.add(t1);
        f.add(t2);
        f.setLayout(null);
        f.setVisible(true);
    }
}
