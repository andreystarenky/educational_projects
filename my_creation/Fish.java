/*
   Name: Andrey Starenky
   Teacher: Ms. Krasteva
   Date: Oct 18 2018
   This class animates the fish

*/
import java.awt.*;
import hsa.Console;

public class Fish
{
    private Console c;
    private Color bodyColor = new Color (0, 255, 255);  //Color of the fish body
    private Color tailColor = new Color (255, 0, 0);    //Color of the tail

    public void drawFish ()
    {
	for (int z = 0 ; z < 210 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = { - 131 + z, -131 + z, -91 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (-112 + z, 260, 112, 80, 35, 290); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = { - 130 + z, -130 + z, -90 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (-110 + z, 260, 110, 80, 35, 290); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (-40 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (-100 + z, 290, 15, 3);               //Gills
	    c.fillRect (-70 + z, 290, 15, 3);
	    c.fillRect (-100 + z, 310, 15, 3);
	    c.fillRect (-70 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {79 + z, 79 + z, 119 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (98 + z, 260, 112, 80, 35 - z, 290 + z + z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {80 + z, 80 + z, 120 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (100 + z, 260, 110, 80, 35 - z, 290 + z + z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (170 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (110 + z, 290, 15, 3);               //Gills
	    c.fillRect (140 + z, 290, 15, 3);
	    c.fillRect (110 + z, 310, 15, 3);
	    c.fillRect (140 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth opening
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {114 + z, 114 + z, 154 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (133 + z, 260, 112, 80, 0 + z, 360 - z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {115 + z, 115 + z, 155 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (135 + z, 260, 110, 80, 1 + z, 359 - z - z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (205 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (145 + z, 290, 15, 3);               //Gills
	    c.fillRect (175 + z, 290, 15, 3);
	    c.fillRect (145 + z, 310, 15, 3);
	    c.fillRect (175 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {149 + z, 149 + z, 189 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (168 + z, 260, 112, 80, 35 - z, 290 + z + z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {150 + z, 150 + z, 190 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (170 + z, 260, 110, 80, 35 - z, 290 + z + z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (240 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (180 + z, 290, 15, 3);               //Gills
	    c.fillRect (210 + z, 290, 15, 3);
	    c.fillRect (180 + z, 310, 15, 3);
	    c.fillRect (210 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth opening
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {184 + z, 184 + z, 224 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (203 + z, 260, 112, 80, 0 + z, 360 - z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {185 + z, 185 + z, 225 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (205 + z, 260, 110, 80, 1 + z, 359 - z - z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (275 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (215 + z, 290, 15, 3);               //Gills
	    c.fillRect (245 + z, 290, 15, 3);
	    c.fillRect (215 + z, 310, 15, 3);
	    c.fillRect (245 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {219 + z, 219 + z, 259 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (238 + z, 260, 112, 80, 35 - z, 290 + z + z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {220 + z, 220 + z, 260 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (240 + z, 260, 110, 80, 35 - z, 290 + z + z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (310 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (250 + z, 290, 15, 3);               //Gills
	    c.fillRect (280 + z, 290, 15, 3);
	    c.fillRect (250 + z, 310, 15, 3);
	    c.fillRect (280 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth opening
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {254 + z, 254 + z, 294 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (273 + z, 260, 112, 80, 0 + z, 361 - z - z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {255 + z, 255 + z, 295 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (275 + z, 260, 110, 80, 1 + z, 359 - z - z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (345 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (285 + z, 290, 15, 3);               //Gills
	    c.fillRect (315 + z, 290, 15, 3);
	    c.fillRect (285 + z, 310, 15, 3);
	    c.fillRect (315 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {289 + z, 289 + z, 329 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (308 + z, 260, 112, 80, 35 - z, 290 + z + z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {290 + z, 290 + z, 330 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (310 + z, 260, 110, 80, 35 - z, 290 + z + z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (380 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (320 + z, 290, 15, 3);               //Gills
	    c.fillRect (350 + z, 290, 15, 3);
	    c.fillRect (320 + z, 310, 15, 3);
	    c.fillRect (350 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth opening
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {324 + z, 324 + z, 364 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (343 + z, 260, 112, 80, 0 + z, 361 - z - z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {325 + z, 325 + z, 365 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (345 + z, 260, 110, 80, 1 + z, 359 - z - z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (415 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (355 + z, 290, 15, 3);               //Gills
	    c.fillRect (385 + z, 290, 15, 3);
	    c.fillRect (355 + z, 310, 15, 3);
	    c.fillRect (385 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {359 + z, 359 + z, 399 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (378 + z, 260, 112, 80, 35 - z, 290 + z + z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {360 + z, 360 + z, 400 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (380 + z, 260, 110, 80, 35 - z, 290 + z + z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (450 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (390 + z, 290, 15, 3);               //Gills
	    c.fillRect (420 + z, 290, 15, 3);
	    c.fillRect (390 + z, 310, 15, 3);
	    c.fillRect (420 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 35 ; z += 1)               //Animates Fish forwards, and mouth opening
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {394 + z, 394 + z, 434 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (413 + z, 260, 112, 80, 0 + z, 361 - z - z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {395 + z, 395 + z, 435 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (415 + z, 260, 110, 80, 1 + z, 359 - z - z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (485 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (425 + z, 290, 15, 3);               //Gills
	    c.fillRect (455 + z, 290, 15, 3);
	    c.fillRect (425 + z, 310, 15, 3);
	    c.fillRect (455 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 250 ; z += 1)               //Animates Fish forwards, and mouth closing
	{
	    //Erase
	    c.setColour (new Color (122, 179, 255));
	    int x1[] = {429 + z, 429 + z, 469 + z};
	    int y1[] = {275, 325, 300};
	    c.fillPolygon (x1, y1, 3);                      //Tail Erase
	    c.fillArc (448 + z, 260, 112, 80, 35 - z, 290 + z + z); //Body Erase
	    //Fish drawing
	    c.setColour (tailColor);
	    int x2[] = {430 + z, 430 + z, 470 + z};
	    int y2[] = {275, 325, 300};
	    c.fillPolygon (x2, y2, 3);                      //Tail
	    c.setColour (bodyColor);
	    c.fillArc (450 + z, 260, 110, 80, 35 - z, 290 + z + z); //Body
	    c.setColour (new Color (0, 0, 0));
	    c.fillOval (520 + z, 270, 8, 8);                //Eye
	    c.setColour (new Color (182, 239, 107));
	    c.fillRect (460 + z, 290, 15, 3);               //Gills
	    c.fillRect (490 + z, 290, 15, 3);
	    c.fillRect (460 + z, 310, 15, 3);
	    c.fillRect (490 + z, 310, 15, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Fish (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawFish ();
    }
}

