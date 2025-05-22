package Basics;
import java.util.Scanner;

class InsertionSort
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
        
        for(int i=1;i<s;i++)
        {
            int currElement=a[i];
            int index=i-1;
            while(index>=0 && a[index]>currElement)
            {
                a[index+1]=a[index];
                index--;
            }
            if(index!=(i-1))
            a[index+1]=currElement;
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