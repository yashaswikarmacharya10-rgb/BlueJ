
/**
 * Write a description of class MathsOperationsjava here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathsOperationsjava
{
    public static void main (String [] args){
    
        //1) Arthmetic
        
        
        int num1= 15;
        int num2= 20;
         
        
        int sum=num1+num2;
        int diff= num2-num1;
        int mult= num1*num2;
        int div=num1/num2;
        int remain= num1 % num2;
        
        
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(remain);
        
        
        //2) Urinary(post-increment and pre-increment operation)
        
        int num3=11;
        
        //post-increment
        System.out.println(num3); //num3=11
        System.out.println(num3++); //num3++=11 num3=12
        System.out.println(num3); //num3=12
        
        //Pre-increment
        System.out.println(++num3); // ++num3=13, num3=13
        System.out.println(num3); //num3=13
        
        
        //3) Assignment operator
        int score= 100;
        score= score+20;
        System.out.println(score);
        
        
        
        //4)Rational operator
        float a= 4;
        float b= 8;
        
        
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b); 
        System.out.println(a>=b);
        System.out.println(a<=b);
        
        
        
        //5) Logical operator
        int c=4;
        int d=3;
        
        
        System.out.println(c>d && c<d);
        System.out.println(c<d || c>d);
        System.out.println(!(c>d)); 
    }

}