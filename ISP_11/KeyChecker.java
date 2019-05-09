/*
   Name: Andrey Starenky
   Teacher: Ms Krasteva
   Date: Oct 22, 2018
   This is the KeyChecker Class which calls other objects, and runs the animations
*/

// The "KeyChecker" class.
import java.awt.*;
import java.io.*;
import hsa.Console;
import hsa.Message;


public class KeyChecker   //KeyChecker Class
{
    Console c;   
	

    public void introduction ()     //Draws the introduction screen
    {
	char input;
	while (true){
	    if(c.isCharAvail()){
	    //c.clear();
	    input=c.getChar();
	    c.print(input);
	    }
	for (int x=0;x<740;x++){
	c.setColour (new Color (93, 50, 255));
	c.fillRect (640-x, 360, 96, 20);        //Erase
	c.setColour (new Color (0, 255, 0));
	c.fillRect (640-x, 360, 20, 20);
	c.setColour (new Color (0, 255, 0));
	c.fillRect (665-x, 360, 20, 20);
	c.setColour (new Color (0, 255, 0));
	c.fillRect (690-x, 360, 20, 20);
	c.setColour (new Color (0, 255, 0));
	c.fillRect (715-x, 360, 20, 20);
	try
	{
	    Thread.sleep (2);           
	}
	catch (Exception e)
	{
	}
	}
	}
    }

    public KeyChecker ()                //KeyChecker constructor
    {
	//c = con;
	c= new Console();
	//introduction();
    }


    public static void main (String[] args)     //Main Method
    {
	KeyChecker m = new KeyChecker ();
	m.introduction ();
    }
} //End of class


