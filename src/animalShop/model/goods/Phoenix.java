package animalShop.model.goods;

/**
 * Created by Lida on 04.12.2016.
 */
public class Phoenix extends Beasts {

    private int rebornAmount;

    public Phoenix(String name, String kind, Sex sex, Bellyful bellyful, double price, int rebornAmount) {
        super(name, kind, sex, bellyful, price);
        this.rebornAmount = rebornAmount;
    }

    public int getRebornAmount() {
        return rebornAmount;
    }

    public void setRebornAmount(int rebornAmount) {
        this.rebornAmount = rebornAmount;
    }

    @Override
    public String toString() {
        return "Phoenix{" +
                "rebornAmount=" + rebornAmount +
                '}';
    }
}
