package Basics;
import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>(Arrays.asList("avinish","gaya","Gudiya","Ragni"));
        //String a[]=al.toArray(new String[al.size()]);
        String a[]=Arrays.copyOf(al.toArray(),al.size(),String[].class);

        ArrayList<Integer> al2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer b[]=al2.toArray(new Integer[al2.size()]);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
