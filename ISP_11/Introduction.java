/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Dec 17 2018
   This class draws the Introduction Screen

*/
import java.awt.*;
import hsa.Console;
import java.lang.*; //Acces to Thread Class

public class Introduction implements Runnable
{
    private Console c;

    public void drawIntroduction ()         //Draws the introduction screen
    {
	for (int z = 0 ; z < 640 ; z++)
	{
	    //Background of the introduction screen
	    c.setColour (new Color (93, 50, 255));
	    c.drawRect (0 + z, 0, 640, 500);
	}
	for (int z = 0 ; z < 450 ; z++)
	{
	    c.setColour (new Color (93, 50, 255));
	    c.fillRect (640 - z, 40, 330, 70);      //Erase
	    c.setColour (new Color (0, 0, 0));
	    c.setFont (new Font ("Pixeled", 1, 50));
	    c.drawString ("SNAKE", 640 - z, 100); //Title Text
	    try
	    {
		Thread.sleep (1);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 530 ; z++)
	{
	    c.setColour (new Color (93, 50, 255));
	    c.fillRect (-480 + z, 167, 540, 43);      //Erase
	    c.setColour (new Color (0, 0, 0));
	    c.setFont (new Font ("Courier", 1, 50));
	    c.drawString ("By Andrey Starenky", -480 + z, 200); //By Andrey Starenky Text
	    try
	    {
		Thread.sleep (1);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setFont (new Font ("Pixeled", 1, 20));
	c.drawString ("Press any key to skip", 130, 340);
	c.drawString ("Will auto proceed", 170, 300);
	try
	{
	    Thread.sleep (500);         //Delay between text
	}
	catch (Exception e)
	{
	}
	//----------------Intro Snake Animation-----------------
	c.setColour (new Color (255, 0, 0));
	c.fillRect (400, 400, 20, 20);        //Food
	for (int x = 0 ; x < 740 ; x++)
	{
	    c.setColour (new Color (93, 50, 255));
	    c.fillRect (-96 + x, 400, 96, 20);      //Erase
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (-20 + x, 400, 20, 20);
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (-45 + x, 400, 20, 20);
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (-70 + x, 400, 20, 20);
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (-95 + x, 400, 20, 20);
	    try
	    {
		Thread.sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColour (new Color (255, 0, 0));
	c.fillRect (200, 360, 20, 20);        //Food
	for (int x = 0 ; x < 740 ; x++)
	{
	    c.setColour (new Color (93, 50, 255));
	    c.fillRect (640 - x, 360, 96, 20);      //Erase
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (640 - x, 360, 20, 20);
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (665 - x, 360, 20, 20);
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (690 - x, 360, 20, 20);
	    c.setColour (new Color (0, 255, 0));
	    c.fillRect (715 - x, 360, 20, 20);
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
	    Thread.sleep (1000);           //Delay between text
	}
	catch (Exception e)
	{
	}
    }


    public Introduction (Console con)
    {
	c = con;
    }

    public void run ()
    {
	drawIntroduction ();
    }
}

