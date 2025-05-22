package FileHandling;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

class p5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new FileReader("FileHandling/input.txt"));
        String st;
        while((st=br.readLine())!=null)
        System.out.println(st);
        br.close();


        FileReader fr=new FileReader("FileHandling/input.txt");
        int i;
        while((i=fr.read())!=-1)
        System.out.print((char)i);
        fr.close();


        FileInputStream fin=new FileInputStream("FileHandling/input.txt");
        while((i=fin.read())!=-1)
        System.out.print((char)i);
        //Storing the content in a byte array
        byte []b=new byte[fin.available()];
        fin.read(b);
        System.out.print(new String(b));
        fin.close();


        FileReader fr2=new FileReader("FileHandling/input.txt");
        char[] charArray=new char[100];
        fr2.read(charArray);
        System.out.println(charArray);
        //or System.out.println("Character Array : "+new String(charArray));
        fr2.close();


        File f=new File("FileHandling/input.txt");
        Scanner sc=new Scanner(f);
        sc.useDelimiter("\\Z");
        System.out.println("\n"+sc.next());
        sc.close();

        
        String data=new String(Files.readAllBytes(Paths.get("FileHandling/input.txt")));
        System.out.println(data);
    }
}