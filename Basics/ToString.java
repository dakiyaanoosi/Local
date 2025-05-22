package Basics;
public class ToString
{
    String IntToString(int n)
    {
        String s=Integer.toString(n);
        return s;
    }
    String CharToString1(char c)
    {
        String s=Character.toString(c);
        return s;
    }
    String CharToString2(char c)
    {
        String s=String.valueOf(c);
        return s;
    }
    String CharToString3(char c)
    {
        String s=c+"";
        return s;
    }
    String CharToString4(char c)
    {
        String s=new String(new char[]{c});
        return s;
    }
}
