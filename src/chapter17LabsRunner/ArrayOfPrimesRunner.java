package chapter17LabsRunner;

import java.util.Arrays;

import chapter17LabClasses.ArrayOfPrimes;

public class ArrayOfPrimesRunner {


	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #5  ArrayOfPrimes Extra Credit  2018");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		

		//Test Case 1: Finding the 1st 5 primes starting from 2.
		System.out.println("The 1st 5 primes starting from 2 are :: \n"
				+Arrays.toString(ArrayOfPrimes.getPrimeList(5,2)));   
		System.out.println();

		//Test Case 2: Finding the 1st 5 primes starting from 10.
		System.out.println("The 1st 5 primes starting from 10 are :: \n"
				+Arrays.toString(ArrayOfPrimes.getPrimeList(5,10)));   
		System.out.println();

		//Test Case 3: Finding the 1st 10 primes starting from 100.
		System.out.println("The 1st 10 primes starting from 100 are :: \n"
				+Arrays.toString(ArrayOfPrimes.getPrimeList(10,100)));
		
		System.out.println();  
		System.out.println();
		System.out.println();

	}

}
