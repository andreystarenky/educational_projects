import java.util.Scanner;
/**
 * @author Andrey Starenky
 * April 14, 2019
 * Version 1.0
 * This program uses recursion to reverse an int by digits
 */
public class ReverseIntegerRecursion {
	
	/**reverse(int x)
	 * This method reverses an int digit by digit using recursion
	 * @param x   The input, an int
	 * @return    The output, the reversed int input
	 */
	public int reverse(int x) {
		if (x/10==0)   //If one digit int is left
			return x;  //Return the int
		return x%10*((int)Math.pow(10,(int)Math.log10(x)))+reverse(x/10); //returns the the last digit multiplied by 10 to the log10 of how many 10's places to shift it up by + the reverse of remaining values	
	}
	
	/**getInput()
	 * This method gets the input
	 * @return intInput    The user input, or -1 if it is invalid
	 */
	public int getInput() {
		Scanner in = new Scanner(System.in); //Scanner
		String input = in.nextLine();        //Gets next line input
		int intInput;						 //Stores int value
		try {								 //Errortrap
			intInput=Integer.parseInt(input);//Parse to int
			return intInput;				 //Returns int if valid input
		}
		catch(NumberFormatException e) {     //Input is not an int
			System.out.println("Invalid Input. Please enter a new int"); //Error message
			return getInput();				 //Returns new input
		}
	}
	
	/**main(String[] args)
	 * Outputs result of the reverse(int x) of input int
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseIntegerRecursion rir = new ReverseIntegerRecursion();
		System.out.println(rir.reverse(rir.getInput()));
		rir.reverse(rir.getInput());
	}
}
