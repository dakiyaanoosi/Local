package AWT;
import java.awt.*;
public class p13
{
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(400,400);
        f.setBackground(Color.pink);
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.setLayout(new GridLayout(2,3));
        f.setVisible(true);
    }
}
