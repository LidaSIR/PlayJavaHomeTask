package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class Door {
    private int height;
    private int weight;
    private Window window;

    public Door(int height, int weight, Window window) {
        this.height = height;
        this.weight = weight;
        this.window = window;
    }

    @Override
    public String toString() {
        return "Door{" +
                "height=" + height +
                ", weight=" + weight +
                ", window=" + window +
                '}';
    }
}
