package Swing;
import javax.swing.*;
public class p6
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setSize(400,400);

        SpinnerModel s=new SpinnerNumberModel(7,0,11,1);
        JSpinner j=new JSpinner(s);
        j.setBounds(100,100,80,40);
        f.add(j);
        f.setLayout(null);
        f.setVisible(true);
    }
}