package com.company;

public class CompteEpargne extends Compte {

    private float montantTransfert;
    private CompteCourant compteTransfert;

    public CompteEpargne(long numero, Client c, CompteCourant compteTransfert, float montantTransfert) {
        super(numero, c);

        this.montantTransfert = montantTransfert;
        this.compteTransfert = compteTransfert;
    }

    public void transfert(){
        this.compteTransfert.setSolde(this.compteTransfert.getSolde() - this.montantTransfert);
        this.setSolde(this.montantTransfert);
    }

    public float getMontantTransfert(){
        return this.getMontantTransfert();
    }

    public CompteCourant getCompteTransfert(){
        return this.compteTransfert;
    }

    public String toString() {
        return new String("Compte épargne no  " + this.getNumero() + " - Solde : " + this.getSolde());
    }
}
