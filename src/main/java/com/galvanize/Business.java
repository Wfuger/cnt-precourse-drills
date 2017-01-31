package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willfuger on 1/30/17.
 */
public class Business implements Addressable {


    private final String name;
    private final ArrayList<Address> addresses = new ArrayList<Address>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public List<Address> getAddresses() {
        return this.addresses;
    }

    @Override
    public void addAddress(Address address) {
        this.addresses.add(address);
    }

}
