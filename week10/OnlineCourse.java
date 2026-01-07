package week10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineCourse extends Course
{
    private double platformFee;
    public OnlineCourse(int courseId, String courseName, double baseFee, double platformFee)
    {
        super(courseId, courseName, baseFee);
        this.platformFee= platformFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getbaseFee() + this.platformFee;
    }
    
    public void displayOnlineCourseDetails()
    {
        super.displayCourseDetails(); //course id, course name
        System.out.println("Total Fee for this Onlilne course:" + this.calculateFee());
    }
}