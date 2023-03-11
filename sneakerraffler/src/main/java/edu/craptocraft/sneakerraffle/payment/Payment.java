package edu.craptocraft.sneakerraffle.payment;

public interface Payment {

    boolean autentication(String user);
    boolean pay(String user, Double credit);
    Double credit(String user);
}
