package animalShop.model;

import animalShop.model.goods.Beasts;

import java.util.Arrays;

/**
 * Created by Lida on 04.12.2016.
 */
public class Client {

    private String name;
    private String telephone;
    private String email;
    private Beasts[] pets;

    public Client(String name, String telephone, String email, Beasts[] pets) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.pets = pets;
    }

    public Client(String name, String telephone, Beasts[] pets) {
        this.name = name;
        this.telephone = telephone;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Beasts[] getPets() {
        return pets;
    }

    public void setPets(Beasts[] pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", pets=" + Arrays.toString(pets) +
                '}';
    }
}
