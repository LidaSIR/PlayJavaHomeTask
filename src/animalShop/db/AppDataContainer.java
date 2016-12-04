package animalShop.db;

import animalShop.model.goods.Beasts;
import animalShop.model.Client;
import animalShop.model.Seller;
import animalShop.model.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lida on 04.12.2016.
 */
public class AppDataContainer {
    private List<Beasts> beasts;
    private  List<Transaction> transactions;
    private List<Beasts> soldBeasts;
    private List<Client> clients;
    private List<Seller> sellers;

    public AppDataContainer(List<Beasts> beasts, List<Transaction> transactions, List<Beasts> soldBeasts,
                            List<Client> clients, List<Seller> sellers) {
        this.beasts = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.soldBeasts = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.sellers = new ArrayList<>();
    }

    public List<Beasts> getBeasts() {
        return beasts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Beasts> getSoldBeasts() {
        return soldBeasts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Seller> getSellers() {
        return sellers;
    }
}
