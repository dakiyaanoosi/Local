package Basics;
import java.util.*;
public class Time {
    int Hour, Second;
    void get(Scanner sc)
    {
        System.out.print("Hour : ");
        Hour=sc.nextInt();
        System.out.print("Second : ");
        Second=sc.nextInt();
    }
    void add(Time t1, Time t2)
    {
        Hour= t1.Hour+t2.Hour;
        Second = t1.Second+t2.Second;
        if(Second >=60)
        {
            Hour++;
            Second-=60;
        }
        /* 
        if(Hour <10 && Second <10)
        System.out.println("TIME : 0"+Hour+" : 0"+Second);
        if(Hour <10)
        System.out.println("TIME : 0"+Hour+" : "+Second);
        if(Second <10)
        System.out.println("TIME : "+Hour+" : 0"+Second);

        EQUIVALENT OF THESE 6 LINES IS WRITTEN BELOW
        */
        System.out.println("TIME: " + String.format("%02d : %02d", Hour, Second));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Time t1=new Time();
        t1.get(sc);
        Time t2=new Time();
        t2.get(sc);
        Time t=new Time();
        t.add(t1, t2);
    }
}
