package week_7;


/**
 * Write a description of class Q_3mainclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q_3mainclass
{
    public static void main(String[] args)
    {
        employee emp1 = new employee(1, "Yashaswi", 25000);
        employee emp2 = new employee(2, "Addrina", 190000);
        employee emp3 = new employee(3, "Ujjen", 18000);
        
        System.out.println("Employee Details:");
        System.out.println( emp1.id + " " + emp1.name + " " + emp1.salary);
        System.out.println(emp2.id + " " + emp2.name + " " + emp2.salary);
        System.out.println(emp3.id + " " + emp3.name + " " + emp3.salary);
        
        //Highest salary
        employee highest = emp1;

        if (emp2.salary > highest.salary) 
        {
            highest = emp2;
        }
        if (emp3.salary > highest.salary)
        {
            highest = emp3;
        }
        
        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("ID: " + highest.id);
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: " + highest.salary);         
    }
}