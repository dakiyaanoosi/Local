package Networking;
import java.net.*;
public class Receiver
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket s=new DatagramSocket(3000);
        byte []b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b, 1024);
        s.receive(dp);
        String str=new String(b);
        System.out.println(str);
        s.close();
    }
}
