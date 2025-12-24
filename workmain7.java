
/**
 * Write a description of class workmain7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workmain7
{
    public static void main(String[] args)
    {
        work7 b1=new work7(123,"Soummya Deep Chalise",10000.0);
        work7 b2=new work7(405,"Rajesh hamal",5000);
        b1.deposit(8000.0);
        b1.withdraw(20000.0);
        b1.currentBalance();

        b2.deposit(7000);
        b2.withdraw(300);
        b2.currentBalance();
    }
}