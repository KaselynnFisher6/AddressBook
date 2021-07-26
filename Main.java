package javaaddressBook;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Main
{   
    static void displayMenu()
    {
        String menu = "\n1) Add an entry \n" + "\n" 
                    + "2) Remove an entry \n"+ "\n" 
                    + "3) Search for a specific entry\n" + "\n"
                    + "4) Print Address Book \n" + "\n"
                    + "5) Delete Book\n" + "\n"
                    + "6) Quit" + "\n";
        
        System.out.print(menu);
    }
    
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        AddressBook addressbook = new AddressBook();
        long usr_input = 0;
        Scanner scan = new Scanner(System.in);
        while (usr_input != 6)
        {
            if (usr_input == 1)
            {
                //add new entry to addressbook 
                addressbook.addNewEntry();
            }
            else if(usr_input == 2)
            {
                //delete entry from addressbook (if it exists)
                addressbook.deleteEntry();
            }
            else if (usr_input == 3)
            {
                //finds entry based on specific questions
                addressbook.searchAddressBook();
            }
            else if (usr_input == 4)
            {
                //print addressbook 
                addressbook.displayAddressBook();
            }
            else if (usr_input == 5)
            {
                //Delete entire book
                addressbook.emptyAddressBook();
            }
            else if (usr_input > 6)
            {
                System.out.println("Invalid Option. Please try again.");
            }
            displayMenu();
            System.out.print("\nPlease choose what you'd like to do with the database: ");
            usr_input = scan.nextLong();
            System.out.println();
        }
        scan.close();
    }
}