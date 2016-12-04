package animalShop.model.goods;

import animalShop.model.goods.Beasts;
import animalShop.model.goods.Bellyful;
import animalShop.model.goods.Sex;

/**
 * Created by Lida on 04.12.2016.
 */
public class Unicorn extends Beasts {

    private boolean corn;

    public Unicorn(String name, String kind, Sex sex, Bellyful bellyful, double price, boolean corn) {
        super(name, kind, sex, bellyful, price);
        this.corn = corn;
    }

    public boolean isCorn() {
        return corn;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "corn=" + corn +
                '}';
    }
}
