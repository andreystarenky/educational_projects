//Andrey Starenky
//ISPMain
//Jan 15th, 2019
//Ms Krasteva
//This program is the "Snake" game, which allows the user to control a snake with the W A S D keys and eat food to become longer
//The user can also open instructions, and high scores

/*Variable Dictionary

Name            Type         Description
level           char       Stores the level as a character (1, 2, or 3) which is inputted in levelSelector and used in the displayGame method
choice          char       Stores the choice of what is selected from the main menu
*/

//Import Section
import java.awt.*;
//import java.math.*; //Used for math.random
import java.io.*;   //Used for High Scores
import hsa.Console; //Main display (menus, instructions, high scores, and game)
import hsa.Message; //Error messages


public class ISPMain   //ISPMain Class
{
    Console c;           // The output console
    char choice, level;  //Choice is inputted in mainMenu, level is inputted in levelSelector
    
    /*
	drawTitle Method
	Clears the screen, draws background color with a for loop, and displays the title
    */
    public void drawTitle ()
    {
	for (int z = 0 ; z < 640 ; z++)     //Draws background
	{
	    c.setColour (new Color (120, 120, 200));
	    c.drawRect (0 + z, 0, 640 - z, 550);        //Background
	}
	c.setColour (new Color (0, 0, 0));      //Font Color
	c.setFont (new Font ("Pixeled", 1, 20));
	c.drawString ("SNAKE", 260, 40); //Title Text
    }
    
    /*
	splashScreen Method
	Displays the introducion, and draws a heading "Snake" and "By: Andrey Starenky" in an animation
	A new Thread is made to run the Introduction class while checking for a key to skip the intro
	Message warns user to make sure the Pixeled.ttf font is installed
	For loop is used to check for an input if the user wants to skip, and has a small delay so after it is done looping, it will automatically continue to mainMenu
	The try blocks are used for delays
    */
    public void splashScreen ()     //Draws the introduction screen
    {
	Introduction i = new Introduction (c);
	Thread runThread = new Thread(i);
	runThread.start();
	new Message("Make sure to install \"Pixeled.ttf\" font");   //Warns new user to font if they haven't already
	for(int x=0;x<66;x++){
	    try{
	    Thread.sleep(100);      //Delay before continuing to menu
	    }
	    catch(Exception e){}
	}
    }
    
    /*
	mainMenu Method
	Displays the menu, with 4 options: 1 to Play Game, 2 to view Instructions, 3 to view High Scores, and 4 to exit game
	The input is obtained through the global variable (choice)
	The if statement error traps to see if the input is not a valid option
    */
    public void mainMenu ()
    {
	drawTitle ();
	c.setFont (new Font ("Pixeled", 1, 27));            //Main Menu options
	c.drawString ("1.  PLAY GAME", 150, 150);           //Play Game option
	c.drawString ("2. INSTRUCTIONS", 150, 190);         //Instructions option
	c.drawString ("3. HIGH SCORES", 150, 230);          //High Scores option
	c.drawString ("4. EXIT", 150, 270);                 //Exit option
	c.setFont (new Font ("Pixeled", 1, 15));
	c.drawString ("PRESS THE NUMBER OF YOUR CHOICE", 120, 320);     //Prompt for menu input
	choice = c.getChar ();
	if (choice != '1' && choice != '2' && choice != '3' && choice != '4')   //Error trap
	    new Message ("Invalid input. Please try again");            //Error message to user
    }

    /*
	levelSelector Method
	Displays the level menu, with 3 options: 1 for Easy, 2 for Normal, and 3 for Hard
	The input is obtained through the variable (level)
	The if statement error traps to see if the input is not a valid option
		    Variable Dictionary
	inputCheck         boolean     Used in the while loop if the input is invalid, inputCheck is false, and while loop continues, asks for new input      
    */
    public void levelSelector ()
    {
	drawTitle ();
	c.setFont (new Font ("Pixeled", 1, 27));
	c.drawString ("SELECT YOUR LEVEL", 110, 150);       //Level Selecting Heading
	c.drawString ("1.  EASY", 110, 210);                //Easy mode
	c.drawString ("2. NORMAL", 110, 250);               //Normal mode
	c.drawString ("3. HARD", 110, 290);                 //Hard mode
	boolean inputCheck = false;
	while (!inputCheck)                //Loops while input is invalid
	{
	    level = c.getChar ();
	    if (level != '1' && level != '2' && level != '3')       //Checks if input is valid
		new Message ("Invalid input. Please try again");    //Error message
	    else
		inputCheck = true;
	}
    }

