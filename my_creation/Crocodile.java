/*
   Name: Andrey Starenky
   Teacher: Ms. Krasteva
   Date: Oct 18 2018
   This class animates the crocodile

*/
import java.awt.*;
import hsa.Console;

public class Crocodile
{
    private Console c;
    private Color bodyColor = new Color (15, 127, 33);

    public void drawCrocodile ()
    {
	for (int z = 0 ; z < 430 ; z += 1)              //Animates Crocodile to the right, mouth closed
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x0[] = { - 252 + z, -217 + z, 0 + z, 0 + z, -59 + z, 1 + z};
	    int y0[] = {260, 351, 351, 339, 310, 270};
	    c.fillPolygon (x0, y0, 6);
	    c.setColour (bodyColor);
	    int x1[] = { - 220 + z, -220 + z, -250 + z}; //Tail
	    int y1[] = {340, 280, 260};
	    c.fillPolygon (x1, y1, 3);
	    c.fillRect (-220 + z, 280, 140, 60); //Body
	    int x2[] = { - 80 + z, 0 + z, -60 + z, 0 + z, -80 + z}; //Mouth
	    int y2[] = {280, 270, 310, 340, 340};
	    c.fillPolygon (x2, y2, 5);
	    c.drawLine (-180 + z, 340, -175 + z, 350);     //Back Claws
	    c.drawLine (-170 + z, 340, -165 + z, 350);
	    c.drawLine (-160 + z, 340, -155 + z, 350);
	    c.drawLine (-90 + z, 340, -85 + z, 350);     //Front Claws
	    c.drawLine (-80 + z, 340, -75 + z, 350);
	    c.drawLine (-70 + z, 340, -65 + z, 350);
	    c.setColour (new Color (255, 97, 0));
	    c.fillOval (-42 + z, 278, 6, 6);             //Eye
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 460 ; z += 1)              //Animates Crocodile to the right, mouth closed
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x0[] = {178 + z, 213 + z, 430 + z, 430 + z, 371 + z, 431 + z};
	    int y0[] = {260, 351, 351, 339, 310, 270};
	    c.fillPolygon (x0, y0, 6);
	    c.setColour (bodyColor);
	    int x1[] = {210 + z, 210 + z, 180 + z}; //Tail
	    int y1[] = {340, 280, 260};
	    c.fillPolygon (x1, y1, 3);
	    c.fillRect (210 + z, 280, 140, 60); //Body
	    int x2[] = {350 + z, 390 + z, 430 + z, 430 + z, 350 + z}; //Mouth
	    int y2[] = {280, 280, 310, 340, 340};
	    c.fillPolygon (x2, y2, 5);
	    c.drawLine (250 + z, 340, 255 + z, 350);     //Back Claws
	    c.drawLine (260 + z, 340, 265 + z, 350);
	    c.drawLine (270 + z, 340, 275 + z, 350);
	    c.drawLine (340 + z, 340, 345 + z, 350);     //Front Claws
	    c.drawLine (350 + z, 340, 355 + z, 350);
	    c.drawLine (360 + z, 340, 365 + z, 350);
	    c.setColour (new Color (255, 97, 0));
	    c.fillOval (388 + z, 288, 6, 6);            //Eye
	    c.setColour (new Color (15, 77, 33));
	    c.drawLine (390 + z, 310, 430 + z, 310);    //Closed Mouth
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Crocodile (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawCrocodile ();
    }
}

