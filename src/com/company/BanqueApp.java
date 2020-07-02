package com.company;

import java.util.ArrayList;

public class BanqueApp {

    public static void main(String[] args) {

        ArrayList<Client> clients = new ArrayList<Client>();

//        Création des clients
        Client c1 = new Client(1, "Client1");
        Client c2 = new Client(2, "Client2");
        Client c3 = new Client(3, "Client3");
        Client c4 = new Client(4, "Client4");

//        Ajout des clients à l'arrayList clients
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);

//        Listing des client de la banque
        System.out.println("Client :");
        for (int i = 0; i < clients.size(); i++ ) {
            System.out.println("\t" + clients.get(i));
        }

//        Ajout des comptes au clients


    }
}
