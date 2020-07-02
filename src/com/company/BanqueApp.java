package com.company;

import java.util.ArrayList;

public class BanqueApp {

    public static void main(String[] args) {

        ArrayList<Client> clients = new ArrayList<Client>();

//      Création des clients
        Client c1 = new Client(1, "Client1");
        Client c2 = new Client(2, "Client2");
        Client c3 = new Client(3, "Client3");
        Client c4 = new Client(4, "Client4");

//      Ajout des clients à l'arrayList clients
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);

        System.out.println("Banque DuTresor \n ======================");

//      Listing des client de la banque
        System.out.println("Liste initiale des clients:");
        for (int i = 0; i < clients.size(); i++ ) {
            System.out.println("\t" + clients.get(i));
        }

//      Ajout des comptes courrants au clients
        for (Client client : clients) {
            CompteCourant compteCourant = new CompteCourant(client.getNumero() * 1000 + 1, client);
            CompteEpargne compteEpargne = new CompteEpargne(client.getNumero() * 1000 + 2, client, compteCourant, 50);
            client.addCompte(compteCourant);
            client.addCompte(compteEpargne);
        }

//      Ajout de crédit sur les comptes d'un client
        clients.get(1).getComptes().get(0).credit(1000);
        clients.get(1).getComptes().get(1).credit(300);

//      Listing des client de la banque
        for (Client client : clients) {
            System.out.println("\t" + client);
        }

//        Transfert du compte
        CompteEpargne ce1 = (CompteEpargne) clients.get(1).getComptes().get(1);
        ce1.transfert();

//      Listing des client de la banque
        for (Client client : clients) {
            System.out.println("\t" + client);
        }

        Fenetre fenetre = new Fenetre(clients.get(1));


    }
}
