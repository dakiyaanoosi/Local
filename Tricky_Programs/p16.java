package Tricky_Programs;

class p16
{
    static int setc(int i,int j, int n, int c)
    {
        if(n<=8)
        {
            if((n*i)-j==9)
            return 8;
        }
        else
        {
            if((n*i)-j==8)
            return 8;
        }
        return c;
    }
    void pattern(int n)
    {
        int c=1;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(c+" ");
                if(c==0 || c==9)
                c=9-c;
                else
                c++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(c+" ");
                if(c==0 || c==9)
                c=9-c;
                else
                c--;
                c=setc(i, j, n, c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        new p16().pattern(10);
    }
}
