package week_7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String [] args)
    {
        //object creation
        student st1= new student ("Yashaswi", 101);
        student st2= new student ("Addrina", 102);
        
        
        System.out.println(st1.getname());
        System.out.println(st1.getid());
        st1.study();
        
        
        
        System.out.println(st2.getname());
        System.out.println(st2.getid());
        st2.laugh();
        
        //invocation of instance methods or invoking an instancne methods
        calculator calc= new calculator();
        calc.displayInfo();
        
        calc.add(10,20); // actual parameters
        calc.add(30,40);
         
        System.out.println("The fixed number is: "+calc.getFixedNumber());
        
        int fixNum= calc.getFixedNumber();
        System.out.println("The fixed number is: "+ fixNum);
        
        int multi= calc.multiply(10,20);
        int multi1= calc.multiply(30,40);
        System.out.println(calculator.square(10));
        
        
        
        
        
    }
}