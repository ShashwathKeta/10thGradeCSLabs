package chapter16LabsClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFunHouse {

	

	public static boolean isDivisor(int number, int divisor)
	{
		// we will see if number is divisible by divisor
		
		if (number%divisor == 0)    // number is divisible by divisor
			return true;
		
		
		return false;
	}
	
	
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		// first we create an ArrayList that can hold Integer objects
		ArrayList<Integer> list = new ArrayList <Integer>();
		
		
		// loop through the possible factors of number (not including the number itself)
		// For example, if the number is 50, consider possible factors 1,2,3,4,5,....25
		for (int divisor = 1; divisor <= number/2; divisor++)
		{
		     if (isDivisor(number, divisor))  // is number divisible by divisor? Call your helper method
		          list.add(divisor);  // if so, add divisor to your list
		}   
		
		
		
		return list;  // replace me (think about what you need to return)
	}
	

	// the number is composite if it has at least one factor other than 1 and itself
	public static boolean isComposite(int number)
	{
		// loop through all possible factors from 2 to number/2
		// if you find a factor in this range, return true
		
		for(int div = 2; div<=number/2; div++) {
			if(number%div == 0) {
				return true;
			}
		}
		
		 
		// do this last, it should not be part of your loop 
		return false;  // we did not find any factors in the range of 2 to number/2
	}

	
	// You will modify this list (nums) by removing numbers that are not composite numbers
	// You will not return anything (the method is void)
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		// YOU MUST USE AN INDEX BASED LOOP (regular for loop), since you may be modifying the list of numbers
		// ALSO, IF YOU REMOVE AN ELEMENT, DO NOT INCREMENT YOUR INDEX 
		;
		
		for(int i = 0; i<nums.size();) // do not increment i here
		{
			
			if(isComposite(nums.get(i)))  // if the number is composite, we keep it and add 1 to i
				i++;
		//          add 1 to i;
		    else {
		    	nums.remove(i);
		    }
		//          remove this number from the list called nums (don't increment i)
		}
		
		
	}
	
	

}
