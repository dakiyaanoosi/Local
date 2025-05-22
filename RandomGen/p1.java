package RandomGen;
class p1
{
    public static void main(String[] args)
    {
        int randomNum=(int)(Math.random()*10) +1;
        //Math.random()*10 generates number from 0-9, using +1..... it generates number from 1-10
        System.out.println("Random Number generated : "+randomNum);
    }
}