package lab_1;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Lida on 13.11.2016.
 */
public class Diagram extends GraphicsProgram{
    private static int BRICK_WIDTH = 105;
    private static int BRICK_HEIGHT = 50;
    private static int WINDOW_WIDTH = 600;

    public void run(){
        int halfOfWindowWidth = WINDOW_WIDTH/2;
        GRect diagramPick = new GRect(halfOfWindowWidth,50,BRICK_WIDTH,BRICK_HEIGHT);
        add(diagramPick);
        GRect middleBrick = new GRect(halfOfWindowWidth,150,BRICK_WIDTH,BRICK_HEIGHT);
        add(middleBrick);
        GRect leftBrick = new GRect(halfOfWindowWidth - BRICK_WIDTH*2,150,BRICK_WIDTH,BRICK_HEIGHT);
        add(leftBrick);
        GRect rightBrick = new GRect(halfOfWindowWidth + BRICK_WIDTH*2,150,BRICK_WIDTH,BRICK_HEIGHT);
        add(rightBrick);

       GLine pointer1 = new GLine(halfOfWindowWidth + BRICK_WIDTH/2,100, (halfOfWindowWidth - BRICK_WIDTH*2) + BRICK_WIDTH/2,150);
        add(pointer1);
        GLine pointer2 = new GLine(halfOfWindowWidth + BRICK_WIDTH/2,100, halfOfWindowWidth + BRICK_WIDTH/2, 150);
        add(pointer2);
        GLine pointer3 = new GLine(halfOfWindowWidth + BRICK_WIDTH/2,100, (halfOfWindowWidth + BRICK_WIDTH*2) + BRICK_WIDTH/2,150);
        add(pointer3);

        GLabel pick = new GLabel("Program",halfOfWindowWidth + 20,75);
        add(pick);
        GLabel leftLine = new GLabel("GraphicsPrograms",halfOfWindowWidth - BRICK_WIDTH*2,175);
        add(leftLine);
        GLabel middleLine = new GLabel("ConsolePrograms",halfOfWindowWidth,175);
        add(middleLine);
        GLabel rightLine = new GLabel("DialogProgram",(halfOfWindowWidth + BRICK_WIDTH*2)+5,175);
        add(rightLine);

    }
}
