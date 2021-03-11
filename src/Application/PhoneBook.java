package Application;

import java.util.ArrayList;

public class PhoneBook {

    static ArrayList<Contacts> userPhoneBook = new ArrayList<Contacts>();

    public static void addToList(Contacts contact){
        userPhoneBook.add(contact);
    }

    public static void getList(){
        for(int i=0; i<userPhoneBook.size(); i++){
            System.out.println(userPhoneBook.get(i));
        }
    }
}
