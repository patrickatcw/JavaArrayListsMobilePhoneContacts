package com.me;

//step 1 create this class, Contact
public class Contact {

    //step 2 create fields
    private String name;
    private String phoneNumber;

    //step 3 create constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    //step 4 create getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //step 5 create method to call constructor to create contact record
    public static Contact createContact (String name, String phoneNumber){

        return new Contact(name, phoneNumber);

    }

}
