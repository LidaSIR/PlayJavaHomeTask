package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class Engine {
    private int volume;
    private String fuel;
    private int cylinders;

    public Engine(int volume, String fuel, int cylinders) {
        this.volume = volume;
        this.fuel = fuel;
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", fuel='" + fuel + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }
}
