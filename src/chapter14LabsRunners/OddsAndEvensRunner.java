package chapter14LabsRunners;

import java.util.Arrays;

import chapter14LabsClasses.OddsAndEvens;

public class OddsAndEvensRunner {

	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 14 - #3  OddsAndEvens    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		


		// the main method has been finished for you
		int [] one = {2,4,6,8,10,12,14};
		int [] two = {1,2,3,4,5,6,7,8,9};

		System.out.println("Array - " + Arrays.toString(one));
		System.out.println("Odds  - " + Arrays.toString(OddsAndEvens.getAllOdds(one)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(one)));

		System.out.println("Array - " + Arrays.toString(two));
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(two)));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(two)));

		System.out.println("Array - " + Arrays.toString(new int[]{2,10,20,21,23,24,40,55,60,61})); // look how else we can do this! 
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(new int[]{2,10,20,21,23,24,40,55,60,61})));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(new int[]{2,10,20,21,23,24,40,55,60,61})));


	}

}
