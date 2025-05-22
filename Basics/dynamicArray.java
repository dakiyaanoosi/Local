package Basics;
import java.util.Arrays;
public class dynamicArray
{
    int arr[];
    int size;
    public dynamicArray()
    {
        arr=new int[2];
        size=0;
    }
    public void capacity()
    {
        if(arr.length==size)
        arr=Arrays.copyOf(arr, arr.length*2);
    }
    public void add(int element)
    {
        capacity();
        arr[size++]=element;
    }
    public void delete(int index)
    {
        if(size==0)
        {
            System.out.println("Array is Empty");
            return;
        }
        if(index<0 || index>=size)
        {
            System.out.println("Invalid index");
            return;
        }
        System.arraycopy(arr,index+1,arr,index,size-index-1);
        size--;
    }
    public void insert(int index,int element)
    {
        if(index<0 || index>size)
        {
            System.out.println("Invalid index");
            return;
        }
        capacity();
        System.arraycopy(arr,index,arr,index+1,size-index);
        arr[index]=element;
        size++;
    }
    public void popBack()
    {
        if(size==0)
        {
            System.out.println("Array is Empty");
            return;
        }
        size--;
    }
    public void popFront()
    {
        if(size==0)
        {
            System.out.println("Array is Empty");
            return;
        }
        System.arraycopy(arr,1,arr,0,size-1);
        size--;
    }
    public void pushFront(int element)
    {
        capacity();
        System.arraycopy(arr,0,arr,1,size);
        arr[0]=element;
        size++;
    }
    public int get(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("Invalid Index : "+index);
        }
        return arr[index];
    }
    public int sizeOf()
    {
        return size;
    }
    public int[] toArray()
    {
        return Arrays.copyOf(arr,size);
    }
    public static void main(String[] args) {
        dynamicArray da=new dynamicArray();
        da.add(1);
        da.add(2);
        da.add(4);
        da.insert(2,3);
        da.popBack();
        da.popFront();
        da.pushFront(1);
        int element=da.get(1);
        int length=da.sizeOf();
        System.out.println(Arrays.toString(da.toArray())+"\nElement : "+element+"\nLength : "+length);
    }
}