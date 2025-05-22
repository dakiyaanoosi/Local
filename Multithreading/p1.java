
class one extends Thread
{
    public void run()
    {
        System.out.println("One Executed !!");
    }
}
class two extends Thread
{
    public void run()
    {
        System.out.println("Two Executed !!");
    }
}

class m
{
    public static void main(String[] args) {
        one o=new one();
        two t=new two();

        o.start();
        t.start();
    }
}