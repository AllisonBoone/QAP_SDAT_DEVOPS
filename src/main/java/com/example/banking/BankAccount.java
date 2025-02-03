package main.java.com.example.banking;

// Created class for deposit, withdrawal and account balance.
public class BankAccount {
    private String accountNumber;
    private double balance;

    // Created the constructor.
    public BankAccount (String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Gets current account balance.
    public double getBalance() {
        return balance;
    }

    // Deposit money into account.
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be a positive amount.");
        }

        balance += amount;
    }

    // Withdraw money from account.
    public void withdraw(double amount) {
        if (amount <= 0 ) {
            throw new IllegalArgumentException("Withdrawal must be a positive amount.");
        } 

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        balance -= amount;
    }
}