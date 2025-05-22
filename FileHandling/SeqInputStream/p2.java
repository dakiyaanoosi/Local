package FileHandling.SeqInputStream;
import java.io.*;
public class p2
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1=new FileInputStream("FileHandling/input.txt");
        FileInputStream f2=new FileInputStream("FileHandling/input2.txt");
        SequenceInputStream s=new SequenceInputStream(f1,f2);

        BufferedInputStream bi=new BufferedInputStream(s);
        BufferedOutputStream bo=new BufferedOutputStream(System.out);
        int j;
        while((j=bi.read())!=-1)
        bo.write((char)j);

        bo.flush();
        f1.close();
        f2.close();
    }
}
