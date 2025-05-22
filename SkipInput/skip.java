
package SkipInput;
import java.util.*;
class skip
{
    void print(String name,int age, String grade)
    {
        System.out.println("Name : "+name+"\nAge : "+age+"\nGrade : "+grade);
    }
    void print2(String name,int age)
    {
        System.out.println("Name : "+name+"\nAge : "+age);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        String grade=null;

        if(sc.hasNextLine())
        {
            sc.nextLine();
            grade=sc.nextLine();
        }

        skip t=new skip();
        
        if(!grade.isEmpty() && grade!=null)
        {
            t.print(name, age, grade);
        }
        else
        t.print2(name, age);
        sc.close();
    }
}
