package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class Wheel {
    private int radius;
    private int spoke;
    private int rim;

    public Wheel(int radius, int spoke, int rim) {
        this.radius = radius;
        this.spoke = spoke;
        this.rim = rim;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", spoke=" + spoke +
                ", rim=" + rim +
                '}';
    }
}
