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
        return new String("Compte " + this.numero + this.client.toString() + " - Solde : " + this.solde);
    }

    public void main(String [] args) {

    }
}
