package car;

/**
 * Created by Lida on 06.12.2016.
 */
public class VAZ {
    public static void main(String[] args) {
        Engine engineForKolymaga = new Engine(20,"coal",2);
        Window window = new Window("black",60,50,2.0);
        Door[] doors = new Door[2];
        Door leftDoor = new Door(120,100,window);
        Door againLeftDoor = new Door(120,100,window);
        doors[0] = leftDoor;
        doors[1] = againLeftDoor;


        LadaKalina kolymaga = new LadaKalina(new Wheel[4],doors,engineForKolymaga,120,true,"Still better than bike");
        // wheels you may buy separately :))
        System.out.println(kolymaga);
    }
}
