package Basics;
import java.util.*;
class ReverseArr2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array : ");
        int s=sc.nextInt();
        Integer a[]=new Integer[s];
        System.out.println("Enter the array....");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered Array : "+Arrays.toString(a));
        //Reversing the array.....

        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Reversed Array : "+Arrays.toString(a));
        sc.close();
    }
}