package Basics;
import java.util.*;
class TernaryOperator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First number : ");
        int a=sc.nextInt();
        System.out.print("Second number : ");
        int b=sc.nextInt();
        System.out.print("Third number : ");
        int c=sc.nextInt();
        int result = a>b ? a>c ? a:c : b>c ? b:c;
        System.out.println("Max : "+result);
        sc.close();
    }
}