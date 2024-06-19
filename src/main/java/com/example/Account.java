package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account implements AccountInterface {

    protected static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected boolean status;
    protected Client client;
    
    
    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENCIAL++;
        this.client = client;
        this.status = status;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }
    
    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void transfer(double value, Account aimedAccount) {
        this.withdraw(value);
        aimedAccount.deposit(value);
    }

    @Override
    public void changeStatus(boolean status) {
        if (this.status == true) {
            this.status = false;
        } else {
            this.status = true;
        }
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Client name: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
        if (this.status == true) {
            System.out.println("Status: Active");
        } else {
            System.out.println("Status: Inactive");
        }
    }
}
