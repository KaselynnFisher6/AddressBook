package javaaddressBook;

/**
 * Write a description of class entry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.regex.Pattern;

public class Entry
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Scanner scan = new Scanner(System.in);
    /**
     * Constructor for objects of class entry
     */
    public void entry()
    {
        //Empty constructor to create new entry
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName()
    {
        System.out.print("First Name: ");
        this.firstName = scan.nextLine();
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setLastName()
    {
        System.out.print("Last Name: ");
        this.lastName = scan.nextLine();
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    /**
     * Validation code from:
     * https://www.geeksforgeeks.org/java-program-check-valid-mobile-number/
     */
    public void setPhoneNumber()
    {
        System.out.print("Phone Number: ");
        Pattern pat = Pattern.compile("[0-9]{10}");
        String phoneNumber = scan.nextLine();
        while(true)
        {
            if (pat.matcher(phoneNumber).matches())
            {
                this.phoneNumber = phoneNumber;
                break;
            }
            System.out.print("Invalid Phone Number. Please try again: ");
            phoneNumber = scan.nextLine();
        }
    }
    public String getEmail()
    {
        return this.email;
    }
    /**
     * Validation code from:
     * https://www.geeksforgeeks.org/check-email-address-valid-not-java/
     */
    public void setEmail()
    {
        System.out.print("Email Address: ");
        String emailregex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        
        Pattern pat = Pattern.compile(emailregex);
        String email = scan.nextLine();
        while(true)
        {
            if (pat.matcher(email).matches())
            {
                this.email = email;
                break;
            }
            System.out.println("Invalid Email. Please try again: ");
            email = scan.next();
        }
    }
    @Override
    public String toString()
    {
        String display = "************\n"
                       + "First Name: " + this.firstName + "\n"
                       + "Last Name: " + this.lastName + "\n"
                       + "Phone Number: " + this.phoneNumber + "\n"
                       + "Email: " + this.email + "\n"
                       + "************\n";
        return display;
    }
}
