package FileHandling;
import java.io.*;
class ps3
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("i.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);

        dos.writeInt(7);
        dos.writeDouble(7.54);
        dos.writeChar(65);
        dos.close();


        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readChar());
        dis.close();
    }
}
