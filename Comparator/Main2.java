package Comparator;
import java.util.Arrays;
import java.util.Comparator;
class Student
{
    Integer roll;
    String name;
    Student(Integer roll, String name)
    {
        this.roll=roll;
        this.name=name;
    }
    public String toString()
    {
        return roll+" : "+name;
    }
}
class sort implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        int sortByRoll = a.roll.compareTo(b.roll);
        int sortByName = a.name.compareTo(b.name);

        return sortByRoll!=0 ? sortByRoll : sortByName;
    }
}
class Main2
{
    public static void main(String[] args)
    {
        Student[] obj={new Student(1, "abc"),new Student(2,"ghi"),new Student(2,"def")};
        Arrays.sort(obj, new sort());
        System.out.println(Arrays.toString(obj));
    }
}