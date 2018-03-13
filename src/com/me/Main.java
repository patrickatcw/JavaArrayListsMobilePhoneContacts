package com.me;

/*directions
- create a program that implements a simple mobile phone with the following
capabilities;
- able to store, modify, remove and query contact names
- create a master class, MobilePhone, that holds the ArrayList of contacts
- the MobilePhone class has the functionality listed above
- add a menu of options that are available
- options; quit, print list of contacts, add new contacts, update existing contact,
remove contact and search / find contact
- when adding or updating be sure to check if the contact already exists (use name)
- be sure not to expose the inner workings of the arraylist to mobilephone;
9no ints, no .get(i) etc.
- mobilephone should do everything with contacts objects only
 */

//step 18
import java.util.Scanner;

public class Main {

    //step 18 implement scanner
    private static Scanner scanner = new Scanner(System.in);

    //step 19 instance for mobilephone class
    private static MobilePhone mobilePhone = new MobilePhone("440-999-0001");

    public static void main(String[] args) {

        //step 20 while and switch
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {             //step 23 now work on while loop
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");

                case 1:
                    mobilePhone.printContacts();    //need to create a method for this, step 24 mobilephone class
                    break;

                case 2:
                    addNewContact();   //need to create a method for this, step 25 below
                    break;

                case 3:
                    updateContact();    //need to create a method for this, step 26 below
                    break;

                case 4:
                    removeContact();     //need to create a method for this, step 28 below
                    break;

                case 5:
                    queryContact();     //need to create a method for this, step 29 below
                    break;

                case 6:
                    printActions();     //need to create a method for this, step 22 below
                    break;

            }




        }


}
