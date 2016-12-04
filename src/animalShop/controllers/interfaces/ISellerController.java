package animalShop.controllers.interfaces;

import animalShop.model.Client;
import animalShop.model.Transaction;
import animalShop.model.goods.Beasts;
import animalShop.model.goods.Sex;

import java.util.List;

/**
 * Created by Lida on 04.12.2016.
 */
public interface ISellerController {

    Beasts feedBeasts(Beasts beasts);
    Transaction makeTransaction(Beasts beasts, double price, Client client)throws IllegalArgumentException;
    Client addClient(String name,String telephone, String email, Beasts[] pets) throws IllegalArgumentException;
    Beasts addBeasts(String name, String kind, Sex sex, double price)throws IllegalArgumentException;
    List<Beasts>  findBeastsByKind(String kind)throws IllegalArgumentException;
}
