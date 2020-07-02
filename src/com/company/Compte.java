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

        Compte com1 = new Compte(10,c1);
        Compte com2 = new Compte(20,c2);
        System.out.println(com1);
        System.out.println(com2);
    }
}
