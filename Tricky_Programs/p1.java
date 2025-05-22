package Tricky_Programs;
class p1
{
    static void pattern(int n)
    {
        int c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print("\t");
            }
            if(i%2==0)
            for(int j=0;j<n;j++)
            {
                System.out.print(c+"\t");
                c++;
            }
            else
            {
                for(int j=c+n-1;j>=c;j--)
                {
                    System.out.print(j+"\t");
                }
                c+=n;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        p1.pattern(10);
    }
}