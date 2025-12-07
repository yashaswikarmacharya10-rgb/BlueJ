import java.util.Scanner;

/**
 * Write a description of class workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop4
{
    public static void main(String[] args){
    //Q-1
    int num=27;
        
        if (num >= 40)
        {
            System.out.println("Student is pass");
        }
        else{
            System.out.println("Student is fail");
        }
        
        
    //Q-2
    int n=3;
    if(n %2 == 0)
    {
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
    }
    
    
    //Q-3
    int numb=37;
    if (num>0){
        System.out.println("Number is postitive");
    }
    else if (num<0){
        System.out.println("Number is negative");
    }
    else{
        System.out.println("Number is zero");
    }
    
    
    //Q-4
    int no=35;
              if(no%5==0)
       {
        if(num%5 ==0)
      {
        System.out.println("Divisible by both");
    }
    else
    {
        System.out.println("Only divisible by 5");
    }
    }else
   { 
    if(num %5==0)
    {
    System.out.println("Only divisible by 5");
    }
    else
    {
        System.out.println("Not divisible by both");
             }
            }
            
            
   //Q-5
   int number= 55;
   if (num %3 == 0){
       if (num % 5 ==0) { 
           System.out.println("divisible by both 3 and 5");
        }else{
            System.out.println("divisible by 3 but not by 5");
        }
    }else{
        System.out.println("not divisible by 3 and 5 together");
    }
    
    
    //Q-6
   Scanner scan = new Scanner (System.in);
   System.out.println("Enter marked peice");
   float mp=scan.nextFloat();
   System.out.println("Enter a category(A/B/C/D): ");
   char category = scan.next(). charAt(0);
   float discount = 0;
        if(category == 'A')
        {
         discount = 60;
        
        }
        else if (category == 'B')
        {
            discount = 40;
        }
        else if(category == 'C')
        {
            discount = 20;
        }
        else if(category == 'D')
        {
            discount = 10;
        }
        else
        {
            System.out.println("Invalid category, please choose from (A/B/C/D)");
        }
   float sp = mp-(mp*discount)/100;
        
   System.out.println("Discount percentage: " + discount + "%");
   System.out.println("Final selling price" + sp);
 }
}
   
   
   
    
    
