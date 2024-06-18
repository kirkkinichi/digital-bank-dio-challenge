package com.example;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printAccountInfo() {
        System.out.println("-- Savings Account --");
        super.printCommonInfo();
    }
}
