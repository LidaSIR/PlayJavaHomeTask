package lab_1;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Created by Lida on 13.11.2016.
 */
public class Pyramid extends GraphicsProgram {
    private static int BRICK_WIDTH = 30;
    private static int BRICK_HEIGHT = 12;
    private static int BRICKS_IN_BASE = 14;
    private static int WINDOW_WIDTH = 600;
    private static int WINDOW_HEIGHT = 600;
    private static int HORIZONTAL_PYRAMID_START = (WINDOW_WIDTH / 2) - ((BRICKS_IN_BASE / 2) * BRICK_WIDTH);

   private int y_rayStart = HORIZONTAL_PYRAMID_START;
    public void run() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        drawFirstRow();

    }

    private void drawFirstRow() {
        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            int y_ray = y_rayStart + BRICK_HEIGHT * i;
            int x_rayStart = (WINDOW_WIDTH - (i + 1) * BRICK_WIDTH) / 2;
            for (int j = 0; j <= i; j++) {
                int x_ray = x_rayStart + j * BRICK_WIDTH;
                GRect brick = new GRect(x_ray, y_ray, BRICK_WIDTH, BRICK_HEIGHT);
                brick.setFilled(true);
                add(brick);
            }
        }
    }
}

