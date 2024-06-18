package com.example;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
    
    private String name;
    private List<Client> clients;

    public Bank() {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void listAllClients() {
        for (Client client : clients) {
            System.out.println(String.format("- %s", client.getName()));
        }
    }
}
