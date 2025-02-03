package com.example.banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Created test for BankService.
class BankServiceTest {

    // Created test for creating account.
    @Test
    void testCreateAccount() {
        BankService bankService = new BankService();
        bankService.createAccount("5678", 100);

        BankAccount account = bankService.getAccount("5678");
        assertNotNull(account);
        assertEquals(100, account.getBalance());
    }

    // Created test for existing accounts.
    @Test
    void testExistingAccount() {
        BankService bankService = new BankService();
        bankService.createAccount("8765", 200);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bankService.createAccount("8765", 200);
        });

        assertEquals("Account already exists.", exception.getMessage());
    }

    // Created test for getting existing account.
    @Test
    void testGetExistingAccount() {
        BankService bankService = new BankService();
        bankService.createAccount("6857", 100);

        BankAccount account = bankService.getAccount("6857");
        assertNotNull(account);
        assertEquals(100, account.getBalance());
    }

    // Created test for getting non-existent account.
    @Test
    void testNonexistingAccount() {
        BankService bankService = new BankService();
        BankAccount account = bankService.getAccount("0000");

        assertNull(account);
    }
    
}
