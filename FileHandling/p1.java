package FileHandling;
import java.io.*;
import java.util.Scanner;
class p1
{
    public static void main(String[] args) throws IOException, FileNotFoundException {

        File obj=new File("FileHandling/input.txt");
        if(obj.createNewFile())
        System.out.println("FileCreated");

        FileWriter obj2=new FileWriter("FileHandling/input.txt");
        obj2.write("Hello my name is Avinish. ");
        obj2.write("I'm 20 years old.\nJai Hind. ");
        obj2.close();
        System.out.println("Written successfully");

        FileReader obj3=new FileReader("FileHandling/input.txt");
        Scanner sc=new Scanner(obj3);
        while(sc.hasNextLine())
        {
            String data=sc.nextLine();
            System.out.println("Content inside "+obj.getName()+" : "+data);
        }
        sc.close();
        obj3.close();


        System.out.println("Deleting the file.......");
        obj.delete();
        System.out.println("Deleted Successfully");
    }
}
