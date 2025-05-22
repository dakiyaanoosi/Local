package Basics;
import java.util.*;
class Array3D
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st dimension : ");
        int k=sc.nextInt();
        System.out.print("Enter the 2nd dimension : ");
        int l=sc.nextInt();
        System.out.print("Enter the 3rd dimension : ");
        int m=sc.nextInt();
        int a[][][]=new int[k][l][m];
        int n,o,p;
        for(n=0;n<k;n++)
        {
            for(o=0;o<l;o++)
            {
                for(p=0;p<m;p++)
                {
                    System.out.println("Enter : "+(n+1)+", "+(o+1)+", "+(p+1)+" :");
                    a[n][o][p]=sc.nextInt();
                }
            }
        }
        System.out.println("PRINTING : ");
        for(n=0;n<k;n++)
        {
            for(o=0;o<l;o++)
            {
                for(p=0;p<m;p++)
                {
                    System.out.print(a[n][o][p]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}