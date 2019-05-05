import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


/**
 * @author Andrey Starenky
 * April 1, 2019
 * Version 1.0
 * <p>
 * This porgram outputs a formatted list of students and marks from a file
 * </p>
 *
 */
public class StudentMarksA
{
	/**
	 * @param main
	 * <pre>
	 * Variable Name            Variable Type        Description
	 * names					ArrayList<String>	 Stores all the names read from the file
	 * marks					ArrayList<Integer>	 Stores all the marks read from the file
	 * s						Scanner				 Scanner to read names and marks from file
	 * length 					int 				 Length of the ArrayList for marks
	 * space					String				 Stores string of spaces, unique based off of word in first column to format properly
	 * </pre>
	 */
	public static void main (String[] main)
	{
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> marks = new ArrayList<Integer>();
		try {
			Scanner s = new Scanner(new File("A7-1.txt"));//File
			while (s.hasNext()){//Adds names and marks to Array Lists
				names.add(s.next());//Reads next String
				marks.add(s.nextInt());//Reads next int
			}
			s.close();//Closes file
		}

		catch(FileNotFoundException e) {System.out.println("File Error");}
		int length = names.size();
		String space;
		for(int i =0; i<length;i++) {//Printing in columns
			space="";
			//Longest Name is 7 long. for 5 spaces apart, the mark should be at space 12
			//Spaces are added according to length of name, to ensure that all marks are aligned
			//Marks are 5 spaces away from longest word

			for(int x=names.get(i).length(); x<=12;x++) {//Adds enough spaces to allign all marks
				space+=" ";//Adds space
			}

			System.out.println(names.get(i)+space+marks.get(i));//Prints name, spaces, marks.
		}


	}
}
