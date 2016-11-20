import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Lida on 25.10.2016.
 */
public class Home extends GraphicsProgram{
    public void run(){
        this.setSize(600,600);

        GRect square = new GRect(200,250,200,200);
        square.setColor(Color.lightGray);
        square.setFilled(true);
        add(square);

        GLine roofLine = new GLine(180,250,420,250);
        add(roofLine);
        GLine roofLine2 = new GLine(180,250,300,110);
        add(roofLine2);
        GLine roofLine3 = new GLine(420,250,300,110);
        add(roofLine3);
        paintRoof();

        GRect door = new GRect(350,380,50,70);
        door.setColor(Color.darkGray);
        door.setFilled(true);
        add(door);

        GOval handle = new GOval(395,420,5,4);
        handle.setFilled(true);
        handle.setColor(Color.white);
        add(handle);

        GRect window = new GRect(250,300,50,50);
        window.setColor(Color.white);
        window.setFilled(true);
        add(window);
        paintFrame();

        GRect windowPartition = new GRect(275,300,3,50);
        windowPartition.setColor(Color.black);
        windowPartition.setVisible(true);
        windowPartition.setFilled(true);
        add(windowPartition);

        GOval treeBranch = createCircle(500,300,35,Color.green);
        GOval treeBranch1 = createCircle(535,335,30,Color.GREEN);
        GOval treeBranch2 = createCircle(450,320,40,Color.GREEN);
        GOval treeBranch3 = createCircle(505,340,30,Color.GREEN);
        add(treeBranch3);
        add(treeBranch2);
        add(treeBranch1);
        add(treeBranch);

        GRect treeTrunk = new GRect(490,370,20,80);
        treeTrunk.setFilled(true);
        treeTrunk.setColor(Color.ORANGE);
        add(treeTrunk);
    }
    private void paintFrame(){
        for(int i = 251, j = 301; i < 256; i++, j++ ){
            GRect frame = new GRect(i,j,50,50);
            add(frame);
        }
    }
    private void paintRoof(){

        for(int i = 180; i < 420; i++){
       GLine paint = new GLine(i,250,300,110);
            add(paint);
        }
    }
    private GOval createCircle(int x, int y, int radius, Color color){
        GOval oval = new GOval(x-radius,y-radius,2*radius, 2*radius);
        oval.setFilled(true);
        oval.setColor(color);
        return oval;
    }

}
