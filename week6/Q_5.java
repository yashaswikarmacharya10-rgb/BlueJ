package week6;
import java.util.Scanner;


/**
 * Write a description of class Q_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_5
{
    public static void main(String [] args)
    {
        String [] district= {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        for(int i=0; i< district.length; i++)
        {
        System.out.println((i+1 )+"." + district[i]);
        }
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int len= sc.nextInt();
        for (int i=0; i< len; i++)
        {
            System.out.println(district[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        
}
}