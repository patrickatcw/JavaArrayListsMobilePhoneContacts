package com.me;

import java.util.ArrayList;

//step 6 created this class
public class MobilePhone {

    //step 7 create fields
    private String myNumber;
    private ArrayList<Contact>myContacts;

    //step 8 create constructor(only for myNumber)
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;

        //step 9 do arraylist manually
        this.myContacts = new ArrayList<>();

    }
}
