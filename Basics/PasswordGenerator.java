package Basics;
import java.security.SecureRandom;
import java.util.Scanner;
class PasswordGenerator
{
    static final Scanner sc=new Scanner(System.in);
    int getInput(int input)
    {
        System.out.print("Required Password length (default:16) : ");
        String p=sc.nextLine();
        if(p.isEmpty())
        return input;
        else
        {
            for(int i=0;i<p.length();i++)
            {
                if(!Character.isDigit(p.charAt(i)))
                return input;
            }
            input=Integer.parseInt(p);
            return input;
        }
    }
    String generate()
    {
        int input=16;
        String password="";
        input=getInput(input);
        String arr[]={"ABCDEFGHIJKLMNOPQRSTUVWXYZ","abcdefghijklmnopqrstuvwxyz","0123456789","!@#$&%"};
        SecureRandom sr=new SecureRandom();
        for(int i=0;i<input;i++)
        {
            int index=sr.nextInt(4);
            password+=arr[index].charAt(sr.nextInt(arr[index].length()));
        }
        return password;
    }

    public static void main(String[] args) {
        PasswordGenerator obj=new PasswordGenerator();
        System.out.println("Password : "+obj.generate());
        sc.close();
    }
}