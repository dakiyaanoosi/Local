package Basics;
import java.util.Scanner;

class SelectionSort
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
            int index=i;
            for(int j=i+1;j<s;j++)
            {
                if(a[index]>a[j])
                index=j;
            }
            if(index!=i)
            {
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
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