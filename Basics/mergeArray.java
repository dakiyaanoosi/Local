package Basics;
import java.util.Arrays;
import java.util.stream.IntStream;
public class mergeArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int c[]=new int[a.length+b.length];
        // for(int i=0;i<c.length;i++)
        // {
        //     if(i<a.length)
        //     c[i]=a[i];
        //     else
        //     c[i]=b[i-a.length];
        // }

        // System.arraycopy(a,0,c,0,a.length);
        // System.arraycopy(b,0,c,a.length,b.length);
        c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();
        System.out.println("Merged Array : "+Arrays.toString(c));
    }
}
