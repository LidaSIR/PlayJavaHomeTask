import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Lida on 30.10.2016.
 */
public class Sun extends GraphicsProgram {
    static final int SUNLIGHT = 30;
    static final int RADIUS = 360;

    public void run(){
        this.setSize(600,600);
        GOval sun = createCircle(300,250,150,Color.yellow);
        add(sun);
        System.out.println(sun.getLocation());

//        GLine a = new GLine(150,100, 150,150);
//        a.setColor(Color.yellow);
//        add(a);
    }
    private GOval createCircle(int x, int y, int radius, Color color){
        GOval oval = new GOval(x-radius,y-radius,2*radius, 2*radius);
        oval.setFilled(true);
        oval.setColor(color);
        for(int i = 0; i < SUNLIGHT; i++) {
            int plus = 30;
            GLine a = new GLine(x - radius, y - radius, 2 * radius, 2 * radius);
            plus += 30;
            a.setColor(Color.yellow);
            add(a);
        }
        return oval;
    }
}
