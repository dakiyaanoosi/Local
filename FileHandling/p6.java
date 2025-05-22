package FileHandling;
import java.io.*;
import java.nio.file.*;
public class p6
{
    public static void main(String[] args) throws IOException
    {
        String text="Jai Shree Ram\nJai Hanuman\nJai Ghanshyam\nJai Mahakal";
        Path obj=Path.of("FileHandling/input2.txt");
        Files.writeString(obj,text);

        String fileContent=Files.readString(obj);
        System.out.println("File Content : "+fileContent);

        FileOutputStream obj2=new FileOutputStream("FileHandling/file.txt");
        byte b[]=text.getBytes();
        obj2.write(b);
        obj2.close();
    }
}
