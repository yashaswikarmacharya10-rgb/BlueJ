import java.util.Scanner;

/**
 * Write a description of class week5Q_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5Q_8
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
