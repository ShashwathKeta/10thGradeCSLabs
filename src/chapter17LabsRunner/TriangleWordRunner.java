package chapter17LabsRunner;

import java.util.Scanner;

import chapter17LabClasses.TriangleRunner;

public class TriangleWordRunner {

	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #4  TriangleWord    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		

   		Scanner keyboard = new Scanner(System.in);
   		String choice="";
   		
		do{
			System.out.print("\nEnter a word :: ");
			String word = keyboard.next();
	
			// call the static method printTriangle and
			//    send it (pass it) the word
			// you call a static method by TheNameOfTheClass.method
			TriangleRunner.printTriangle(word);

			System.out.print("\n\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		} while(choice.equals("Y")||choice.equals("y"));		
			

		System.out.println();
		System.out.println();


		
	}

}
