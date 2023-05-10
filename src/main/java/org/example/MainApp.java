package org.example;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works
        int worldWidth = 400;
        int worldHeight = 400;

        // The world is your canvas
        World world = new World(worldWidth, worldHeight);
        Turtle turtle = new Turtle(world,0, 0);
        
        int width = 400;
        int height = 400;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);



        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(360);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();

        turtle.goTo(0, 0);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();


        turtle.goTo(100, -200);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnRight(90);
        turtle.forward();
    }
}
