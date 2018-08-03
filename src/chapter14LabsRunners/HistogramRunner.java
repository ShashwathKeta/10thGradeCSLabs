package chapter14LabsRunners;

import chapter14LabsClasses.Histogram;

public class HistogramRunner {

	public static void main(String args[])
	{
		System.out.println("Lab Chapter 14 - #5  Histogram    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		

		
		// Histogram 1 ********************************************************************
		// create a new Histogram object
		Histogram histogramObjectReference = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3");
		System.out.println(histogramObjectReference);
		System.out.println();





		// Histogram 2 ********************************************************************
		// call the modifier method (setter method) to change the data inside the object
		histogramObjectReference.setHistogramArray("2 3 4 5 6 7 8 9 0 2 3 5 6 8 8 8 9 4 5");
		System.out.println(histogramObjectReference);
		System.out.println();
		
		// call the toString() method of the object and print the results
		// System.out.println(???????);
		System.out.println();





		// Histogram 3 ********************************************************************
		// call the modifier method (setter method) to change the data inside the object
		histogramObjectReference.setHistogramArray("2 3 4 5 6 7 8 2 0 2 3 5 6 8 8 8 9 4 5");
		System.out.println(histogramObjectReference);
		System.out.println();
		
		// call the toString() method of the object and print the results
		// System.out.println(??????????);		
		System.out.println();



		
		System.out.println();
		System.out.println();
	}

}
