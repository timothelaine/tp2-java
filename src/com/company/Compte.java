package com.company;

public class Compte {
    private long numero;
    private Client client;
    private float solde;

    public Compte(long numero, Client c) {
        this.numero = numero;
        this.client = c;
    }

    public float getSolde() {
        return this.solde;
    }

    public void setSolde(float solde) {
         this.solde = solde;
    }

    public Client getClient() {
        return this.client;
    }

    public long getNumero() {
        return this.numero;
    }

    public String toString() {
        return new String("Compte " + this.numero + " - client " + this.client.getNom() + " - Solde : " + this.solde);
    }

    public static void main(String [] args) {
        Client c1= new Client(1, "Martin");
        Client c2= new Client(2, "Dupond");
        Client c3= new Client(3, "Bob");

        Compte com1 = new Compte(10,c1);
        Compte com3 = new Compte(30,c1);
        c1.addCompte(com1);
        c1.addCompte(com3);
        Compte com2 = new Compte(20,c2);
        c2.addCompte(com2);

        com1.credit(500.0254f);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public void credit(float ajout_solde) {
        this.solde = this.solde+ajout_solde;
    }
}
