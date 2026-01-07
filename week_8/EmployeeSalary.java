package week_8;


/**
 * Write a description of class Q_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary
{
    private double basicSalary;
    
    public EmployeeSalary(double basicSalary)
    {
        this.basicSalary= basicSalary;
    }
    
    //getters and setters methods
    public void setbasicSalary(double basicSalary)
    {
         this.basicSalary= basicSalary;
    }
    
    public double getbasicSalary()
    {
        return this.basicSalary= basicSalary;
    }
    
    public double calculatorGrossSalary()
    {
        double bonus= 2.0*this.basicSalary;
        return this.basicSalary+bonus;
    }
    
    public void displayEmployeeSalary()
    {
        System.out.println("Basic Salary: "+ getbasicSalary());
        double grossSalary= calculatorGrossSalary();
        System.out.println("Gross Salary: "+grossSalary);
    }
}