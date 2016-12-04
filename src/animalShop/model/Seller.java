package animalShop.model;

import animalShop.db.AppDataContainer;

/**
 * Created by Lida on 04.12.2016.
 */
public class Seller {
    private int ID;
    private String name;
    private double salary;

    public Seller(int ID, String name, double salary) {
        this.ID = ID++;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
