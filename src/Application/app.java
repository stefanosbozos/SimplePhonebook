package Application;

import java.util.Scanner;

public class app {

    private static Scanner input = new Scanner(System.in);
    private static Contacts myContact;

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
//                case 2:
//                    modifyContact();
//                    break;
//                case 3:
//                    removeContact();
//                    break;
//                case 4:
//                    searchContact();
//                    break;
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
        System.out.println("Enter name: \r");
        String name = input.nextLine();
        System.out.println("Enter phone number: \r");
        String phoneNumber = input.nextLine();
        myContact = new Contacts(name,phoneNumber);
        PhoneBook.addToList(myContact);
    }

//    public static void searchContact(){
//        System.out.println("Give name or number of contact: ");
//        String name = input.nextLine();
//        myContact = new Contacts();
//        PhoneBook.searchContact(myContact);
//    }

    //Method that calls the .getList() method from the phonebook class
    //to print the whole ArrayList
    public static void showContacts(){
        PhoneBook.getList();
    }

}
