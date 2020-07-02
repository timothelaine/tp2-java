package com.company;

public class CompteCourant extends Compte{

    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }

    public String toString() {
        return new String("Compte courant no " + this.getNumero() + " - Solde : " + this.getSolde());
    }
}
