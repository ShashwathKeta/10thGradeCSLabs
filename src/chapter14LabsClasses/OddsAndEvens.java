package chapter14LabsClasses;

import java.util.Scanner;

public class OddsAndEvens {

	
	// this finds how many odd or even numbers are in the array
	// if odd is true, it counts the number of odd numbers in array
	// if odd is false, it counts the number of even numbers in array
	
	private static int countEm(int[] array, boolean odd)
	{
		int count = 0; 
			
		if (odd)  
		{
			// in here, count the number of odd numbers in array
			
			// loop through (traverse) the array starting at position 0
			// each time through the loop check and see if the ith
			// element is an odd number, and if so add one to count
			// How do you see if the ith element is an odd number?
			//     array[i] % 2 == 1
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] % 2 == 1) {
					count++;
				}
			}
			
		}
		else
		{
			// in here, count the number of even numbers in array
			for(int i = 0; i < array.length; i++) {
				if(array[i] % 2 == 0) {
					count++;
				}
			}
			
			
		}
		
		return count;  // change me (what is it that you need to return?)
	}
	
	
	
	// this creates an array and fills it with all of the even numbers from array
	// see a picture below to help you understand better 
	public static int[] getAllEvens(int[] array)
	{
		
		// STEP 1: *********************************************************************
		// first we will get the number of even numbers in array
		// notice that the FALSE parameter tells the method to count the number of EVENS
		int numEvens = countEm(array,false);
		
		
		
		// STEP 2: *********************************************************************
		// create a temporary array that can hold the correct number of elements
		int [] tempArray = new int[numEvens];
		
				
		int k = 0;  // position in tempArray that will receive the next element
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				tempArray[k] = array[i];
				k++;
			}
		}
		// for (int i=?;  i<array.?;  ???)
		// {
				// if the number in position i of array is even, then copy it
				// to tempArray and increment k so that it once again is the
				// position in tempArray that will receive the next element
			
		// }
		
		
		
		
		// STEP 4: *********************************************************************
		return tempArray;  // change me (what is it that you need to return?)
		
	}




	// this creates an array and fills it with all of the odd numbers from array
	public static int[] getAllOdds(int[] array)
	{
		// look at how you did  getAllEvens
		// make sure that your solution to getAllEvens works before you start this code
		int numOdds = countEm(array,true);
		
		int [] tempArray = new int[numOdds];
		
		
		int k = 0;  // position in tempArray that will receive the next element
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 1) {
				tempArray[k] = array[i];
				k++;
			}
		}
		
		return tempArray;   // change me (what is it that you need to return?)		
	}

}
