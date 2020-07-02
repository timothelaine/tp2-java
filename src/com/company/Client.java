package com.company;

public class Client {
    private long numero;
    private String nom;

    public Client(long numero, String nom)
    {
        this.numero = numero;
        this.nom = nom;
    }

    public long getNumero()
    {
        return this.numero;
    }

    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return new String("Client " +this.numero+" "+this.nom+"\n");
    }
}
