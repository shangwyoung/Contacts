package com.example.aarony.contacts;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by aarony on 11/28/15.
 */
@SuppressWarnings("serial")
public class Contact implements Serializable{
    public String name;
    public String company;
    public String detailsURL;
    public String smallImageURL;
    public String birthdate;
    public String Wphone;
    public String Hphone;
    public String Mphone;

    // details
    public boolean favorite;
    public String largeImageURL;
    public String email;
    public String website;
    // address
    public String street;
    public String city;
    public String state;
    public String country;
    public String zip;

    public Contact(String name, String company, String detailsURL, String smallImageURL, String birthdate, String Wphone, String Hphone, String Mphone) {
        this.name = name;
        this.company = company;
        this.detailsURL = detailsURL;
        this.smallImageURL = smallImageURL;
        this.birthdate = birthdate;
        this.Wphone = (Wphone != "") ? Wphone : "";
        this.Hphone = (Hphone != "") ? Hphone : "";
        this.Mphone = (Mphone != "") ? Mphone : "";

        // details variables
        this.street = "";
        this.city = "";
        this.state = "";
        this.country = "";
        this.zip = "";
    }

    public String getName() {
        return this.name;
    }

    public String getCompany() {
        return this.company;
    }




}
