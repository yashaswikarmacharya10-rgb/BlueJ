
/**
 * Write a description of class week4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4
{
    public static void main(String[] args)
    { 
        //byte, short, long 
        System.out.println(Byte.MAX_VALUE); //maximum value
        System.out.println(Byte.MIN_VALUE); // minimum value
        System.out.println(Byte.SIZE); // bits
        System.out.println(Byte.BYTES); // bytes
        
        System.out.println(Short.MAX_VALUE); // Maximum value 
        System.out.println(Short.MIN_VALUE); // Minimum value
        System.out.println(Short.SIZE); // size
        System.out.println(Short.BYTES); // Bytes
        
        System.out.println(Long.MAX_VALUE); // maximum value
        System.out.println(Long.MIN_VALUE); // minimum value
        System.out.println(Long.SIZE); // size
        System.out.println(Long.BYTES); // bytes 
        
        
        //implicit typecasting --> widening casting 
        int itr= 10;
        double db= itr;
        
        
        System.out.println(db);
        byte bt= 7;
        short st= bt;
        
        
        System.out.println(st);
        
        //expilict typecasting --> narrowing typecasting 
        
        double dr = 10.08d;
        int it= (int)dr;
        
        
        System.out.println(it);
        
        long lg= 92233;
        short str= (short)lg;
        
        
        System.out.println(str);
        
        
        
        //Q-1
        int num=27;
        
        if (num >= 40)
        {
            System.out.println("Student is pass");
        }
        else{
            System.out.println("Student is fail");
        }
        
        
        
    
        
        
        
        
        
        
        
        
        
    
    }
}