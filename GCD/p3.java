package GCD;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First Number : ");
        int n1=Math.abs(sc.nextInt());
        System.out.print("Second Number : ");
        int n2=Math.abs(sc.nextInt());
        if(n1==0 && n2==0)
        {
            System.out.println("GCD not defined");
            sc.close();
            return;
        }
        while(n1!=n2)
        {
            if(n2>n1)
            n2-=n1;
            else
            n1-=n2;
        }
        System.out.println("GCD : "+n1);
        sc.close();
    }
}