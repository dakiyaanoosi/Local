package FileHandling;
import java.io.*;
class ps2
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fin=new FileInputStream("i.txt");
        FileOutputStream fout=new FileOutputStream("o.txt");

        byte b;
        while((b=(byte)fin.read())!=-1)
        fout.write(b);

        fin.close();
        fout.close();
    }
}
