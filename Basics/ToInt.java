package Basics;
public class ToInt
{
    Integer StringToInt(String s)
    {
        int n=Integer.parseInt(s);
        return n;
    }
    Integer CharToInt1(char c)
    {
        int n=Character.getNumericValue(c);
        return n;
    }
    Integer CharToInt2(char c)
    {
        int n=c-'0';
        return n;
    }
    Integer CharToInt3(char c)
    {
        int n=Integer.parseInt(String.valueOf(c));
        return n;
    }
}
