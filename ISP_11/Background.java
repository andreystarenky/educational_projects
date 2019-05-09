/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Dec 17, 2018
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
    }


    public Background (Console con)
    {
	c = con;
	drawBackground ();
    }
}

