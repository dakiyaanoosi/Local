package Networking;
import java.net.*;
import java.io.*;
public class p1
{
    public static void main(String[] args) throws Exception
    {
        URL url=new URL("https://en.wikipedia.org/wiki/Ram_Janmabhoomi");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());

        URLConnection urlconn=url.openConnection();
        InputStream is=urlconn.getInputStream();
        int b;
        while((b=is.read())!=-1) //Printing the entire content of the file (in the URL)
        System.out.print((char)b);
    }
}