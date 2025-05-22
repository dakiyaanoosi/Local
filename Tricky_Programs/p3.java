package Tricky_Programs;

class p3
{
    static void pattern(int n)
    {
        int o=1,e=2;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("\t");
            }
            if(i%2==0)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(e+"\t");
                    e+=2;
                }
            }
            else
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(o+"\t");
                    o+=2;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        p3.pattern(6);
    }
}
