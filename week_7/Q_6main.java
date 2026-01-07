package week_7;


/**
 * Write a description of class Q_6main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_6main
{
    public static void main(String[] args)
    {
      result r1 = new result(30, 55, 22);
      result r2 = new result(45, 40, 58);  
      
      r1.calculateTotal();
      r1.calculatePercentage();
      r1.displayresult();

        
      r2.calculateTotal();
      r2.calculatePercentage();
      r2.displayresult();
    }
}