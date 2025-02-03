package com.example.banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Created test for BankAccount.
class BankAccountTest {

    // Created test for deposit method.
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount("4321", 100);
        account.deposit(200);
        assertEquals(300, account.getBalance());
    }

    // Created test for withdraw method.
    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount("1324", 500);
        account.withdraw(300);
        assertEquals(200, account.getBalance());
    }

    // Created test for insufficient funds exception.
    @Test
    void testInsufficientFunds() {
        BankAccount account = new BankAccount("4231", 100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });

        assertEquals("Insufficient funds.", exception.getMessage());
    }

    // Created test for negative deposit exception.
    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount("1111", 100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-20);
        });

        assertEquals("Deposit must be a positive amount.", exception.getMessage());
    }

    // Created test for negative withdrawal exception.
    @Test
    void testNegativeWithdraw() {
        BankAccount account = new BankAccount("2222", 100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-20);
        });

        assertEquals("Withdrawal must be a positive amount.", exception.getMessage());

    }
    
}
