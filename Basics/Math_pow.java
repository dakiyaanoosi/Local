package Basics;
class Math_pow
{
    static int power(int b,int e)
    {
        if(b==0 || b==1)
        return b;
        if(e==0)
        return 1;
        if(e%2==0)
        return power(b,e/2)*power(b, e/2);
        else
        return b*power(b,e/2)*power(b, e/2);
    }
    public static void main(String[] args) {
        System.out.println(Math_pow.power(5,0));
    }
}