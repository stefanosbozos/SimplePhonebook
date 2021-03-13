package Application;

import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);
    private boolean flag;

    //Constructor that initializes the App object and starts the application.
    public App(boolean flag){
        this.flag = flag;
        applicationState(flag);
        AppUtilities.menu();
    }

    //Prints out the menu of options the user can make.
    public void menu(){

        while(flag){

            int option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    AppUtilities.storeContact();
                    break;
                case 2:
                    AppUtilities.modifyContact();
                    break;
                case 3:
                    AppUtilities.removeContact();
                    break;
                case 4:
                    AppUtilities.searchContact();
                    break;
                case 5:
                    AppUtilities.showContacts();
                    break;
                case 6:
                    AppUtilities.menu();
                    break;
                case 7:
                    flag = false;
                    applicationState(flag);
                    break;
            }
        }
    }

    //Method that takes a boolean as a parameter
    //and prints out a message at the start and
    //the end of the application.
    private void applicationState(boolean flag){
        if(flag){
            System.out.println("Starting Contacts Application...");
        }else{
            System.out.println("Exiting Application.");
        }
    }



}
