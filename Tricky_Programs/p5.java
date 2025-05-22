package Tricky_Programs;
class p5
{
    static String pattern(String s)
    {
        StringBuilder str=new StringBuilder();
        int n=s.charAt(0)-'0';
        int index=2;
        while(s.charAt(index)!=']')
        {
            if(Character.isDigit(s.charAt(index)))
            {
                int l=s.indexOf("]",index);
                str.append(pattern(s.substring(index,l+1)));
                index=l;
            }
            else
            str.append(s.charAt(index));
            index++;
        }
        String temp="";
        if(index+1<s.length())
        {
            temp=pattern(s.substring(index+1,s.length()));
        }
        return str.toString().repeat(n)+temp;
    }
    public static void main(String[] args)
    {
        System.out.println(pattern("3[a2[bc]d]"));
    }
}