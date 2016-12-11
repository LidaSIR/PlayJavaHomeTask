package car;

import java.util.Arrays;

/**
 * Created by Lida on 06.12.2016.
 */
public class Koryto {
    private Wheel[] wheels;
    private Door [] doors;
    private Engine engine;
    private int weight;

    public Koryto(Wheel[] wheels, Door[] doors, Engine engine, int weight) {
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Koryto{" +
                "wheels=" + Arrays.toString(wheels) +
                ", doors=" + Arrays.toString(doors) +
                ", engine=" + engine +
                ", weight=" + weight +
                '}';
    }
}
