/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Oct 17 2018
   This class draws the background

*/
import java.awt.*;
import hsa.Console;

public class Background
{
    private Console c;

    public void drawBackground ()
    {
	for (int z = 0 ; z < 640 ; z++)
	{
	    //Sky
	    c.setColour (new Color (193, 255, 255));
	    c.drawRect (0 + z, 0, 640 - z, 220);
	    //Water
	    c.setColour (new Color (122, 179, 255));
	    c.drawRect (0, 220, z, 280);
	}
	//Left Cloud
	c.setColour (new Color (255, 255, 255));
	for (int z = 1 ; z < 40 ; z++)
	{
	    c.drawArc (100 - z / 2, 60, z, 40, 0, 181);
	}
	for (int z = 1 ; z < 100 ; z++)
	{
	    c.drawArc (150 - z / 2, 29, z, 100, 0, 181);
	}
	for (int z = 1 ; z < 60 ; z++)
	{
	    c.drawArc (200 - z / 2, 45, z, 70, 0, 181);
	}
	//Right Cloud
	for (int z = 1 ; z < 100 ; z++)
	{
	    c.drawArc (400 - z / 2, 80, z, 100, 0, 181);
	}
	for (int z = 1 ; z < 160 ; z++)
	{
	    c.drawArc (460 - z / 2, 50, z, 160, 0, 181);
	}
	for (int z = 1 ; z < 120 ; z++)
	{
	    c.drawArc (540 - z / 2, 65, z, 130, 0, 181);
	}
	//Rock
	c.setColour (new Color (152, 158, 165));
	for (int z = 1 ; z < 140 ; z++)
	{
	    c.drawArc (520 - z / 2, 460, z, 100, 0, 181);
	}
	//c.fillArc (450, 460, 140, 100, 0, 180);
	//Grass
	c.setColour (new Color (0, 255, 0));
	c.drawLine (360, 490, 360, 500); //each Grass is drawn twice with a difference of one pixel on the x axis to make it more visible
	c.drawLine (361, 490, 361, 500);
	c.drawLine (370, 485, 370, 500); //new grass
	c.drawLine (371, 485, 371, 500);
	c.drawLine (380, 475, 380, 500); //new grass
	c.drawLine (381, 475, 381, 500);
	c.drawLine (390, 480, 390, 500); //new grass
	c.drawLine (391, 480, 391, 500);
	c.drawLine (400, 460, 400, 500); //new grass
	c.drawLine (401, 460, 401, 500);
	c.drawLine (410, 475, 410, 500); //new grass
	c.drawLine (411, 475, 411, 500);
	c.drawLine (420, 485, 420, 500); //new grass
	c.drawLine (421, 485, 421, 500);
	c.drawLine (430, 470, 430, 500); //new grass
	c.drawLine (431, 470, 431, 500);
	c.drawLine (440, 490, 440, 500); //new grass
	c.drawLine (441, 490, 441, 500);
	//Seaweed
	c.drawArc (80, 478, 15, 20, 270, 180); //each arc drawn twice with a difference of one pixel on the x axis per Seaweed so it is more noticable
	c.drawArc (81, 478, 15, 20, 270, 180);
	c.drawArc (80, 458, 15, 20, 90, 180);
	c.drawArc (81, 458, 15, 20, 90, 180);
	c.drawArc (55, 468, 15, 30, 270, 180); //new Seaweed
	c.drawArc (54, 468, 15, 30, 270, 180);
	c.drawArc (55, 439, 15, 30, 90, 180);
	c.drawArc (54, 439, 15, 30, 90, 180);
	c.drawArc (25, 458, 15, 40, 270, 180); //new Seaweed
	c.drawArc (24, 458, 15, 40, 270, 180);
	c.drawArc (25, 419, 15, 40, 90, 180);
	c.drawArc (24, 419, 15, 40, 90, 180);
    }


    public Background (Console con)
    {
	c = con;
	drawBackground ();
    }
}

