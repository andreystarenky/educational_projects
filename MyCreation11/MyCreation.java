/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Oct 22, 2018
   This is the MyCreation Class which calls other objects, and runs the animations
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation   //My Creation Class
{
    Console c;           // The output console

    public void introduction ()     //Draws the introduction screen
    {
	Introduction i = new Introduction (c);
    }


    public void background ()       //Draws the background
    {
	Background b = new Background (c);
    }


    public void duck ()             //Calls the overloaded classes, ducks
    {
	Duck d0 = new Duck (c);
	d0.start ();
	Duck d1 = new Duck (c, -60);
	d1.start ();
	Duck d2 = new Duck (c, 70, new Color (83, 94, 0));
	d2.start ();
    }


    public void fish ()             //Animates the fish
    {
	Fish f = new Fish (c);
	f.run ();
    }


    public void plankton ()         //Animates the plankton
    {
	Plankton p = new Plankton (c);
	p.run ();
    }


    public void crocodile ()        //Animates crocodile
    {
	Crocodile croc = new Crocodile (c);
	croc.run ();
    }


    public void hovercraft ()               //Runnable Thread
    {
	Hovercraft h = new Hovercraft (c);
	new Thread (h).start ();            //Starts Hovercraft as a Runnable Thread
    }


    public void lobster ()              //Animates lobster
    {
	Lobster l = new Lobster (c);
	l.run ();
    }


    public void ending ()               //Draws the ending screen
    {
	Ending e = new Ending (c);
    }


    public MyCreation ()                //My Creation constructor
    {
	c = new Console ("My Creation");
    }


    public static void main (String[] args)     //Main Method
    {
	MyCreation m = new MyCreation ();
	m.introduction ();
	m.background ();
	m.duck ();
	m.fish ();
	m.plankton ();
	m.crocodile ();
	m.hovercraft ();
	m.lobster ();
	m.ending ();
    }
} //End of class


