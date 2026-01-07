package week_8;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String[] args) 
    {
        // Create BankAccount 
        BankAccount account = new BankAccount(00101001, "Addrina", 300000);

        // Deposit money
        account.deposit(150000);

        // Withdraw money
        boolean status = account.withdraw(50000);

        if (status) 
        {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed");
        }

        // Display balance
        System.out.println("Current Balance: " + account.getBalance());
    }
}

