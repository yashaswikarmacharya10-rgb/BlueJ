import java.util.Scanner;

/**
 * Write a description of class week5Q_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5Q_7
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String choose= "Continue";
        while(choose.equalsIgnoreCase("continue")){
            System.out.println("Enter two numbers :");
            int x= scan.nextInt();
            int y= scan.nextInt();
            scan.nextLine();
            System.out.println("Choose (+, -, , /):");
            String op= scan.nextLine();

            switch(op){
                case "+" : System.out.println("total :" + (x+y)); break;
                case "-" : System.out.println("total :" + (x-y)); break;
                case "" : System.out.println("total :" + (x*y)); break;
                case "/" : System.out.println("total :" + (x/y)); break;
                default : System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue or exit :");
            choose = scan.nextLine();
        } 
        System.out.println("Closed");
    } 
}
