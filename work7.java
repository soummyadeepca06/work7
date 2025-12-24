
/**
 * Write a description of class work7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class work7
{
    int account_number;
    String holder_name;
    double currentBalance;
    public work7(int acnumb,String name,double balance)
    {
        this.account_number=acnumb;
        this.holder_name=name;
        this.currentBalance=balance;
    }

    void deposit(double depositAmount)
    {
        currentBalance=currentBalance+depositAmount;
        System.out.println(depositAmount+" added to account number: "+account_number);
    }

    void withdraw(double withdrawAmount)
    {
        if(withdrawAmount<=currentBalance)
        {
        System.out.println("You successfully withdrawed "+withdrawAmount);
        currentBalance=currentBalance-withdrawAmount;
        }
        else
        {
            System.out.println("Amount is greater than your balance.");
        }
    }

    void currentBalance()
    {
        System.out.println("Current balance of "+holder_name+" is "+currentBalance);
    }
}