package AWT;
import java.awt.*;
public class p7
{
    public static void main(String[] args)
    {
        Frame f=new Frame("TextArea Demo");
        f.setSize(400,400);
        f.setBackground(Color.orange);
        TextArea t=new TextArea();
        t.setBounds(10,100,360,100);
        f.add(t);
        f.setLayout(null);
        f.setVisible(true);
    }
}
