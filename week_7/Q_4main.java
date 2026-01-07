package week_7;


/**
 * Write a description of class Q_4main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_4main
{ 
   public static void main(String[] args) 
   {
        laptop l1 = new laptop("Dell", 16, 10000);
        laptop l2 = new laptop("Acer", 10, 12000);
        laptop l3 = new laptop("Mac book", 8, 155000); 
        
        System.out.println("Laptops with RAM greater than 8GB:\n");

        
        if (l1.ram > 8)
        l1.display();
        
        
        if (l2.ram > 8)
        l2.display();
    
        
        if (l3.ram > 8)
        l3.display();
   }
}