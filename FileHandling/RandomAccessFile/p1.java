package FileHandling.RandomAccessFile;
import java.io.*;
class p1
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile f=new RandomAccessFile("input.txt","rw");
        f.writeInt(7);
        f.writeDouble(7.54);
        f.writeChar(65);
        f.seek(0); // Control goes to the beginning
        System.out.println(f.readInt());
        System.out.println(f.readDouble());
        System.out.println(f.readChar());
        f.seek(2);
        System.out.println(f.readInt());
        f.seek(f.length());
        f.writeBoolean(true);
        f.seek(f.length()-1);
        System.out.println(f.readBoolean());
        f.close();
    }
}
