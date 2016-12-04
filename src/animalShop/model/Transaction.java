package animalShop.model;

import animalShop.model.goods.Beasts;

/**
 * Created by Lida on 04.12.2016.
 */
public class Transaction {

    private Beasts beasts;
    private double price;
    private Client client;
    private MyDate transactionTime;

    public Transaction(Beasts beasts, double price, Client client, MyDate transactionTime) {
        this.beasts = beasts;
        this.price = price;
        this.client = client;
        this.transactionTime = transactionTime;
    }

    public Beasts getBeasts() {
        return beasts;
    }

    public double getPrice() {
        return price;
    }

    public Client getClient() {
        return client;
    }

    public MyDate getTransactionTime() {
        return transactionTime;
    }
}
