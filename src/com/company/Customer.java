package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<ShippingAddress>  accounts;

    public Customer(String customerName, int customerID){
        customerName = name;
        customerID = customerID;
        accounts = new ArrayList<ShippingAddress>();
    }

    public customerAccount createAccount(){
        var newAccount = new customerAccount();
        var didSucceed = accounts.add(newAccount);
        return newAccount;
    }

    public String getName() {
        return name;
    }

    public String getCustomerID(){
        return customerID;
    }

    public Optional<Object> closeAccount(int customerID){
        for (var account: accounts){
            if (account.getAccountID() == customerID){
                System.out.println("Removing account with ID number: "+customerID+" from customer "+name);
                accounts.remove(account);
                return Optional.of(account);
            }
        }
        System.out.println("Account with account number: " +customerID+ " is not " +name+ "'s account.");
        return Optional.empty();
        return null;
    }
    
    public int getCustomerID(){
        return customerID;
    }
    public String getName(){
        return name;
    }

    public String createCustomerID(String customerID) {
        return customerID;
    }
}
