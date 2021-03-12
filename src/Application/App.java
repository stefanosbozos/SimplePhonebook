package Application;

import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

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
                    flag = false;
                    break;
            }

        }
    }


}
