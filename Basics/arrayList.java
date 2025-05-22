package Basics;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class arrayList
{
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));

        Scanner sc=new Scanner(System.in);
        System.out.print(("Enter the number you want to add : "));
        int n=sc.nextInt();
        al.add(n);
        sc.close();
        System.out.println(al);
    }
}