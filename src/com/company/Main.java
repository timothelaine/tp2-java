package com.company;

public class Main {

    public static void main(String[] args) {

            Client c1 = new Client(1,"Martin");
            Client c2= new Client(2,"Dupond");
            Compte com1 = new Compte(10,c1);
            Compte com2 = new Compte(20,c2);
            System.out.println(com1);
            System.out.println(com2);
    }
}
