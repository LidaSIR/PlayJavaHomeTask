import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**Обличчя складається з чотирьох частинок - голова, два ока, і рот
Використати константи HEAD_WIDTH, HEAD_HEIGHT, EYE_RADIUS, MOUTH_WIDTH, MOUTH_HEIGHT
 */

public class RobotFace extends GraphicsProgram {
    private static final int HEAD_WIDTH = 200;
    private static final int HEAD_HEIGHT = 300;
    private static final int EYE_RADIUS = 50;
    private static final int MOUTH_WIDTH = 100;
    private static final int MOUTH_HEIGHT = 50;
    public void run(){
        this.setSize(600,600);

        GRect head = new GRect(200,75, HEAD_WIDTH, HEAD_HEIGHT);
        head.setFilled(true);
        head.setColor(Color.darkGray);
        add(head);

        GOval eye = new GOval(250,120,EYE_RADIUS,EYE_RADIUS);
        eye.setFilled(true);
        eye.setColor(Color.RED);
        add(eye);

        GOval eye1 = new GOval(310,120,EYE_RADIUS,EYE_RADIUS);
        eye1.setFilled(true);
        eye1.setColor(Color.RED);
        add(eye1);

        GRect mouth = new GRect(255,250, MOUTH_WIDTH, MOUTH_HEIGHT);
        mouth.setFilled(true);
        mouth.setColor(Color.pink);
        add(mouth);
    }
}
