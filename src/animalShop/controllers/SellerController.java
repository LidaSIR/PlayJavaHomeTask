package animalShop.controllers;

import animalShop.controllers.interfaces.ISellerController;
import animalShop.db.AppDataContainer;
import animalShop.model.Client;
import animalShop.model.MyDate;
import animalShop.model.Transaction;
import animalShop.model.goods.Beasts;
import animalShop.model.goods.Bellyful;
import animalShop.model.goods.Sex;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Lida on 04.12.2016.
 */
public class SellerController implements ISellerController {

    private AppDataContainer appDataContainer;

    @Override
    public Beasts feedBeasts(Beasts beasts) {
        if(beasts.getBellyful() == Bellyful.HUNGRY) {
            beasts.setBellyful(Bellyful.FULL);
        }
        return beasts;
    }

    @Override
    public Transaction makeTransaction(Beasts beasts, double price, Client client)throws IllegalArgumentException {
        if(beasts == null || client == null) {
            throw new IllegalArgumentException();
        }

        MyDate myDate = MyDate.getMyDate();
        Transaction transaction = new Transaction(beasts,price,client, myDate);
        appDataContainer.getTransactions().add(transaction);
        return transaction;
    }

    @Override
    public Client addClient(String name,String telephone, String email, Beasts[] pets)throws IllegalArgumentException {
         if(name == null || telephone == null || email == null) throw new IllegalArgumentException();

        Client newClient = new Client(name,telephone,email,pets);
        appDataContainer.getClients().add(newClient);

        return newClient;
    }

    @Override
    public Beasts addBeasts(String name, String kind, Sex sex, double price) throws IllegalArgumentException {
        if(name == null || kind == null || sex == null) throw new IllegalArgumentException();
        Beasts newBeast = new Beasts(name,kind,sex,price);
        appDataContainer.getBeasts().add(newBeast);

        return newBeast;
    }

    @Override
    public List<Beasts> findBeastsByKind(String kind) throws IllegalArgumentException {
        if(kind == null) throw new IllegalArgumentException();
        List<Beasts> beasts= new ArrayList<>();
        for(Beasts beast : appDataContainer.getBeasts()){
            if(beast.getKind().equals(kind)){
               beasts.add(beast);
            }
        }
        return beasts;
    }

}
