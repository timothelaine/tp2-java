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
        /*for (int i = 0; i < clients.size(); i++ ) {
//          Création du compte courrant
            CompteCourant cc = new CompteCourant(clients.get(i).getNumero() * 1000 + 1, clients.get(i));
//          Création du compte épargne
            CompteEpargne ce = new CompteEpargne(clients.get(i).getNumero() * 1000 + 2, clients.get(i), cc, 50);

//          Ajout des comptes créés au client
            clients.get(i).addCompte(cc);
            clients.get(i).addCompte(ce);
        }*/

        for (Client client : clients) {
            CompteCourant compteCourant = new CompteCourant(client.getNumero() * 1000 + 1, client);
            client.addCompte(compteCourant);
            client.addCompte(new CompteEpargne(client.getNumero() * 1000 + 2, client, compteCourant, 50));
        }

//      Ajout de crédit sur les comptes d'un client
        clients.get(1).getComptes().get(0).credit(1000);
        clients.get(1).getComptes().get(1).credit(300);

//      Listing des client de la banque
        for (int i = 0; i < clients.size(); i++ ) {
            System.out.println("\t" + clients.get(i));
        }

//        Transfert du compte
        CompteEpargne ce1 = (CompteEpargne) clients.get(1).getComptes().get(1);
        ce1.transfert();

//      Listing des client de la banque
        for (int i = 0; i < clients.size(); i++ ) {
            System.out.println("\t" + clients.get(i));
        }

        Fenetre fenetre = new Fenetre(clients.get(1));


    }
}
