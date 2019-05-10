/*
   Name: Andrey Starenky
   Teacher: Ms. Krasteva
   Date: Oct 18 2018
   This class animates the fish

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Duck extends Thread
{
    private Console c;
    private int i;
    private Color x;        //Color of the body of the duck

    public void drawDuck ()
    {
	for (int z = 0 ; z < 91 ; z += 1)
	{
	    //Erase
	    c.setColour (new Color (193, 255, 255));
	    c.fillRect (470 + i, 130, 35, z);         //Sky Erase
	    c.setColour (x);
	    c.fillOval (470 + i, 109 + z, 25, 20);        //Duck body
	    c.setColour (x);
	    c.fillOval (488 + i, 106 + z, 12, 9);         //Duck head
	    c.setColour (new Color (142, 255, 83));
	    c.drawLine (494 + i, 108 + z, 497 + i, 108 + z);    //Duck eyes
	    c.setColour (new Color (255, 157, 0));
	    int x1[] = {497 + i, 497 + i, 505 + i};
	    int y1[] = {109 + z, 115 + z, 112 + z};
	    c.fillPolygon (x1, y1, 3);              //Duck beak
	    c.setColour (new Color (160, 120, 0));
	    c.fillArc (474 + i, 114 + z, 26, 10, 90, 90); //Duck wing
	    c.setColour (new Color (209, 185, 46));
	    c.fillRect (472 + i, 127 + z, 8, 3);
	    c.fillRect (485 + i, 127 + z, 8, 3);
	    c.setColour (new Color (255, 255, 255));
	    c.fillRect (470 + i, 105 + z, 35, 25 - z); //Cloud part that covers duck
	    try
	    {
		Thread.sleep (3);
	    }
	    catch (Exception e)
	    {
	    }
	}

	for (int z = 0 ; z < 91 ; z += 1)
	{
	    c.setColour (new Color (193, 255, 255));  //Erase
	    c.fillRect (470 + i, 194 + z, 35, 26 - z); //Sky Erase
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (470 + i, 220, 35, z);         //Water Erase
	    c.setColour (x);
	    c.fillOval (470 + i, 200 + z, 25, 20);        //Duck body
	    c.setColour (x);
	    c.fillOval (488 + i, 197 + z, 12, 9);         //Duck head
	    c.setColour (new Color (142, 255, 83));
	    c.drawLine (494 + i, 198 + z, 497 + i, 198 + z);    //Duck eyes
	    c.setColour (new Color (255, 157, 0));
	    int x1[] = {497 + i, 497 + i, 505 + i};
	    int y1[] = {200 + z, 206 + z, 203 + z};
	    c.fillPolygon (x1, y1, 3);              //Duck beak
	    c.setColour (new Color (160, 120, 0));
	    c.fillArc (474 + i, 205 + z, 26, 10, 90, 90); //Duck wing
	    c.setColour (new Color (209, 185, 46));
	    c.fillRect (472 + i, 218 + z, 8, 3);
	    c.fillRect (485 + i, 218 + z, 8, 3);
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Duck (Console con)
    {
	c = con;
	i = 0;
	x = new Color (153, 94, 0);
    }


    public Duck (Console con, int coordShift)
    {
	c = con;
	i = coordShift;
	x = new Color (213, 94, 0);
    }


    public Duck (Console con, int coordShift, Color color)
    {
	c = con;
	i = coordShift;
	x = color;
    }


    public void run ()
    {
	drawDuck ();
    }
}

