package FileHandling;
import java.io.*;
class ps4
{
    public static void main(String[] args) throws IOException
    {
        DataOutputStream dis=new DataOutputStream(new FileOutputStream("i.txt"));
        for(int i=0;i<10;i++)
        {
            dis.writeInt((int)(Math.random()*100));
        }
        dis.close();

        DataInputStream dos=new DataInputStream(new FileInputStream("i.txt"));
        for(int i=0;i<10;i++)
        {
            System.out.println(dos.readInt());
        }
        dos.close();
    }
}