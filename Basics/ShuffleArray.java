package Basics;
import java.security.SecureRandom;
import java.util.Arrays;
class ShuffleArray
{
    static int[] shuffle(int[]a)
    {
        SecureRandom r=new SecureRandom();
        for(int i=0;i<a.length;i++)
        {
            int index=r.nextInt(a.length);
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        return a;
    }
    public static void main(String []args)
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]=shuffle(a);
        System.out.println(Arrays.toString(b));
    }
}