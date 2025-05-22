package Networking;
import java.net.*;
public class Sender
{
    public static void main(String[] args) throws Exception
    {
        String str="Jai Hind";
        DatagramSocket d=new DatagramSocket();
        InetAddress i=InetAddress.getByName("127.0.0.1");
        DatagramPacket p=new DatagramPacket(str.getBytes(), str.length(), i,3000);
        d.send(p);
        d.close();
    }
}
