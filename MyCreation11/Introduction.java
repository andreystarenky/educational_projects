/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Oct 17 2018
   This class draws the Introduction Screen

*/
import java.awt.*;
import hsa.Console;

public class Introduction
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
	for (int z = 0 ; z < 490 ; z++)
	{
	    c.setColour (new Color (93, 50, 255));
	    c.fillRect (640 - z, 67, 330, 43);      //Erase
	    c.setColour (new Color (0, 0, 0));
	    c.setFont (new Font ("Courier", 1, 50));
	    c.drawString ("My Creation", 640 - z, 100); //Title Text
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
	try
	{
	    Thread.sleep (1500);         //Delay between text
	}
	catch (Exception e)
	{
	}
	c.setFont (new Font ("Courier", 1, 40));
	c.drawString ("Swamp Battles", 170, 300); //Sub Heading
	try
	{
	    Thread.sleep (1500);           //Delay between text
	}
	catch (Exception e)
	{
	}
	c.setFont (new Font ("Courier", 1, 35));
	c.drawString ("Today's Schedule", 155, 350); //Schedule
	try
	{
	    Thread.sleep (2000);           //Delay between text
	}
	catch (Exception e)
	{
	}
	c.setFont (new Font ("Courier", 1, 30));
	c.drawString ("Fishyboi vs Duck Gang", 125, 400); //Schedule
	try
	{
	    Thread.sleep (1500);           //Delay between text
	}
	catch (Exception e)
	{
	}
	c.drawString ("Croc vs Plankton", 197, 440); //Schedule
	try
	{
	    Thread.sleep (1500);           //Delay between text
	}
	catch (Exception e)
	{
	}
	c.drawString ("Lobster vs Hovercraft", 145, 480); //Schedule
	try
	{
	    Thread.sleep (3000);           //Delay between text
	}
	catch (Exception e)
	{
	}
    }


    public Introduction (Console con)
    {
	c = con;
	drawIntroduction ();
    }
}

