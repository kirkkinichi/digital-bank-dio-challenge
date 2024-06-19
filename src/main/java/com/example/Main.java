package com.example;

public class Main {
    public static void main(String[] args) {

        Client kirk = new Client();
        kirk.setName("Kirk");

        Client fulano = new Client();
        fulano.setName("Fulano");

        Client ciclano = new Client();
        ciclano.setName("Ciclano");

        Bank itau = new Bank();
        itau.setName("Itau");
        
        itau.addClient(kirk);
        itau.addClient(fulano);
        itau.addClient(ciclano);

        System.out.println(String.format("-- %s Bank --", itau.getName()));
        System.out.println("Clients: ");
        itau.listAllClients();

        Account caKirk = new CheckingAccount(kirk);
        Account saKirk = new SavingsAccount(kirk);
        
        caKirk.setStatus(true);
        saKirk.setStatus(true);

        caKirk.printAccountInfo();
        saKirk.printAccountInfo();
    }
}