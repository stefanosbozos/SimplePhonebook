package Application;

import java.util.Scanner;

public class app {

    private static Scanner input = new Scanner(System.in);
    private static Contacts myContact;

    //Prints out the menu of options the user can make.
    public static void menu(){

        boolean flag = true;
        while(flag){
            System.out.println("1 - Store Contact\n" +
                    "2 - Modify Contact\n" +
                    "3 - Remove Contact\n" +
                    "4 - Search Contact\n" +
                    "5 - Show Contact List\n" +
                    "6 - Exit Application\r");

            int option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    storeContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    showContacts();
                    break;
                case 6:
                    flag = false;
                    break;
            }

        }
    }

    //Method to add a new contact in the phonebook
    //Calls the method addToList(Contacts contact) from the phonebook class
    private static void storeContact(){
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        myContact = new Contacts(name,phoneNumber);
        PhoneBook.addToList(myContact);
    }

    //Replaces an existing contact with a new one
    //calls the method modifyContact in the PhoneBook class
    private static void modifyContact(){
        System.out.print("Enter name or number to modify: ");
        String item = input.nextLine();
        System.out.println("Enter name of the new contact: ");
        String name = input.nextLine();
        System.out.print("Enter phone number of the new contact: ");
        String phoneNumber = input.nextLine();
        myContact = new Contacts(name, phoneNumber);
        PhoneBook.modifyContact(item,myContact);
    }

    //Removes an existing contact from the PhoneBook ArrayList
    //calls deleteContact method from the PhoneBook class
    private static void removeContact(){
        System.out.print("Enter name or number to remove: ");
        String item = input.nextLine();
        PhoneBook.deleteContact(item);
    }


    //Searches for an existing contact either by name or by phone number.
    //calls searchContact method from the PhoneBook class
    private static void searchContact(){
        System.out.print("Search for: ");
        String item = input.nextLine();
        PhoneBook.searchContact(item);
    }

    //Method that calls the .getList() method from the phonebook class
    //to print the whole ArrayList
    private static void showContacts(){
        PhoneBook.getList();
    }

}