    /*
	checkCrash Method
	Checks if the snake is going to crash
	The input is obtained through the variable (level)
	The if statement error traps to see if the input is not a valid option
		    Variable Dictionary
	inputCheck         boolean     Used in the while loop if the input is invalid, inputCheck is false, and while loop continues, asks for new input      
    */
    private boolean checkCrash (int[] x, int[] y, int nums)
    {
	for (int i = 1 ; i < nums ; i++)                //Checks if any block of the snake is going to collide with itself
		{
		    if (y[0] == y[i] && x[0] == x[i])   //Checks each block
		    {
			return true;
		    }
		}
	return false;
    }

/*
	displayGame Method
	Displays the game and gets input for the user to control the snake, also adds to the length if food it eaten
	Calls return method to check for snake collisons
	The first if structure sets the delay based on the level inputted by the user in levelSelector
	The try block is for a small delay before the snake commences movement
	Main while(true) loop runs the whole game process until a collision has occured, in which case it will break;
	If structure checks if any character was available in the buffer, then if checks if it is a valid key (W A S D) before it sets it to the direction
	An if structure checks if a block was just eaten on the previous move, if so a do while loop will generate random numbers in the range of the 
	gameboard to spawn food until the food coordinates are in a location which is not on the snake (checked with a for loop)
	A large if structure checks if for which direction the snake is moving
	If structute then checks if the snake is about to hit the wall with the current direction
	A for loop then shifts the array down in the required direction
	checkCrash is called to check if the snake will hit itself
	Rectangle erases the previous tail square and draws a new one at the front
	If statement checks if the snake ate a food block/pellet, and increases the score
	A try structure is used for the delay of the snake moving
	An if structure checks if gameOver is true, to exit the game.
	If structure checks if the score was not 0, then asks user to input their username to store the score
	Try structure useed to open a file and store the score
		    Variable Dictionary
	delay           int         The delay depends on which level is selected, the harder the level, the less delay (snake moves faster)
	input           char        Gets the key input, used to check if the key is W, A, S, or D
	direction       char        If the input was a valid character, the direction of the snake is set to the character
	lastBlockX      int         Tracks the X coordinate of the last block of the snake, used when shifting the array
	lastBlockY      int         Tracks the Y coordinate of the last block of the snake, used when shifting the array
	numBlocks       int         Tracks the number of blocks
	score           int         Tracks the score
	foodSpawnX      int         Tracks the X coordinate of the food, used to check if it was eaten
	foodSpawnY      int         Tracks the X coordinate of the food, used to check if it was eaten
	gameOver        boolean     Stores true if game is over, checked with an if statement to break out of the main loop
	blockEat        boolean     Stores a boolean value that is checked to see if there is any food on the game screen
	blockSpawnSnake boolean     Stores a boolean value that checks if the coordinates of the food are on the snake
	xCoords         int[]       Stores the X coordinates of all blocks in the snake
	yCoords         int[]       Stores the Y coordinates of all blocks in the snake
	scoresFile      PrintWriter Variable for the file that the score is written to
    */
    public void displayGame ()
    {
	int delay = 0;      //Delay variable
	if (level == '1')   //Sets the delay based on the level
	    delay = 350;    //Easy Mode delay
	else if (level == '2')
	    delay = 250;    //Normal Mode delay
	else
	    delay = 100;    //Hard Mode delay
	drawTitle ();
	char input = ' ', direction = 'd';  //Sets default direction
	int lastBlockY, lastBlockX;         //Keeps track of last block coordinates for shifting
	int numBlocks = 5;                  //Default Number of blocks
	int score = 0;
	int foodSpawnX = 0, foodSpawnY = 0; //Food spawning coordinates variables
	boolean gameOver = false;           //Boolean for if the game is over or not
	boolean blockEat = true;            //Boolean for if the food has been eaten
	boolean blockSpawnSnake = true;     //Boolean for if the food is spawning on the snake (to spawn in a new location instead)
	c.drawRect (19, 49, 597, 397);      //playing 24x16 board which will fits 384 snake blocks
	int[] xCoords = new int [384]; //Array of x Chordinates of the snake
	int[] yCoords = new int [384]; //Array of y Chordinates of the snake
	xCoords [3] = 45;              //Building Initial Snake x coordinates
	xCoords [4] = 20;
	xCoords [2] = 70;
	xCoords [1] = 95;
	xCoords [0] = 120;
	yCoords [0] = 400;             //Building Initial Snake x coordinates
	yCoords [1] = 400;
	yCoords [2] = 400;
	yCoords [3] = 400;
	yCoords [4] = 400;
	c.setColour (new Color (0, 255, 0));            //Sets colors for snake
	c.fillRect (xCoords [0], yCoords [0], 20, 20);  //Draws initial snake
	c.fillRect (xCoords [1], yCoords [1], 20, 20);
	c.fillRect (xCoords [2], yCoords [2], 20, 20);
	c.fillRect (xCoords [3], yCoords [3], 20, 20);
	c.fillRect (xCoords [4], yCoords [4], 20, 20);
	try                     //Delay before snake starts
	{
	    Thread.sleep (200);
	}
	catch (Exception e)
	{
	}
	while (true)
	{
	    if (c.isCharAvail ())   // isCharAvail was learned from http://www.staugustinechs.ca/cadawas/hsa/console.html
	    {
		input = c.getChar ();   //Gets key input and checks if it is a valid input
		if (input == 'w' && direction != 's' || input == 'a' && direction != 'd' || input == 's' && direction != 'w' || input == 'd' && direction != 'a')
		    direction = input;  //Sets direction to input if input is valid
	    }
	    blockSpawnSnake = true; 
	    if (blockEat == true)       //If there is no food on the board right now, create new food
	    {
		do
		{
		    blockSpawnSnake = false;
		    foodSpawnX = ((int) (Math.random () * (19) + 1) * 25 - 5);      //Random x coordinate
		    foodSpawnY = ((int) (Math.random () * (14) + 1) * 25) + 50;     //Random y coordinate
		    for (int i = 0 ; i < numBlocks ; i++)
		    {
			if (foodSpawnX == xCoords [i] && foodSpawnY == yCoords [i]) //Checks if the food is spawning on the snake, loops again
			{
			    blockSpawnSnake = true;
			    break;
			}
			else
			    blockSpawnSnake = false;    //If the spawn of the food is not on the snake, it will exit the while loop
		    }
		}
		while (blockSpawnSnake == true);
	    }
	    blockEat = false;
	    c.setColor (new Color (255, 0, 0));
	    c.fillRect (foodSpawnX, foodSpawnY, 20, 20);    //Draws food
	    if (direction == 'd')   //execute if direction is right
	    {
		if (xCoords [0] + 20 > 614)
		    break;
		lastBlockY = yCoords [numBlocks - 1];
		lastBlockX = xCoords [numBlocks - 1];
		for (int x = numBlocks ; x > 0 ; x--)   //Shifts Array down by one
		{
		    yCoords [x] = yCoords [x - 1];
		    xCoords [x] = xCoords [x - 1];
		}
		xCoords [0] = xCoords [1] + 25;         //Adds coordinate of head to front of the array
		if (checkCrash(yCoords,xCoords,numBlocks))
		{
		    break;
		}
		c.setColour (new Color (120, 120, 200));
		c.fillRect (lastBlockX, lastBlockY, 20, 20);  //Erases last block
		c.setColour (new Color (0, 255, 0));
		c.fillRect (xCoords [0], yCoords [0], 20, 20);
	    }
	    else if (direction == 'w')   //execute if direction is up
	    {
		if (yCoords [0] - 20 < 49)
		{
		    break;
		}
		lastBlockY = yCoords [numBlocks - 1];
		lastBlockX = xCoords [numBlocks - 1];
		for (int x = numBlocks ; x > 0 ; x--)   //Shifts Array down by one
		{
		    yCoords [x] = yCoords [x - 1];
		    xCoords [x] = xCoords [x - 1];
		}
		yCoords [0] = yCoords [1] - 25;         //Adds coordinate of head to front of the array
		if (checkCrash(yCoords,xCoords,numBlocks))
		{
		    break;
		}
		c.setColour (new Color (120, 120, 200));
		c.fillRect (lastBlockX, lastBlockY, 20, 20);  //Erases last block
		c.setColour (new Color (0, 255, 0));
		c.fillRect (xCoords [0], yCoords [0], 20, 20);
	    }
	    else if (direction == 'a')   //execute if direction is up
	    {
		if (xCoords [0] - 20 < 19)
		{
		    break;
		}
		lastBlockY = yCoords [numBlocks - 1];
		lastBlockX = xCoords [numBlocks - 1];
		for (int x = numBlocks ; x > 0 ; x--)   //Shifts Array down by one
		{
		    yCoords [x] = yCoords [x - 1];
		    xCoords [x] = xCoords [x - 1];
		}
		xCoords [0] = xCoords [1] - 25;         //Adds coordinate of head to front of the array
		if (checkCrash(yCoords,xCoords,numBlocks))
		{
		    break;
		}
		c.setColour (new Color (120, 120, 200));
		c.fillRect (lastBlockX, lastBlockY, 20, 20);  //Erases last block
		c.setColour (new Color (0, 255, 0));
		c.fillRect (xCoords [0], yCoords [0], 20, 20);
	    }
	    else if (direction == 's')   //execute if direction is up
	    {
		if (yCoords [0] + 20 > 444)
		{
		    break;
		}
		lastBlockY = yCoords [numBlocks - 1];
		lastBlockX = xCoords [numBlocks - 1];
		for (int x = numBlocks ; x > 0 ; x--)   //Shi2fts Array down by one
		{
		    yCoords [x] = yCoords [x - 1];
		    xCoords [x] = xCoords [x - 1];
		}
		yCoords [0] = yCoords [1] + 25;         //Adds coordinate of head to front of the array
		if (checkCrash(yCoords,xCoords,numBlocks))
		{
		    break;
		}
		c.setColour (new Color (120, 120, 200));
		c.fillRect (lastBlockX, lastBlockY, 20, 20);  //Erases last block
		c.setColour (new Color (0, 255, 0));
		c.fillRect (xCoords [0], yCoords [0], 20, 20);
	    }
	    if (foodSpawnX == xCoords [0] && foodSpawnY == yCoords [0])
	    {
		blockEat = true;
		score++;
		numBlocks++;
	    }
	    c.setColour (new Color (200, 200, 200));
	    c.fillRect (500, 3, 120, 25);  //Background for score
	    c.setColour (new Color (0, 0, 0));
	    c.setFont (new Font ("Pixeled", 1, 10));
	    c.drawString ("score: " + score, 505, 20); //Score Text
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	    if (gameOver == true)
	    {
		break;
	    }
	}
	new Message ("GAME OVER. Score: " + score);     //Message telling user that game is over
	if (score != 0)
	{
	    String userName = "";
	    c.setCursor (24, 1);        //Sets cursor at bottom of game screen
	    c.setTextBackgroundColor (new Color (120, 120, 200));  //Background text colour
	    c.print ("Please enter a username: ");  //Prompt for entry of username
	    userName = c.readLine ();   //Gets username
	    try
	    {
		PrintWriter scoresFile = new PrintWriter (new BufferedWriter (new FileWriter ("HighScores.txt", true)));    //Accesses scores file
		scoresFile.println (score);     //writes score to file
		scoresFile.println (userName);  //writes username to file
		scoresFile.close ();
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    /*
	intstructions Method
	Displays instructions
	The for loop draws the background
		    Variable Dictionary
	I              Console     Instance variable for the instructions console window      
    */
    public void instructions ()
    {
	Console I;      //Seperate console for instructions
	I = new Console (10, 50);
	for (int z = 0 ; z < 420 ; z++) //Draws background
	{
	    I.setColour (new Color (120, 120, 200));
	    I.drawRect (0 + z, 0, 640 - z, 550);        //Background
	}
	I.setColour (new Color (0, 0, 0));
	I.setFont (new Font ("Pixeled", 1, 15));
	I.drawString ("SNAKE", 160, 25);    //Title Text
	I.setCursor (3, 1);
	I.setTextBackgroundColor (new Color (120, 120, 200));
	I.println ("Select 1 to play snake from the main menu. Control");       //Instructions Text
	I.print ("the snake with W (up) A (right) S (down) D (right)keys.");
	I.print (" If you collide into a");
	I.print (" wall or into the snake");
	I.print ("you lose. Gain points by ");
	I.print (" eating pellets. You will");
	I.print ("be asked to enter a name");
	I.println (" if you score 1 or higher.");
	I.println ();
	I.print ("Press any key...");
	I.getChar ();
	I.close ();
    }

    /*
	goodbye Method
	Displays goodbye message, closes window and stops program
	Try block used for a delay before the program closes
    */
    public void goodbye ()
    {
	drawTitle ();
	c.setFont (new Font ("Pixeled", 1, 30));
	c.drawString ("THANKS FOR PLAYING!", 50, 150);      //Goodbye Message
	c.drawString ("BY ANDREY STARENKY", 50, 220);
	try
	{
	    Thread.sleep (2500);
	}
	catch (Exception e)
	{
	}
	c.close ();
	System.exit (0);
    }

    /*
	highScores Method
	Displays top 10 High Scores (if there are less, it will display those) in order and allows the user to reset it
	The first for loop draws the background
	The first try block checks how many lines are in the file
	The second try block and for loop reads every second line as a score and username into an array
	The third and fourth (nested) for loop uses bubble sort to sort the high score values and usernames simultaneously
	The fifth for loop outputs the sorted high scores
	Input is taken to see if the user wants to continue back to main menu or clear the scoreboard
		    Variable Dictionary
	T              Console        Instance variable for the high scores console window     
	numberOfLines  int            Number of lines in the file, used to know how many lines to read in
	scan           String         Variable used to check line if its empty or not 
	scoreNums      int[]          Stores the values of the scores as integers
	scoreNames     String[]       Stores the usernames corresponding to the scores
	clearChar      char           Character inputted by the user to either exit the window, or if it is 'x' it will clear the scores
	sortVar        int            Variable used in bubble sort to assign temporary integer values
	sortVarString  String         Variable used in bubble sort to assign temporary String values
	reader         BufferedReader Instance variable of BufferedReader for reading from a file
	erase          PrintWriter    Instance variable of PrintWriter, used for reading clearing HighScores.txt file
    */
    public void highScores ()
    {
	Console T;
	T = new Console (20, 50);
	for (int z = 0 ; z < 420 ; z++)
	{
	    T.setColour (new Color (120, 120, 200));
	    T.drawRect (0 + z, 0, 640 - z, 550);        //Background
	}
	T.setColour (new Color (0, 0, 0));
	T.setFont (new Font ("Pixeled", 1, 15));
	T.drawString ("SNAKE", 160, 25); //Title Text
	T.setFont (new Font ("Pixeled", 1, 12));
	T.drawString ("HIGH SCORES", 140, 55); //Subheading
	T.setCursor (5, 1);
	T.setTextBackgroundColor (new Color (120, 120, 200));
	T.print (" User");          //High Score Table
	T.print ("", 5);
	T.println (" Score");       //Scores
	int numberOfLines = 0;      //Number of lines in the file
	String scan = "";
	try
	{
	    BufferedReader reader = new BufferedReader (new FileReader ("HighScores.txt")); //Opens the HighScores file to read number of lines
	    while (scan != null)
	    {
		scan = reader.readLine ();  //Sets variable to line content
		numberOfLines++;
		if (scan == "")
		    break;                  //Exits if there is an empty line (end of file)
	    }
	    reader.close ();                //Closes file
	}
	catch (Exception e)
	{
	}
	int[] scoresNums = new int [numberOfLines / 2];         //Array for the scores as ints
	String[] scoresNames = new String [numberOfLines / 2];  //Array for the usernames as Strings
	try
	{
	    BufferedReader reader = new BufferedReader (new FileReader ("HighScores.txt")); //Opens the HighScores file to read in the scores and usernames
	    for (int i = 0 ; i < numberOfLines / 2 ; i++)       //Loops to get all the scores
	    {
		try
		{
		    scoresNums [i] = Integer.parseInt (reader.readLine ());     //Reads in the score into the int score array
		}
		catch (Exception e)
		{
		}
		scoresNames [i] = reader.readLine ();                           //Reads in the username into the String score array

	    }
	    reader.close ();        //Closes file
	}
	catch (Exception e)
	{
	}
	int sortVar = 0;                //Temporary int sorting variable for bubble sort
	String sortVarString = "";      //Temporary String sorting variable for bubble sort
	for (int i = 0 ; i < scoresNums.length - 2 ; i++)       //Bubble Sort Main loop
	{
	    for (int x = 0 ; x < scoresNums.length - 1 ; x++)   //Bubble Sory inner loop
	    {
		if (scoresNums [x] > scoresNums [x + 1])
		{
		    sortVar = scoresNums [x + 1];   //Sorting the scores
		    scoresNums [x + 1] = scoresNums [x];
		    scoresNums [x] = sortVar;
		    sortVarString = scoresNames [x + 1];   //Sorting the usernames
		    scoresNames [x + 1] = scoresNames [x];
		    scoresNames [x] = sortVarString;
		}
	    }
	}
	for (int i = 0 ; i < 10 ; i++)                  //Loop for outputting top 10 scores
	{
	    if (scoresNums [scoresNums.length - i - 1] != 0)    //Checks to output the score if it is not 0
	    {
		T.print (i + 1 + ".");
		T.print (scoresNames [scoresNames.length - i - 1]);         //Outputs username
		T.setCursor (6 + i, 11);
		T.println (" " + scoresNums [scoresNums.length - i - 1]);   //Outputs score
	    }
	}
	T.println ("Press x to clear the high scores");     //Prompts to clear high scores
	T.println ("Press any key to continue...");         //Prompts to continue
	char clearScore = T.getChar ();                     //Variable to check if user wants to clear the High Scores
	if (clearScore == 'x' || clearScore == 'X')         //Checks if input key was 'x' or 'X'
	{
	    try
	    {
		PrintWriter erase = new PrintWriter (new FileWriter ("HighScores.txt"));    //Opens file to erase
		for (int i = 0 ; i < 10 ; i++)
		{
		    erase.println (" ");        //Erases line
		    erase.println (0);          //Prints 0 for top 10 scores as default
		}
		erase.close ();                 //Closes file
	    }
	    catch (Exception e)
	    {
	    }
	}
	T.close ();                             //Closes High Scores window
    }


    public ISPMain ()                //ISPMain constructor
    {
	c = new Console ("Snake by Andrey Starenky");   //Console
    }


    public static void main (String[] args)     //Main Method
    {
	ISPMain m = new ISPMain ();
       m.splashScreen ();
	while (true)        //Runs until goodbye is called
	{
	    m.mainMenu ();
	    if (m.choice == '1')       //If user selects Play Game Option
	    {
		m.levelSelector ();    //Selects level
		m.displayGame ();      //Runs game
	    }
	    else if (m.choice == '2')  //If user selects Instructions Option
	    {
		m.instructions ();     //Runs instructions
	    }
	    else if (m.choice == '3')  //If user selects High Scores Option
	    {
		m.highScores ();       //Runs High Scores
	    }
	    else if (m.choice == '4')  //If user selects Exit Option
	    {
		break;                 //Exits main while loop
	    }
	}
	m.goodbye ();                  //Runs goodbye (exit procedure)
    }
} //End of class


