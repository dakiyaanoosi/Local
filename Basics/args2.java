package Basics;
class args2
{
    static void hello(String []args)
    {
        for(String i : args)
        {
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        hello(args);
    }
}