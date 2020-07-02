package com.company;

import java.util.ArrayList;

public class Client {

    private long numero;
    private String nom;
    private ArrayList<Compte> comptes;

    public Client(long numero, String nom)
    {
        this.numero = numero;
        this.nom = nom;
        this.comptes = new ArrayList<>();
    }

    public long getNumero()
    {
        return this.numero;
    }

    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String toString() {
        StringBuilder infos = new StringBuilder();
        infos.append("Client ").append(this.numero).append(" - ").append(this.nom).append("\n");

        if(this.comptes.isEmpty()) {
            infos.append("pas de compte rattaché à ce client\n");
            return infos.toString();
        }

        for (Compte compte : this.comptes) {
            infos.append("Compte n°").append(compte.getNumero()).append(" - solde : ").append(compte.getSolde()).append("\n");
        }
        return infos.toString();
    }

    public void addCompte(Compte c) {
        this.comptes.add(c);
    }

    public ArrayList<Compte> getComptes() {
        return this.comptes;
    }
}
