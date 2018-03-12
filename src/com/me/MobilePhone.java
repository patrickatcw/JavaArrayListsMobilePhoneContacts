package com.me;

import java.util.ArrayList;

//step 6 created this class
public class MobilePhone {

    //step 7 create fields
    private String myNumber;
    private ArrayList<Contact> myContacts;

    //step 8 create constructor(only for myNumber)
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;

        //step 9 do arraylist manually
        this.myContacts = new ArrayList<>();

    }

    //step 10 create a method to add a new contact
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;

        }

        //step 11 checking to make sure contact successfully added
        myContacts.add(contact);
        return true;

    }

    //step 12 method to find contact
    private int findContact(Contact contact) {

        return this.myContacts.indexOf(contact);

    }

    //step 13 overloading this method, using a different var type in parameter
    //this is looping through all contact names and checking if there
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;

            }
        }

        //step 14
        return -1;   //this means it wasn't found

    }

}
