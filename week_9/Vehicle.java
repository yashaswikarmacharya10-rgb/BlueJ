package week_9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int vehicleId;
    protected String brand;
    protected double basePrice;
    
    public Vehicle(int vehicleId, String brand, double basePrice)
    {
        this.vehicleId= vehicleId;
        this.brand= brand;
        this.basePrice= basePrice;
    }
    
    public void displayVehicleInfo()
    {
        System.out.println("Vehicle Id: " + this.vehicleId);
        System.out.println("Brand:" + this.brand);
        System.out.println("Base price:" + this.basePrice);
    }
    
    public double calculateTax()
    {
        return 0.10 * this.basePrice;
    }
}