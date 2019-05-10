/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Oct 17 2018
   This class draws the Ending Screen

*/
import java.awt.*;
import hsa.Console;

public class Ending
{
    private Console c;

    public void drawEnding ()         //Draws the Ending Screen screen
    {
	for (int z = 0 ; z < 640 ; z++)
	{
	    //Background of the introduction screen
	    c.setColour (new Color (0, 0, 0));
	    c.drawRect (0 + z, 0, 640, 500);
	    try
	    {
		Thread.sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setColour (new Color (255, 255, 255));
	c.setFont (new Font ("Courier", 1, 40));
	c.drawString ("Winners", 250, 250); //Subheading
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setFont (new Font ("Courier", 1, 30));
	c.drawString ("Fishyboi", 260, 320); //winner List
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.drawString ("Croc", 295, 365);
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.drawString ("Lobster", 275, 405);
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setFont (new Font ("Courier", 1, 80));
	c.drawString ("The End", 150, 150); //Title Text
    }


    public Ending (Console con)
    {
	c = con;
	drawEnding ();
    }
}

