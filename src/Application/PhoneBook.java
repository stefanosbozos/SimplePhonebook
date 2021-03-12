package Application;

import java.util.ArrayList;

public class PhoneBook {

    static ArrayList<Contacts> userPhoneBook = new ArrayList<Contacts>();


    //Method to add a new element in the arraylist
    public static void addToList(Contacts contact){
        userPhoneBook.add(contact);
    }

    public static void deleteContact(Contacts contact){
        int index = indexSearch(contact);
        if(index >= 0){
            userPhoneBook.remove(contact);
            System.out.println(contact.getName() + " has been deleted.");
        }else{
            System.out.println("The contact you are trying to delete " +
                    "does not exist in the phonebook.");
        }
    }

    //Method that replaces a certain value at a certain index of the
    //ArrayList.
    public static void modifyContact(Contacts oldContact, Contacts newContact){
        int index = indexSearch(oldContact);
        if(index >= 0){
            userPhoneBook.set(index,newContact);
        }else{
            System.out.println("The contact you are trying to modify " +
                    "does not exist in the phonebook.");
        }
    }

    //Method that searches if a particular Contacts type object exist
    //in the ArrayList by calling the private method indexSearch() to
    //receive the index of the given value.
    public static void searchContact(Contacts contact){
        int index = indexSearch(contact);
        if(index>=0){
            System.out.println("Contact " + contact.getName() +
                    "found at position " + index);
        }else {
            System.out.println("Contact not found.");
        }
    }

    //Method that searches for the index of an element in
    //the arraylist. If it exist return the index else
    //returns -1.
    private static int indexSearch(Contacts contact){
        return userPhoneBook.indexOf(contact);
    }


    public static void getList(){
        for(int i=0; i<userPhoneBook.size(); i++){
            System.out.println(userPhoneBook.get(i) + "\n");

        }
    }
}
