class Account
{
    public int accountNo,balance;
    Account(int accountNo,int balance)
    {
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public void displayBalance()
    {
        System.out.println("Balance : "+balance);
    }
    synchronized public void deposit(int amount)
    {
        balance+=amount;
        displayBalance();
    }
    synchronized public void withdraw(int amount)
    {
        balance-=amount;
        displayBalance();
    }
}

class TransactionDeposit extends Thread
{
    Account a;
    int amount;
    TransactionDeposit(Account a,int amount)
    {
        this.a=a;
        this.amount=amount;
    }
    public void run()
    {
        a.deposit(amount);
    }
}

class TransactionWithdraw extends Thread
{
    Account a;
    int amount;
    TransactionWithdraw(Account a,int amount)
    {
        this.a=a;
        this.amount=amount;
    }
    public void run()
    {
        a.withdraw(amount);
    }
}

class p3
{
    public static void main(String[] args)
    {
        Account a=new Account(777, 1000);
        TransactionWithdraw w=new TransactionWithdraw(a, 700);
        w.start();
        TransactionDeposit d=new TransactionDeposit(a, 600);
        d.start();
    }
}