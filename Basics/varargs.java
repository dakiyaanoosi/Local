package Basics;
class varargs
{
    void func(String ... n)
    {
        System.out.println("Number of arguments : "+n.length);
        for(String i : n)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        varargs obj=new varargs();
        obj.func();
        obj.func("akt", "akt", "akt");
        obj.func("akt", "akt", "akt","akt","akt");
    }
}