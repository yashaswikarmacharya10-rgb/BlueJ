package week_8;


/**
 * Write a description of class _ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
{
    public static void main(String[] args) 
    {

        Patient p1 = new Patient("Addrina", 22, 6, 4500);
        Patient p2 = new Patient("Yashaswi", 22, 8, 3200);

        System.out.println("---- Patient 1 Details ----");
        p1.displayDetails();
        System.out.println("Total Bill: " + p1.calculateTotalBill());

        System.out.println("\n---- Patient 2 Details ----");
        p2.displayDetails();
        System.out.println("Total Bill: " + p2.calculateTotalBill());
    }
}