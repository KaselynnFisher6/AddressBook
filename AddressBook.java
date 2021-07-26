package javaaddressBook;

/**
 * Write a description of class addressBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class AddressBook
{
    // instance variables - replace the example below with your own
    private ArrayList<Entry> book = new ArrayList<Entry>();
    private Scanner scan = new Scanner(System.in);
    /**
     * Constructor for objects of class addressBook
     */
    public void addressBook()
    {
        //Empty Constructor that creates the addressBook
    }
    public void addNewEntry()
    {
        Entry entry = new Entry();
        entry.setFirstName();
        entry.setLastName();
        entry.setPhoneNumber();
        entry.setEmail();
        book.add(entry);
    }
    public void deleteEntry()
    {
        System.out.print("Enter Email Address: ");
        String email = scan.nextLine();
        for (int i = 0; i < book.size(); i++)
        {
            System.out.println(book.get(i).getEmail().equals(email));
            if (book.get(i).getEmail().equals(email))
            {
                book.remove(i);
            }
        }
    }
    public void searchAddressBook()
    {
        displaySearchOptions();
        System.out.print("Choose a search type: ");
        int searchType = scan.nextInt();
        System.out.print("Enter your search: ");
        String search = scan.next();

        if (searchType == 1)
        {
            for (Entry entry : book)
            {
                if (entry.getFirstName().contains(search))
                {
                    System.out.println(entry);
                    System.out.println();
                }
            }
        }
        else if (searchType == 2)
        {
            for (Entry entry : book)
            {
                if (entry.getLastName().contains(search))
                {
                    System.out.println(entry);
                    System.out.println();
                }
            }
        }
        else if (searchType == 3)
        {
            for (Entry entry : book)
            {
                if (entry.getPhoneNumber().contains(search))
                {
                    System.out.println(entry);
                    System.out.println();
                }
            }
        }
        else if (searchType == 4)
        {
            for (Entry entry : book)
            {
                if (entry.getEmail().contains(search))
                {
                    System.out.println(entry);
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("Invalid entry\n");
        }
        
    }
    public void displayAddressBook()
    {
        for (Entry entry : book)
        {
            System.out.print(entry);
        }
    }
    public void emptyAddressBook(){
        book.clear();
    }
    static void displaySearchOptions()
    {
        String menu = "\n" + "1) First Name\n" + "\n"
                    + "2) Last Name\n" + "\n"
                    + "3) Phone Number\n" + "\n"
                    + "4) Email Address\n" + "\n";
        System.out.print(menu);
    }
}
