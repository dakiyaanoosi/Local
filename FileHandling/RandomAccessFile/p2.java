package FileHandling.RandomAccessFile;
import java.io.*;
class p2
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile f=new RandomAccessFile("FileHandling/RandomAccessFile/input.txt", "rw");
        f.seek(f.length());
        f.writeBytes("MUMBAI\n");
        f.close();
    }
}
