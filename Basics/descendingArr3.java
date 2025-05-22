package Basics;
import java.util.Scanner;
import java.util.Arrays;
class descendingArr3
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

        //Sorting in Descending Order using Insertion Sort

        for(int i=1;i<s;i++)
        {
            int currElement=a[i];
            int index=i-1;
            while(index>=0 && currElement>a[index])
            {
                a[index+1]=a[index];
                index--;
            }
            a[index+1]=currElement;
        }
        System.out.println("Sorted Array : "+Arrays.toString(a));
        sc.close();
    }
}