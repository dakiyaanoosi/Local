package GCD;
import java.util.Scanner;
public class p1  //Recommended way to find GCD using Recursion
{
    static int gcd(int a,int b)
    {
        if(a==0 && b==0) return -1;
        if(b==0) return Math.abs(a);
        return gcd(b,a%b);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("First Number : ");
        int n1=sc.nextInt();
        System.out.print("Second Number : ");
        int n2=sc.nextInt();
        System.out.println("GCD : "+gcd(n1,n2));
        sc.close();
    }
}