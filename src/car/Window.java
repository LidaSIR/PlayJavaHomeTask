package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class Window {
    private String color;
    private int height;
    private int weight;
    private double thickness;

    public Window(String color, int height, int weight, double thickness) {
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Window{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", thickness=" + thickness +
                '}';
    }
}
