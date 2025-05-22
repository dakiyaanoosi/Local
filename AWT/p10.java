package AWT;
import java.awt.*;
public class p10 {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(400,400);
        f.setBackground(Color.gray);
        Scrollbar s=new Scrollbar();
        s.setBounds(180,170,40,200);
        f.add(s);
        f.setLayout(null);
        f.setVisible(true);
    }
}
