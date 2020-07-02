package com.company;

public class Compte {
    private long numero;
    private Client client;
    private float solde;

    public Compte(long numero, Client c) {

    }

    public float getSolde() {
        return 123;
    }

    public Client getClient() {
        return new Client(1, "23");
    }

    public long getNumero() {
        return 123;
    }

    public String toString() {
        return new String("");
    }

    public void main(String [] args) {

    }
}
