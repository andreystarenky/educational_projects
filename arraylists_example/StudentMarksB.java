import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * @author Andrey Starenky
 * April 1, 2019
 * Version 1.0
 * <p>
 * This program outputs a formatted list of students and marks from a file
 * Sorted alphabetically
 * </p>
 *
 */
public class StudentMarksB
{
	/**
	 * @param main
	 * <pre>
	 * Variable Name            Variable Type        Description
	 * names					ArrayList<String>	 Stores all the names read from the file
	 * marks					ArrayList<Integer>	 Stores all the marks read from the file
	 * s						Scanner				 Scanner to read names and marks from file
	 * length 					int 				 Length of the ArrayList for marks
	 * min						int					 Default minimum index in the ArrayList when performing Selection Sort
	 * tempString				String				 Stores temporary string to assign to min, smallest (alphabetically) string in the ArrayList
	 * tempInt 					int					 Stores temporary int to assign to min, smallest int in the ArrayList
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
    	
    	//Selection Sorting for Names Alphabetically
        for (int i = 0; i < length-1; i++) //Printing in columns
        { 
            int min = i; //Default Minimum
            for (int x = i+1; x < length; x++) 
                if (names.get(x).compareToIgnoreCase(names.get(min))<0) {//Checks to find minimum string (alphabetically)
                    min = x; 
                }
            String tempString = names.get(min); //Temporary String and Integer variables
            Integer tempInt = marks.get(min); 
            names.set(min, names.get(i)); //Swaps minimum String with first index
            names.set(i, tempString);
            marks.set(min, marks.get(i)); //Swaps smallest int with first index
            marks.set(i, tempInt);
        }
    	
    	String space;
    	for(int i =0; i<length;i++) {
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
