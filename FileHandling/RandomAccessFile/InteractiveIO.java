package FileHandling.RandomAccessFile;
import java.io.*;
import java.util.StringTokenizer;
class InteractiveIO
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        StringTokenizer st;
        System.out.println("Enter code number : ");
        st=new StringTokenizer(in.readLine());
        int code=Integer.parseInt(st.nextToken());
        System.out.println("Enter number of items : ");
        st=new StringTokenizer(in.readLine());
        int items=Integer.parseInt(st.nextToken());
        System.out.println("Enter cost : ");
        st=new StringTokenizer(in.readLine());
        double cost=Double.parseDouble(in.readLine());

        DataOutputStream dos=new DataOutputStream(new FileOutputStream("FileHandling/i.txt"));
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);

        DataInputStream dis=new DataInputStream(new FileInputStream("FileHandling/i.txt"));
        int codeNumber=dis.readInt();
        int totalItems=dis.readInt();
        double itemCost=dis.readDouble();
        double totalCost=itemCost*totalItems;
        System.out.println("Code Number : "+codeNumber);
        System.out.println("Total Items : "+totalItems);
        System.out.println("Total Cost : "+totalCost);
        dos.close();
        dis.close();
    }
}