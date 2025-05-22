package Basics;
import java.util.Scanner;
public class TwoDarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [][]a=new int[5][];

        int even=0,odd=0;
        int c;
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Size : ");
            c=sc.nextInt();
            a[i]=new int[c];
            System.out.println("Enter the elements : ");
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Printing : ");

        for(int ar[] : a)
        {
            for(int arb : ar)
            {
                if(arb%2==0)
                even++;
                else
                odd++;
                System.out.print(arb+" ");
            }
            System.out.println();
        }
        System.out.printf("Even : %d\nOdd : %d",even,odd);
        sc.close();
    }
}
