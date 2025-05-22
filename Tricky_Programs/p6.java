package Tricky_Programs;

class p6
{
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            if(i==0)
            {
                System.out.println("*");
                continue;
            }
            if(i==(n-1))
            {
                for(int j=0;j<n;j++)
                System.out.print("* ");
                break;
            }
            System.out.print("*");
            for(int j=0;j<(i*2)-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void main(String[] args)
    {
        p6.pattern(5);
    }
}
