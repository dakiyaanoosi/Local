package Tricky_Programs;

class p10
{
    static void pattern(int n)
    {
        int temp=1;
        char c='A';
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                c=Character.toUpperCase(c);
                temp=1;
            }
            for(int j=1;j<=i;j++)
            {
                if(temp==0)
                System.out.print(Character.toLowerCase(c)+"  ");
                else
                System.out.print(c+"  ");
                c++;
                temp=1-temp;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        p10.pattern(4);
    }
}
