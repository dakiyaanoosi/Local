package AWT;
import java.awt.*;
public class p12
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
        f.add(b1,BorderLayout.CENTER);
        f.add(b2,BorderLayout.EAST);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.NORTH);
        f.add(b5,BorderLayout.SOUTH);
        f.setVisible(true);
    }
}
