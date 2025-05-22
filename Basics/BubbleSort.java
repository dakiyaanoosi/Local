package Basics;
import java.util.Scanner;

class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array : ");
        int s=sc.nextInt();
        int a[]=new int[s];

        System.out.print("Enter the numbers : ");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("\nEntered Array : [");
        for(int i=0;i<s;i++)
        {
            if(i!=s-1)
            System.out.print(a[i]+", ");
            else
            System.out.print(a[i]);
        }
        System.out.println("]");
        
        for(int i=0;i<s-1;i++)
        {
            for(int j=0;j<s-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.print("\nSorted Array : [");
        for(int i=0;i<s;i++)
        {
            if(i!=s-1)
            System.out.print(a[i]+", ");
            else
            System.out.print(a[i]);
        }
        System.out.println("]");
        sc.close();
    }
}