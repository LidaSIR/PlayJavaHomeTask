package animalShop.model.goods;

/**
 * Created by Lida on 04.12.2016.
 */
public class Beasts {
    private int ID;
    private String name;
    private String kind;
    private Sex sex;
    private Bellyful bellyful;
    private double price;

    public Beasts(String name, String kind, Sex sex,double price) {
        this.ID = ID++;
        this.name = name;
        this.kind = kind;
        this.sex = sex;
        this.bellyful = Bellyful.HUNGRY;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public Sex getSex() {
        return sex;
    }

    public Bellyful getBellyful() {
        return bellyful;
    }

    public void setBellyful(Bellyful bellyful) {
        this.bellyful = bellyful;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beasts{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", sex=" + sex +
                ", bellyful=" + bellyful +
                ", price=" + price +
                '}';
    }
}

