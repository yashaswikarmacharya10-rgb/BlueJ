package week_7;


/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario_main
{
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount(101, "Yashaswi", 100000);
        BankAccount acc2 = new BankAccount(102, "Addrina", 1200000);
        
        acc1.deposit(10000);
        acc1.withdraw(6000);
        
        acc2.deposit(30000);
        acc2.withdraw(10000);
        
        System.out.println("\nFinal Account Details:\n");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}