
import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor_java here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor_java
{
    public static void main(String [] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter water level");
        int level= scanner.nextInt();
        
        if (level >= 1000)
        {
            System.out.println("WARNING! Water level has reached 1000L or more");
        }
        else
        {
            System.out.println("Status: Normal");
        }
        
        
        
        
        
    }
}