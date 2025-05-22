package Basics;
import java.util.Arrays;
import java.util.ArrayList;

class insert_Num_Arr 
{
    public static void main(String[] args) {
        Integer a[]={1,2,3,5,6,7,8};
        int index=3,element=4;
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));
        al.add(index,element);
        System.out.println(Arrays.toString(al.toArray()));
        
        // int b[]=new int[a.length+1];
        // for(int i=0;i<a.length+1;i++)
        // {
        //     if(i<index)
        //     {
        //         b[i]=a[i];
        //     }
        //     else if(i==index)
        //     {
        //         b[i]=element;
        //     }
        //     else
        //     {
        //         b[i]=a[i-1];
        //     }
        // }

        // System.arraycopy(a,0,b,0,index);
        // b[index]=element;
        // System.arraycopy(a,index,b,index+1,a.length-index);
        // a=b;
        // System.out.println("New Array : "+Arrays.toString(a));
    }
}