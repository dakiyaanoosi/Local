package Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class p2
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setSize(1000,1000);
        JTextField tf=new JTextField();
        tf.setBounds(150,150,80,20);
        JButton b=new JButton("Click me");
        b.setBounds(40,40,600,600);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Namaste");
            }
        });
        f.add(b);
        f.add(tf);
        f.setVisible(true);
    }
}
