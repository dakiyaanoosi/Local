package Basics;
public class Bitwise
{
    public static void main(String[] args) {
        int a=0b1010;   //Prefix 0b is used to declare that this is a boolean literal otherwise this number will be treated as decimal.
        int b=0b1101;
        System.out.println(a&b); // AND : Output - 8
        System.out.println(a|b); // OR : Output - 15
        System.out.println(a^b); // XOR : Output - 7
        System.out.println(~b); // Complement : Output - (-14)
        int c=10;
        System.out.println(c<<3); // (Left shift) Output : 10x2^3 = 80
        System.out.println(c>>3); // (Signed right shift) : 10/(2^3) = 1
    }
}
