package FileHandling;
import java.io.*;
public class p8
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f=new FileWriter("FileHandling/input2.txt");
        f.write("Hello\n");
        f.close();


        FileWriter f2=new FileWriter("FileHandling/input2.txt",true); // "true" :  means that it will start writing after the content already written in the file
        f2.write("Hii\nNamaste\nJai Jinendra\n");
        f2.close();


        FileWriter f3=new FileWriter("FileHandling/input2.txt",true);
        f3.append('a');
        CharSequence a="bcd";
        f3.append(a);
        f3.close();
    }
}