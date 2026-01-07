package week10;


/**
 * Write a description of class UniversityApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniversityApp
{
    public static void main(String[] args)
    {
        //int courseId, String courseName, double baseFee, double platformFee
        OnlineCourse c1= new OnlineCourse(101, "Programming in Java", 120000, 60000);
        OfflineCourse c2= new OfflineCourse(102, "Information System", 20000, 10000);
    }
}