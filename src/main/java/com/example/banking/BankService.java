package com.example.banking;

import java.util.HashMap;
import java.util.Map;

// Created class for multiple accounts.
public class BankService {
    private Map<String, BankAccount> accounts = new HashMap<>();

    // Creates a new account.
    public void createAccount(String accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account already exists.");
        }

        accounts.put(accountNumber, new BankAccount(accountNumber, initialBalance));
    }

    // Gets an existing account.
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    
}
