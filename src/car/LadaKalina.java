package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class LadaKalina extends Koryto {
    private boolean aromaticTreeForCar;
    private String stickerOnBumper;

    public LadaKalina(Wheel[] wheels, Door[] doors, Engine engine,
                      int weight, boolean aromaticTreeForCar, String stickerOnBumper) {
        super(wheels, doors, engine, weight);
        this.aromaticTreeForCar = aromaticTreeForCar;
        this.stickerOnBumper = stickerOnBumper;
    }

    @Override
    public String toString() {
        return "LadaKalina{" +
                "aromaticTreeForCar=" + aromaticTreeForCar +
                ", stickerOnBumper='" + stickerOnBumper + '\'' +
                "} " + super.toString();
    }
}

