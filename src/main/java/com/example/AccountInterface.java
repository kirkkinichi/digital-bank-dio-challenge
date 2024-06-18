package com.example;

public interface AccountInterface {
    
    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, Account aimedAccount);

    void printAccountInfo();
}
