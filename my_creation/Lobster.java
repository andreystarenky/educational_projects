/*
   Name: Andrey Starenky
   Teacher: Ms. Krasteva
   Date: Oct 19 2018
   This class animates the lobster

*/
import java.awt.*;
import hsa.Console;

public class Lobster
{
    private Console c;
    private Color bodyColor = Color.red;       //Color of the body of the lobster
    private Color eyeColor = new Color (104, 200, 232);     //Color of the eyes of the lobster

    public void drawLobster ()
    {
	for (int z = 0 ; z < 270 ; z += 1)      //Animates Lobster to the left
	{
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (640 - z, 235, 71, 49);              //Erase
	    c.setColour (bodyColor);
	    int x1[] = {660 - z, 690 - z, 710 - z, 690 - z, 660 - z}; //Body
	    int y1[] = {250, 250, 260, 270, 270};
	    c.fillPolygon (x1, y1, 5);
	    c.drawArc (640 - z, 240, 20, 20, 0, 90);  //Arms
	    c.drawArc (640 - z, 259, 20, 20, 270, 90);
	    c.fillArc (640 - z, 235, 10, 10, 210, 300); //Claws
	    c.fillArc (640 - z, 274, 10, 10, 210, 300);
	    c.drawLine (676 - z, 245, 676 - z, 275);    //Legs
	    c.drawLine (680 - z, 245, 680 - z, 275);
	    c.drawLine (684 - z, 245, 684 - z, 275);
	    c.drawLine (688 - z, 245, 688 - z, 275);
	    c.setColour (eyeColor);
	    c.fillRect (665 - z, 253, 3, 6);          //Eyes
	    c.fillRect (665 - z, 261, 3, 6);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColour (new Color (255, 255, 255));
	for (int z = 0 ; z < 70 ; z++)              //Draws Text Bubble
	{
	    c.drawOval (350 - z, 300, z, z);
	    c.drawOval (351 - z, 300, z, z);
	}
	c.setColour (new Color (0, 0, 0));
	c.setFont (new Font ("Courier", 1, 14));
	c.drawString ("Prepare", 290, 325);
	c.drawString ("to die", 290, 345);
	try
	{
	    Thread.sleep (1500);
	}
	catch (Exception e)
	{
	}
	c.setColour (new Color (122, 179, 255));
	for (int z = 0 ; z < 70 ; z++)              //Erases Text Bubble
	{
	    c.drawOval (350 - z, 300, z, z);
	    c.drawOval (351 - z, 300, z, z);
	}
	for (int z = 0 ; z < 76 ; z += 1)      //Animates Lobster to the left (Attacking Hovercraft)
	{
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (370 - z, 235, 71, 49);              //Erase
	    c.setColour (bodyColor);
	    int x1[] = {390 - z, 420 - z, 440 - z, 420 - z, 390 - z}; //Body
	    int y1[] = {250, 250, 260, 270, 270};
	    c.fillPolygon (x1, y1, 5);
	    c.drawArc (370 - z, 240, 20, 20, 0, 90);  //Arms
	    c.drawArc (370 - z, 259, 20, 20, 270, 90);
	    c.fillArc (370 - z, 235, 10, 10, 210, 300); //Claws
	    c.fillArc (370 - z, 274, 10, 10, 210, 300);
	    c.drawLine (406 - z, 245, 406 - z, 275);    //Legs
	    c.drawLine (410 - z, 245, 410 - z, 275);
	    c.drawLine (414 - z, 245, 414 - z, 275);
	    c.drawLine (418 - z, 245, 418 - z, 275);
	    c.setColour (eyeColor);
	    c.fillRect (395 - z, 253, 3, 6);          //Eyes
	    c.fillRect (395 - z, 261, 3, 6);
	    try
	    {
		Thread.sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 76 ; z += 1)      //Animates Lobster to the right after attacking Hovercraft
	{
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (294 + z, 235, 70, 49);             //Erase
	    c.setColour (bodyColor);
	    int x1[] = {315 + z, 345 + z, 365 + z, 345 + z, 315 + z}; //Body
	    int y1[] = {250, 250, 260, 270, 270};
	    c.fillPolygon (x1, y1, 5);
	    c.drawArc (295 + z, 240, 20, 20, 0, 90); //Arms
	    c.drawArc (295 + z, 259, 20, 20, 270, 90);
	    c.fillArc (295 + z, 235, 10, 10, 210, 300); //Claws
	    c.fillArc (295 + z, 274, 10, 10, 210, 300);
	    c.drawLine (331 + z, 245, 331 + z, 275);  //Legs
	    c.drawLine (335 + z, 245, 335 + z, 275);
	    c.drawLine (339 + z, 245, 339 + z, 275);
	    c.drawLine (343 + z, 245, 343 + z, 275);
	    c.setColour (eyeColor);
	    c.fillRect (320 + z, 253, 3, 6);         //Eyes
	    c.fillRect (320 + z, 261, 3, 6);
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
	    Thread.sleep (5400);
	}
	catch (Exception e)
	{
	}
	for (int z = 0 ; z < 80 ; z++)              //Draws Text Bubble
	{
	    c.setColour (new Color (255, 255, 255));
	    c.drawOval (370 - z, 300, z, z);
	    c.drawOval (371 - z, 300, z, z);
	}
	c.setColour (new Color (0, 0, 0));
	c.setFont (new Font ("Courier", 1, 12));
	c.drawString ("Have fun", 307, 325);
	c.setFont (new Font ("Courier", 1, 11));
	c.drawString ("down there", 298, 345);
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
	c.setColour (new Color (122, 179, 255));
	for (int z = 0 ; z < 80 ; z++)              //Erases Text Bubble
	{
	    c.drawOval (370 - z, 300, z, z);
	    c.drawOval (371 - z, 300, z, z);
	}
	try
	{
	    Thread.sleep (1900);
	}
	catch (Exception e)
	{
	}
	for (int z = 0 ; z < 460 ; z += 1)      //Animates Lobster to the left (Exiting the screen)
	{
	    c.setColour (new Color (122, 179, 255));
	    c.fillRect (370 - z, 235, 71, 49);              //Erase
	    c.setColour (bodyColor);
	    int x1[] = {390 - z, 420 - z, 440 - z, 420 - z, 390 - z}; //Body
	    int y1[] = {250, 250, 260, 270, 270};
	    c.fillPolygon (x1, y1, 5);
	    c.drawArc (370 - z, 240, 20, 20, 0, 90);  //Arms
	    c.drawArc (370 - z, 259, 20, 20, 270, 90);
	    c.fillArc (370 - z, 235, 10, 10, 210, 300); //Claws
	    c.fillArc (370 - z, 274, 10, 10, 210, 300);
	    c.drawLine (406 - z, 245, 406 - z, 275);    //Legs
	    c.drawLine (410 - z, 245, 410 - z, 275);
	    c.drawLine (414 - z, 245, 414 - z, 275);
	    c.drawLine (418 - z, 245, 418 - z, 275);
	    c.setColour (eyeColor);
	    c.fillRect (395 - z, 253, 3, 6);          //Eyes
	    c.fillRect (395 - z, 261, 3, 6);
	    try
	    {
		Thread.sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Lobster (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawLobster ();
    }
}

