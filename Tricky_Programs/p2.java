package Tricky_Programs;

class p2
{
    static void pattern(int n)
    {
        StringBuilder str=new StringBuilder("1");
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            System.out.println(str);
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                int count=0;
                while(j<str.length() && str.charAt(j)==ch)
                {
                    j++;
                    count++;
                }
                j--;
                ns.append(count).append(ch);
            }
            str.setLength(0);
            str.append(ns);
            ns.setLength(0);
        }
    }
    public static void main(String[] args)
    {
        p2.pattern(6);
    }
}
