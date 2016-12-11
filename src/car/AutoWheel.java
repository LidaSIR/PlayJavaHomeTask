package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class AutoWheel extends Wheel {
    private int StaticTireRadius;

    public AutoWheel(int radius, int spoke, int rim, int staticTireRadius) {
        super(radius, spoke, rim);
        StaticTireRadius = staticTireRadius;
    }

    @Override
    public String toString() {
        return "AutoWheel{" +
                "StaticTireRadius=" + StaticTireRadius +
                '}';
    }
}
