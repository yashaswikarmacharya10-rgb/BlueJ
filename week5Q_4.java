
/**
 * Write a description of class week5Q_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5Q_4
{
    public static void main(String [] args)
    {
        //Q-4 
        for (int i=1; i<=5; i++)
         {
             for (int j=1; j<+i; j++)
             {
                 System.out.println(j);
             }
             System.out.println();
         }
         
         
         //Q-3
         
         int i=1;
         int sum=0;
         do
         {
            sum= sum+ (i * i);
            i++;
         } while (i<=10);
         System.out.println("Sum of square of first 10 natural numbers= " + sum);
    }   
    
        
}