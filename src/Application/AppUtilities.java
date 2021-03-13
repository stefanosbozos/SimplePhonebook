package Application;

import java.util.Scanner;

public class AppUtilities {

    private static Scanner input = new Scanner(System.in);
    private static Contacts myContact;


    //Method that prints out the options menu when
    //the application is started.
    public static void menu(){
        System.out.println("======= MENU =======\n" +
                "1 - Store Contact\n" +
                "2 - Modify Contact\n" +
                "3 - Remove Contact\n" +
                "4 - Search Contact\n" +
                "5 - Show Contact List\n" +
                "6 - Show Menu\n" +
                "7 - Exit Application\r");
    }


    //Method to add a new contact in the phonebook
    //Calls the method addToList(Contacts contact) from the phonebook class
    public static void storeContact(){
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        myContact = new Contacts(name,phoneNumber);
        PhoneBook.addToList(myContact);
    }

    //Replaces an existing contact with a new one
    //calls the method modifyContact in the PhoneBook class
    public static void modifyContact(){
        System.out.print("Enter name or number to modify: ");
        String item = input.nextLine();
        boolean exist = PhoneBook.searchContact(item);
        if(exist){
            System.out.println("Enter name of the new contact: ");
            String name = input.nextLine();
            System.out.print("Enter phone number of the new contact: ");
            String phoneNumber = input.nextLine();
            myContact = new Contacts(name, phoneNumber);
            PhoneBook.modifyContact(item,myContact);
        }else{
            System.out.println("The contact you are trying to modify " +
                    "does not exist.");
        }
    }

    //Removes an existing contact from the PhoneBook ArrayList
    //calls deleteContact method from the PhoneBook class
    public static void removeContact(){
        System.out.print("Enter name or number to remove: ");
        String item = input.nextLine();
        PhoneBook.deleteContact(item);
    }


    //Searches for an existing contact either by name or by phone number.
    //calls searchContact method from the PhoneBook class
    public static void searchContact(){
        System.out.print("Search for: ");
        String item = input.nextLine();
        PhoneBook.searchContact(item);
    }

    //Method that calls the .getList() method from the phonebook class
    //to print the whole ArrayList
    public static void showContacts(){
        PhoneBook.getList();
    }

}
