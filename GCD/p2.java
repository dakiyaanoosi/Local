package GCD;
import java.util.Scanner;
public class p2  //Recommended way to find GCD using Loop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("First Number : ");
        int n1=sc.nextInt();
        System.out.print("Second Number : ");
        int n2=sc.nextInt();
        if(n1==0 && n2==0)
        {
            System.out.println("GCD not defined");
            sc.close();
            return;
        }
        while(n2!=0)
        {
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.println("GCD : "+Math.abs(n1));
        sc.close();
    }
}