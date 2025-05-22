package FileHandling.SeqInputStream;
import java.io.*;
public class p1
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1=new FileInputStream("FileHandling/input.txt");
        FileInputStream f2=new FileInputStream("FileHandling/input2.txt");
        SequenceInputStream s=new SequenceInputStream(f1,f2);

        int j;
        while((j=s.read())!=-1)
        System.out.print((char)j);

        f1.close();
        f2.close();
    }
}
