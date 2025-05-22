package Basics;
import java.util.Arrays;
import java.util.Scanner;

public class descendingArr {
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

        //Sorting in Descending Order using Selection Sort

        for(int i=0;i<s-1;i++)
        {
            int ind=i;
            for(int j=i+1;j<s;j++)
            {
                if(a[ind]<a[j])
                ind=j;
            }
            if(ind!=i)
            {
                int temp=a[i];
                a[i]=a[ind];
                a[ind]=temp;
            }
        }

        System.out.println("Sorted Array : "+Arrays.toString(a));
        sc.close();
    }
}
