package Basics;
import java.util.Arrays;
import java.util.stream.IntStream;

class intStream
{
    public static void main(String[] args) {

        int a[]=IntStream.range(1,8).toArray();
        System.out.println("\nNumber of elements : "+a.length+"\n"+Arrays.toString(a)+"\n");

        int b[]=IntStream.rangeClosed(1,7).toArray();
        System.out.println("Number of elements : "+b.length+"\n"+Arrays.toString(b)+"\n");

        int c[]=IntStream.of(1,2,3,4,5,6,7).toArray();
        System.out.println("Number of elements : "+c.length+"\n"+Arrays.toString(c)+"\n");

        /*
         If not importing java.util.stream.IntStream;
          
        int a[]=java.util.stream.IntStream.range(1,8).toArray();
        System.out.println("\nNumber of elements : "+a.length+"\n"+Arrays.toString(a)+"\n");

        int b[]=java.util.stream.IntStream.rangeClosed(1,7).toArray();
        System.out.println("Number of elements : "+b.length+"\n"+Arrays.toString(b)+"\n");

        int c[]=java.util.stream.IntStream.of(1,2,3,4,5,6,7).toArray();
        System.out.println("Number of elements : "+c.length+"\n"+Arrays.toString(c)+"\n");

         */

    }
}