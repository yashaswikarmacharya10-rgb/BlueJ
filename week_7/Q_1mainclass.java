package week_7;
import javax.swing.Box;


/**
 * Write a description of class Q_1mainclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_1mainclass
{
    public static void main(String[] args)
    {
        Book book1= new Book();
        Book book2= new Book();
        
        book1.title= "Muna Madan";
        book1.author= "Laxmi Prasad Devkota";
        book1.price= 200;
        
        System.out.println("Book 1 details");
        System.out.println("Title:"+ book1.title);
        System.out.println("Author:"+ book1.author);
        System.out.println("Price:"+ book1.price);
        
        book2.title= "Shirish ko Phool";
        book2.author= "Parijat";
        book2.price= 250; 
        
        System.out.println("Book 2 details");
        System.out.println("Title:"+ book2.title);
        System.out.println("Author:"+ book2.author);
        System.out.println("Price:"+ book2.price);
        
    }
}