package week_8;
import javafx.scene.control.Cell;


/**
 * Write a description of class Electricitybilltest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Electricitybilltest
{
    public static void main(String[] args) 
    {
        // Create ElectricityBill 
        Electricitybill bill = new Electricitybill("Addrina", 10);

        // Display bill details
        System.out.println("Consumer Name: " + bill.getconsumerName());
        System.out.println("Units Consumed: " + bill.getunitsConsumed());
        System.out.println("Total Bill Amount: " + bill.calculateBill());
    }
}
