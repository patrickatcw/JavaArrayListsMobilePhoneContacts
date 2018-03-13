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

    //step 25
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " +
                    phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    //step 26
    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);   //go back to mobilephone class, query
        if (existingContactRecord==null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updated record.");
        }

    }

        //step 28 remove contact method
        private static void removeContact() {
            System.out.println("Enter existing contact name: ");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord==null) {
                System.out.println("Contact not found.");
                return;
            }

            if(mobilePhone.removeContact(existingContactRecord)) {
                System.out.println("Successfully deleted");
            } else {
                System.out.println("Error deleting contact");

            }

        }

        //step 29
        private static void queryContact() {
            System.out.println("Enter existing contact name: ");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord==null) {
                System.out.println("Contact not found.");
                return;
            }

            System.out.println("Name: " + existingContactRecord.getName() + "phone number is " +
                    existingContactRecord.getPhoneNumber());
        }

        //step 30 now try running this!!!!


        //step 21 method to start phone
        private static void startPhone(){
            System.out.println("Starting phone...");
        }

        //step 22 method for print actions
        private static void printActions(){
            System.out.println("\nAvailable actions:\npress");
            System.out.println("0 - to shutdown\n" +
                    "1 - to print contacts\n" +
                    "2 - to add a new contact\n" +
                    "3 - to update existing contact\n" +
                    "4 - to remove an existing contact\n" +
                    "5  - query if an existing contact exists\n" +
                    "6 - to print a list of available actions.");

            System.out.println("Choose your action: ");

            }

    }
