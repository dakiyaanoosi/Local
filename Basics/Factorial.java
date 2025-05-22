package Basics;
import java.util.Scanner;
public class Factorial
{
    int factorial(int n) 
    {
        if(n==1 || n==0)
        return 1;
        return(n*factorial(n-1));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Find the factorial of : ");
        int n=sc.nextInt();
        Factorial f=new Factorial();
        System.out.println("Factorial : "+f.factorial(n));
        sc.close();
    }  
}
