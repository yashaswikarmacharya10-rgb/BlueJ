package week_9;


/**
 * Write a description of class _ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class VehicleApp
{
    public static void main(String[] args)
    {
        Car c1= new Car(101, "Tesla", 6000000, 4, "Petrol");
        c1.displayCarDetails();
        
        Bike b1= new Bike(202, "Bullet", 200000, 2);
        b1.displayBikeDetails();
    }
}
