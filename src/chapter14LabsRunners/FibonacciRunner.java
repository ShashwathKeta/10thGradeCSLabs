package chapter14LabsRunners;

import chapter14LabsClasses.Fibonacci;

public class FibonacciRunner {

	public static void main(String args[])
	{
		System.out.println("Lab Chapter 14 - #6  Fibonacci    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name here ************************************
		String x = "Shashwath Keta";
		
		System.out.println("My name is " + verifyName(x));
		System.out.println();		
		System.out.println();		


		// create a Fibonacci object
		Fibonacci fiboObject = new Fibonacci();
		
		
		if (isOk(x))
		{
			// call the toString() method of the object and print the results
			System.out.println(fiboObject);
		}

		System.out.println();		
		System.out.println();		
	}
	
	
	public static boolean isOk(String name)
	{		
		if (name.equals("????????  ????????????????"))
		{
			return false;
		}
		
		return true;
	}

	
	public static String verifyName(String name)
	{		
		if (name.equals("????????  ????????????????"))
		{
			String output = "\n";
			
			for (int i=1; i<=100; i++)
				output += "I DID NOT PUT MY NAME ON THE OUTPUT. OH NO!!!!!!!!!!!!!!!   NO GRADE!\n";		
			
			return output;
		}
		
		return name;
	}
	

}
