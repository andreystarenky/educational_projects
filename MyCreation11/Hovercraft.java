/*
   Name: Andrey Starenky
   Teacher: Ms. Krasteva
   Date: Oct 19 2018
   This class animates the hovercraft

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Hovercraft implements Runnable
{
    private Console c;
    private Color bodyColor = new Color (255, 255, 0);  //Color of the body of the Hovercraft
    private Color windshieldColor = new Color (0, 208, 255);  //Color of the body of the Hovercraft

    public void drawHovercraft ()
    {
	for (int z = 0 ; z < 300 ; z += 1)              //Animates HoverCraft to the right
	{
	    //Erase
	    c.setColour (new Color (193, 255, 255));
	    c.fillRect (-156 + z, 170, 155, 50);      //Sky Erase
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (-141 + z, 220, 140, 30);      //Water Erase
	    c.setColour (bodyColor);
	    c.fillArc (-140 + z, 200, 20, 40, 90, 180); //Inflatable Part
	    c.fillRect (-130 + z, 200, 120, 40);
	    c.fillArc (-20 + z, 200, 20, 40, 270, 180);
	    c.setColour (Color.black);
	    c.drawOval (-130 + z, 170, 15, 30);    //Properller frame
	    c.drawLine (-123 + z, 185, -130 + z, 188); //Probeller blades
	    c.drawLine (-123 + z, 185, -115 + z, 182);
	    c.drawLine (-123 + z, 185, -121 + z, 200);
	    c.drawLine (-123 + z, 185, -124 + z, 170);
	    c.drawLine (-127 + z, 195, -118 + z, 175);
	    c.drawLine (-116 + z, 193, -129 + z, 177);
	    c.drawLine (-135 + z, 185, -155 + z, 185); //Propeller wind trail
	    c.drawLine (-135 + z, 175, -150 + z, 175);
	    c.drawLine (-135 + z, 195, -150 + z, 195);
	    c.setColour (windshieldColor);  //Windshield
	    c.drawLine (-10 + z, 200, -40 + z, 180);
	    c.drawLine (-11 + z, 200, -41 + z, 180);
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColour (new Color (193, 255, 255));
	c.fillRect (144, 175, 21, 21);               //Erases wind trails
	try
	{
	    Thread.sleep (3000);                 //Delay before making hole
	}
	catch (Exception e)
	{
	}
	c.setColour (new Color (200, 200, 0));
	c.fillOval (270, 220, 20, 15);               //Makes the hole
	try
	{
	    Thread.sleep (500);                 //Delay before making hole
	}
	catch (Exception e)
	{
	}
	for (int z = 0 ; z < 290 ; z += 1)              //Animates HoverCraft down (sinking)
	{
	    //Erase
	    c.setColour (new Color (193, 255, 255));
	    c.fillRect (144, 169 + z, 155, 51 - z);  //Sky Erase
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (159, 220, 141, 30 + z);    //Water Erase
	    c.setColour (bodyColor);
	    if (z < 30)
	    {
		c.fillArc (160, 200 + z, 20, 40 - z, 90, 180); //Inflatable Part
		c.fillRect (170, 200 + z, 120, 40 - z);
		c.fillArc (280, 200 + z, 20, 40 - z, 270, 180);
		c.setColour (new Color (200, 200, 0));
		c.fillOval (270, 220 + z, 20, 15 - z);      //Hole in the Hovercraft
	    }
	    else
	    {
		c.setColour (bodyColor);
		c.fillArc (160, 200 + z, 20, 10, 90, 180); //Inflatable Part
		c.fillRect (170, 200 + z, 120, 10);
		c.fillArc (280, 200 + z, 20, 10, 270, 180);
	    }
	    c.setColour (Color.black);
	    c.drawOval (170, 170 + z, 15, 30);  //Properller frame
	    c.drawLine (177, 185 + z, 170, 188 + z); //Probeller blades
	    c.drawLine (177, 185 + z, 185, 182 + z);
	    c.drawLine (177, 185 + z, 179, 200 + z);
	    c.drawLine (177, 185 + z, 176, 170 + z);
	    c.drawLine (173, 195 + z, 182, 175 + z);
	    c.drawLine (184, 193 + z, 170, 177 + z);
	    c.setColour (windshieldColor);  //Windshield
	    c.drawLine (290, 200 + z, 260, 180 + z);
	    c.drawLine (289, 200 + z, 259, 180 + z);
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
	try
	{
	    Thread.sleep (2000);                 //Delay before drawing text
	}
	catch (Exception e)
	{
	}
	for (int z = 0 ; z < 70 ; z++)              //Draws Text Bubble
	{
	    c.setColour (Color.white);
	    c.drawOval (150 - z, 450 - z, z, z);
	    c.drawOval (151 - z, 450 - z, z, z);
	}
	c.setColour (Color.black);
	c.setFont (new Font ("Courier", 1, 14));
	c.drawString ("How", 105, 405);
	c.drawString ("dare you", 85, 425);
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
	c.setColour (new Color (122, 179, 255));
	for (int z = 0 ; z < 70 ; z++)              //Erases Text Bubble
	{
	    c.drawOval (150 - z, 450 - z, z, z);
	    c.drawOval (151 - z, 450 - z, z, z);
	}
    }


    public Hovercraft (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawHovercraft ();
    }
}

