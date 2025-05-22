package Basics;
import java.util.Scanner;
class Fibonacci
{
    void fib(int a,int b,int lim)
    {
        if(lim==0)
        return;
        int sum=a+b;
        System.out.print(sum+" ");
        fib(b, sum, lim-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Limit : ");
        int lim=sc.nextInt();
        Fibonacci f=new Fibonacci();
        System.out.print("0 1 ");
        f.fib(0, 1, lim-2);
        sc.close();
    }
}