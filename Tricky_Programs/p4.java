package Tricky_Programs;
class p4
{
    static void pattern(int n)
    {
        int start=1;
        for(int i=1;i<=n;i++)
        {
            int print=start;
            for(int j=1;j<=i;j++)
            {
                System.out.print(print+"\t");
                print=print-(n-i+1)-(j-1);
            }
            start+=(n-i+1);
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        p4.pattern(12);
    }
}
