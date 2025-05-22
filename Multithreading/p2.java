
class three implements Runnable
{
    public void run()
    {
        System.out.println("Three Executed");
    }
}

class four implements Runnable
{
    public void run()
    {
        System.out.println("Four Executed");
    }
}

class m2
{
    public static void main(String[] args)
    {
        // three t=new three();
        // four f=new four();
        // Thread t1=new Thread(t);
        // Thread t2=new Thread(f);
        Thread t1=new Thread(new three());
        Thread t2=new Thread(new four());
        t1.start();
        t2.start();
    }
}