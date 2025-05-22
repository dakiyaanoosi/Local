package Basics;
import java.util.Scanner;
import java.util.Arrays;
class ReverseArr
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array : ");
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter the array....");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered Array : "+Arrays.toString(a));
        //Reversing the array.....

        for(int i=0;i<s/2;i++)
        {
            int temp=a[i];
            a[i]=a[s-1-i];
            a[s-1-i]=temp;
        }
        System.out.println("Reversed Array : "+Arrays.toString(a));
        sc.close();
    }
}