package Basics;
import java.util.Arrays;
import java.util.Scanner;

class descendingArr2
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

        //Sorting in Descending Order using Bubble Sort

        for(int i=0;i<s-1;i++)
        {
            for(int j=0;j<s-1-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(a));
        sc.close();
    }
}