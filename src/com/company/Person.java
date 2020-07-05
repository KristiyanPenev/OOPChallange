package com.company;

import java.util.Date;

public class Person  {

    private String name;
    private String address;
    private String telephoneNumber;
    private String emailAddress;

    public Person(String name,String address, String telephoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString(){
        return "Name = " + name + "\nAddress = " + address +
                "\nTelephone Number = " + telephoneNumber + "\nEmail Address = " + emailAddress;
    }
}
