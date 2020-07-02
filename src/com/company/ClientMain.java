package com.company;

public class ClientMain {

    public static void main(String[] args) {
        Client c1 = new Client(1, "Martin");
        Client c2 = new Client(2, "Dupond");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c2.setNom("Pichon");
        System.out.println(c2.toString());
    }
}
