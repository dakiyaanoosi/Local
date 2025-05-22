package FileHandling;
import java.io.*;
public class p4
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream obj=new FileOutputStream("FileHandling/input2.txt");
        System.out.println("FileCreated");
        obj.close();
    }
}
