package Chapter_8_a;

public class Exercise_11_a
{
    String name;
    double balance;
    double transactionFee;

    public void deposit(double amount){

        balance = balance + amount;

    }

    public void withdraw(double amount)
    {
        if (balance - amount - transactionFee < 0){
            System.out.println("Insufficient funds");

        }else
        {
            balance = balance - amount - transactionFee;

            System.out.println("your balance is:" + balance);
        }
    }
}
