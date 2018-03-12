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

    //step 15 method to update contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName())!=-1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " +
                newContact.getName());
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

    //step 16 method for query
    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;

    }


}
