package lab_1;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Lida on 13.11.2016.
 */
public class Target extends GraphicsProgram {
    public void run(){
        this.setSize(600,600);

        GOval end = createCircle(300,300,90,Color.RED);
        add(end);
        GOval middle = createCircle(300,300,60, Color.white);
        add(middle);
        GOval center = createCircle(300,300, 30,Color.RED);
        add(center);


    }
    private GOval createCircle(int x, int y, int radius, Color color){
        GOval oval = new GOval(x-radius,y-radius,2*radius, 2*radius);
        oval.setFilled(true);
        oval.setColor(color);
        return oval;
    }
}
