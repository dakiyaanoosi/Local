//Also known as "for each loop"
package Basics;
public class Enhanced_For_Loop {
    public static void main(String[] args) {


        int arr[]={1,2,3,4,5,6,7,8,9};
        char arr2[]={'a', 'b', 'c','d', 'e', 'f','g','h','i'};
        for(int i : arr)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        for(char i : arr2)
        {
            System.out.print(i+"  ");
        }
        System.out.println();



        int arr3[][]={{1,2,3,},{4,5,6,},{7,8,9}};
        for(int a[] : arr3)
        {
            for(int i : a)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
