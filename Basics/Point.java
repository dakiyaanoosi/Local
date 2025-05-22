package Basics;
import java.util.Scanner;
class Point
{
    Double x,y;
    void get(Scanner sc)
    {
        System.out.print("x : ");
        x=sc.nextDouble();
        System.out.print("y : ");
        y=sc.nextDouble();
    }
    void add(Point p1,Point p2)
    {
        x=(p1.x+p2.x)/2.0;
        y=(p1.y+p2.y)/2.0;
        System.out.println("Result : ( "+x+", "+y+")");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Point p1=new Point();
        System.out.println("Coordinate 1");
        p1.get(sc);
        Point p2=new Point();
        System.out.println("Coordinate 2");
        p2.get(sc);
        Point p=new Point();
        p.add(p1, p2);
    }
}