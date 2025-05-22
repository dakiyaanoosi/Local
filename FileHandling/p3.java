package FileHandling;
import java.util.Scanner;
import java.io.*;
public class p3
{
    public static void main(String[] args)
    {
        System.out.print("Directory : ");
        Scanner sc=new Scanner(System.in);
        String dir=sc.nextLine();

        File obj=new File(dir);

        if(obj.exists() && obj.isDirectory())
        {
            String arr[]=obj.list();
            for(String s: arr)
            System.out.println(s);
        }
        sc.close();
    }
}
