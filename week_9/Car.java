package week_9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
   private int doors; 
   private String fuelType;
   
   public Car(int vehicleId, String brand, double basePrice, int doors, String fuelType)
   {
       // parent constructor
       super(vehicleId, brand, basePrice);
       this.doors= doors;
       this.fuelType= fuelType;
   }
   
   public double calculateFinalPrice()
   {
       return super.basePrice + super.calculateTax()+0.05 * super.basePrice;
   }
   
   public void displayCarDetails()
   {
       super.displayVehicleInfo();
       System.out.println("No of doors: " + this.doors);
       System.out.println("Fuel type: " + this.fuelType);
   }
}