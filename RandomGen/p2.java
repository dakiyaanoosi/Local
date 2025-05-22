package RandomGen;
import java.util.Random;
class p2
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1; //generates number from 1-100
        System.out.println("Random Number Generated : "+randomNum);
    }
}
