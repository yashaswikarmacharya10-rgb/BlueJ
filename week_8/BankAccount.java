package week_8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // private attribute
    private int accountNumber;
    private double balance;
    private String name;

    // Constructor 
    BankAccount(int accountNumber, String name, double balance) 
    {
        this.accountNumber= 00100010;
        this.name= "Addrina Shrestha";
        this.balance = 50000;
    }

    // return balance
    double getBalance() 
    {
        return balance;
    }

    // deposit money
    void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else 
        {
            System.out.println("Invalid deposit amount");
        }
    }

    // withdraw money
    boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
            return true;
        } else 
        {
            System.out.println("Insufficient balance or invalid amount");
            return false;
        }
    }
}

