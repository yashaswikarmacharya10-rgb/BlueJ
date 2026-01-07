package week_7;


/**
 * Write a description of class Q_2mainclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_2mainclass
{
    public static void main(String[] args)
    {
        rectangle rect1 = new rectangle(6,7);
        rectangle rect2 = new rectangle(9,15);
        
        System.out.println("Rectangle 1:");
        System.out.println("Length:"+ rect1.length);
        System.out.println("Breadth:"+ rect1.breadth);
        System.out.println("Area:"+ (rect1.length * rect1.breadth));
        
        
        System.out.println("Rectangle 2:");
        System.out.println("Length:"+ rect2.length);
        System.out.println("Breadth:"+ rect2.breadth);
        System.out.println("Area:"+(rect2.length * rect2.breadth));
    }
}