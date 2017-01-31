package com.galvanize;

import java.util.List;

/**
 * Created by willfuger on 1/30/17.
 */
public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // street getter and setter
    public String getStreet() {
        return this.street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    // state getter and setter
    public String getState() {
        return this.state;
    }
    public void setState(String state) {
        this.state = state;
    }

    // city getter and setter
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // zip getter and setter
    public String getZip() {
        return this.zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s %s", this.street, this.city, this.state, this.zip);
    }
}

interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
