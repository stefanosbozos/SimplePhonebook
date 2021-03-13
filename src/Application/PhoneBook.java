package Application;

import java.util.ArrayList;

public class PhoneBook {

    //Initialization of the userPhoneBook arraylist.
    //Arraylist holds a Contacts reference type object
    static ArrayList<Contacts> userPhoneBook = new ArrayList<Contacts>();


    //Adds a new element to the userPhoneBook ArrayList
    public static void addToList(Contacts contact){
        userPhoneBook.add(contact);
    }

    //Removes a certain element in the userPhoneBook ArrayList.
    //Calls indexSearch() to check if the element exist in the list
    //and removes it from the list.
    public static void deleteContact(String item){
         int index = indexSearch(item);
        if(index >= 0){
            userPhoneBook.remove(index);
            System.out.println(item + " has been deleted.");
        }else{
            System.out.println("The contact you are trying to delete " +
                    "does not exist in the phonebook.");
        }
    }

    //Replaces an element in the userPhoneBook ArrayList with another
    //element given by the user. Checks first if the element exists
    //using the indexSearch() method and sets the new element at the index
    //of the previous element
    public static void modifyContact(String oldContact, Contacts newContact){
        int index = indexSearch(oldContact);
        userPhoneBook.set(index,newContact);
    }

    //Searches for an element at the userPhoneBook arraylist
    //given by the user. Call the method indexSearch() to
    //check if the element exist and prints out the element.
    public static boolean searchContact(String item){
        int index = indexSearch(item);
        if(index>=0){
            System.out.println(userPhoneBook.get(index) + "\n");
            return true;
        }else {
            System.out.println("Contact not found.");
            return false;
        }
    }

    //Method that searches for the index of an element in
    //the arraylist. If it exist returns the index else
    //returns -1.
    private static int indexSearch(String item){
        for(int i=0; i<userPhoneBook.size(); i++){
            if(item.equals(userPhoneBook.get(i).getName())
            || item.equals(userPhoneBook.get(i).getPhoneNumber())){
                return i;
            }
        }
        return -1;
    }

    //Prints out the whole userPhoneBook arraylist.
    public static void getList(){
        if(!userPhoneBook.isEmpty()){
            System.out.println("=== MY CONTACTS ===");
            for(int i=0; i<userPhoneBook.size(); i++){
                System.out.println(userPhoneBook.get(i) + "\n");
            }
        }else{
            System.out.println("Phonebook empty...");
        }

    }

}
