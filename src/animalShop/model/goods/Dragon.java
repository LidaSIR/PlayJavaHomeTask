package animalShop.model.goods;

/**
 * Created by Lida on 04.12.2016.
 */
public class Dragon extends Beasts {

    private boolean fireSpewing;

    public Dragon(String name, String kind, Sex sex, Bellyful bellyful, double price, boolean fireSpewing) {
        super(name, kind, sex, bellyful, price);
        this.fireSpewing = fireSpewing;
    }

    public boolean isFireSpewing() {
        return fireSpewing;
    }

    public void setFireSpewing(boolean fireSpewing) {
        this.fireSpewing = fireSpewing;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "fireSpewing=" + fireSpewing +
                '}';
    }
}
