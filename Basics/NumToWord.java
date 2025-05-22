package Basics;
import java.util.*;
public class NumToWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number (1-1000) : ");
        int n=sc.nextInt();
        String s="";
        String [] a={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String [] b={"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};
        String [] c={"Ten","Eleven","Twelve","Thriteen","Fourteen","Fifteen","Sixteen","seventeen","Eighteen","Ninteen"};
        if(n>1000)
        System.out.print("Number out of Range");
        else if(n==0)
        System.out.print("Zero");
        else
        {
            if(n==1000)
            System.out.print("One Thousand");
            else
            {
                if(n>=100)
                {
                    int nh=n/100;
                    s+=a[nh]+" Hundred ";
                    n=n%100;
                }
                if(n>=20)
                {
                    int nh=n/10;
                    s+=b[nh]+" ";
                    n=n%10;
                }
                if(n>=10 && n<20)
                {
                    s+=c[n-10];
                }
                if(n<10)
                {
                    s+=a[n];
                }
            }
        }
        System.out.println(s);
        sc.close();
    }
}
