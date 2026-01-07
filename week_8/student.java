package week_8;


/**
 * Write a description of class studentclasss here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    //attributes
    private int id= 101;
    private String name= "Yashaswi";
    private String address= "Kamalpokhari";
    private long phoneNumber= 984530291;
    private static String collegeName = "Islington College";

    student(int id, String name, String address, long phoneNumber) 
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    
    void displayInfo() 
    {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
}

