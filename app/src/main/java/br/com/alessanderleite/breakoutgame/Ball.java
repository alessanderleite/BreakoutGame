package br.com.alessanderleite.breakoutgame;

import android.graphics.RectF;

public class Ball {

    RectF rect;
    float xVelocity;
    float yVelocity;
    float ballWidth = 10;
    float ballHeight = 10;

    public Ball(int screenX, int screenY) {

        // Start the ball travelling straight up at 100 pixels per second
        xVelocity = 200;
        yVelocity = -400;

        // Place the ball in the centre of the screen at the bottom
        // Make it a 10 pixel x 10 pixel square
        rect = new RectF();
    }

}
