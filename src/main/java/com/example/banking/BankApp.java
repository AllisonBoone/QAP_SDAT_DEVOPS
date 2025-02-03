package com.example.banking;

// Created main class.
public class BankApp {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.createAccount("1234",1000);

        BankAccount account = bankService.getAccount("1234");
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
    
}
