package Basics;
import java.util.Scanner;

public class NumberCheckRegex
{
    public static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String : ");
        String s=sc.nextLine();
        System.out.println(isNumeric(s));
        sc.close();
    }
}
