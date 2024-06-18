package com.example;

public class CheckingAccount extends Account { 
    
    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printAccountInfo() {
        System.out.println("-- Checking Account --");
        super.printCommonInfo();
    }
}
