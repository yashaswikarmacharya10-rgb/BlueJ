package week_7;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    //attributes
    String brand;
    int ram;
    double price;
    
     public laptop(String brand, int ram, double price) 
     {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: Rs. " + price);
        System.out.println("---------------------");
    }
}