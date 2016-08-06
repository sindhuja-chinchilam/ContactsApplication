package com.example.xinthe.contactsapplication;

/**
 * Created by xinthe on 8/6/2016.
 */
public class ContactHolder {
    public int id;
    public String name,phoneNumber,email;

    public ContactHolder(int id,String name,String phoneNumber,String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public ContactHolder(String name,String phoneNumber,String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
}
