package SkipInput;
//Program to skip the input for a specific variable

import java.util.Scanner;
class Student
{
    String name;
    int age;
    String grade;
    
    //Default Constructor 1
    Student(String name,int age,String grade)
    {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    //Default Constructor 2
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }


    void displayInfo()
    {
        System.out.println("Name : "+name+"\nAge : "+age);
        if(!grade.isEmpty() && grade!=null)
        {
            System.out.print("Grade : "+grade);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        
        String grade=null;
        if(sc.hasNextLine()) //This checks whether there is another line of input available in the scanner's input stream.
                            //If the user hasn't provided any further input, the condition will be false, and the code inside won't execute.
        {
            sc.nextLine(); //Consume the remaining newline after the previous input
            grade=sc.nextLine(); //Read the actual next line for the grade
        }

        Student student;
        if(grade==null || grade.isEmpty())
        {
            student =new Student(name,age);
            student.displayInfo();
        }
        else
        {
            student =new Student(name,age,grade);
            student.displayInfo();
        }
        sc.close();
    }   
}