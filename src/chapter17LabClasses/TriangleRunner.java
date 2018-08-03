package chapter17LabClasses;

public class TriangleRunner {

	// instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		// you need to have an outside loop that prints
		//     word.length rows 
		// Example:  Suppose word is box
		// then you would print the following:
		//b          when row = 1
		//bobo       when row = 2
		//boxboxbox  when row = 3
		
		for (int row=1;  row<=word.length();   row++)
		{
			// for each row you will need to print a piece of the
			// word    word.substring(0,?)  row times
			// so you will need an inside loop to execute row times
			for (int k=1;  k<=row;  k++)
			{
				System.out.print(word.substring(0, row));
			}
			System.out.println();
		}
		
		
		
	}

}
