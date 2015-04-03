package com.android.Treasure_Of_Boku;

import android.gameengine.icadroids.objects.GameObject;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * @author Jonathan Daniel on 22-3-2015.
 */
public class Rectangle extends GameObject {
    /**
     * X-coordinate of the rectangle.
     */
    private int x;

    /**
     * Y-coordinate of the rectangle.
     */
    private int y;

    /**
     * Width of the rectangle.
     */
    private int width;

    /**
     * Height of the rectangle.
     */
    private int height;

    /**
     * Rectangle's color.
     */
    private int color;

    /**
     * Game's Main instance.
     */
    private Main gameEngine;

    /**
     * Constructor.
     *
     * @param x      X coordinate.
     * @param y      Y coordinate.
     * @param width  Width.
     * @param height Height.
     */
    Rectangle(Main gameEngine, int x, int y, int width, int height, int color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.gameEngine = gameEngine;
    }

    @Override
    public void drawGameObject(Canvas canvas) {
        super.drawGameObject(canvas);
        Paint rectP = new Paint();
        rectP.setColor(this.color);
        rectP.setStrokeWidth(3);

        // Draw the rectangle.
        canvas.drawRect(this.x, this.y, this.x + width, this.y + height, rectP);
    }
}
