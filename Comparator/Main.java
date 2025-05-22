package Comparator;
import java.util.Comparator;
import java.util.Arrays;
class Hello
{
    int roll;
    String name;
    Hello(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    public String toString()
    {
        return roll+" : "+name;
    }
}

class SortByRoll implements Comparator<Hello>
{
    public int compare(Hello a, Hello b)
    {
        return a.roll-b.roll;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Hello obj[]={new Hello(5,"abc"),new Hello(2,"def"),new Hello(3,"xyz")};
        Arrays.sort(obj,new SortByRoll());
        System.out.println(Arrays.toString(obj));
    }
}