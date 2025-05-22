package Basics;
class incre_decrement
{
    public static void main(String[] args) {
        int a=2,b=4;
        int c= ++a + b++; // the value of a and b are ACTUALLY changed (increamented) !!
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }

}