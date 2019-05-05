import java.util.Arrays; 


/**
 * @author Andrey
 * Version 1.0
 * This program demonstrates Binary Insertion Sort
 * Code learned and adapted from https://www.geeksforgeeks.org/binary-insertion-sort/
 */
public class BinarySortDemo
{ 
    public static void main(String[] args) 
    { 
    	BinarySortDemo demo = new BinarySortDemo();
        final int[] arr = {41, 65, 19, 0, 6, 72, 47, 100, 33, 55, 89 };
        
        System.out.println("Original Array"); //Original Array heading
        
        for(int i=0; i<arr.length; i++) { //output original array
            System.out.print(arr[i]+" "); 
        }
        
        System.out.println();
        System.out.println("_________________________"); //Line Break
        System.out.println();
        System.out.println("Sorted Array"); //Sorted Array heading
        
        demo.sort(arr); //call binary sorting method
  
        for(int i=0; i<arr.length; i++) { //output sorted array
            System.out.print(arr[i]+" "); 
        }
    } 
  
    public void sort(int array[]) //Binary Sort Method
    { 
        for (int i = 1; i < array.length; i++) //For every element starting at index 1
        { 
            int x = array[i]; 
  
            //Use binary search to determine insert location 
            int insertLocation = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1); 
  
            //Shift elements past insert location to the right by 1
            System.arraycopy(array, insertLocation, array, insertLocation+1, i-insertLocation); 
  
            //Place the key in the insert location
            array[insertLocation] = x; 
        } 
    } 
} 
  
// Code contributed by Mohit Gupta_OMG  