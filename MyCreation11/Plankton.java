/*
   Name: Andrey Starenky
   Teacher: Ms. Krasteva
   Date: Oct 18 2018
   This class animates the fish

*/
import java.awt.*;
import hsa.Console;

public class Plankton
{
    private Console c;
    private Color bodyColor = new Color (58, 193, 0);           //Color of the Plankton Body

    public void drawPlankton ()
    {
	for (int z = 0 ; z < 245 ; z += 1)              //Animates Plankton to the left
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (640 - z, 295, 35, 27);
	    c.setColour (bodyColor);
	    c.drawArc (649 - z, 313, 13, 13, 90, 90);       //Body
	    c.drawArc (640 - z, 291, 13, 13, 270, -90);
	    c.fillOval (645 - z, 300, 25, 17);
	    c.fillRect (666 - z, 304, 8, 2);                //Legs
	    c.fillRect (666 - z, 312, 8, 2);
	    c.setColour (Color.white);
	    c.fillOval (650 - z, 304, 12, 8);               //Eye
	    c.setColour (Color.black);
	    c.fillOval (653 - z, 307, 6, 3);
	    c.setColour (bodyColor);
	    c.drawLine (657 - z, 316, 657 - z, 321);
	    c.drawLine (657 - z, 299, 657 - z, 295);
	    try
	    {
		Thread.sleep (3);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColour (new Color (122, 179, 255));      //Erase of previous Plankton
	c.fillRect (395, 295, 35, 27);
	c.setColour (bodyColor);
	c.drawArc (390, 290, 13, 13, 0, 90);
	c.drawArc (412, 290, 13, 13, 180, -90);       //Body
	c.fillOval (400, 295, 17, 25);
	c.fillRect (403, 315, 2, 8);                  //Legs
	c.fillRect (411, 315, 2, 8);
	c.setColour (Color.white);
	c.fillOval (405, 299, 8, 12);                 //Eye
	c.setColour (new Color (0, 0, 0));
	c.fillOval (407, 302, 3, 6);
	c.setColour (bodyColor);
	c.drawLine (400, 307, 395, 307);
	c.drawLine (417, 307, 422, 307);
    }


    public Plankton (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawPlankton ();
    }
}

