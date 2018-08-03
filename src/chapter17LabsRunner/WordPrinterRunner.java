package chapter17LabsRunner;

import java.util.Scanner;

import chapter17LabClasses.WordPrinter;

public class WordPrinterRunner {

	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 17 - #2  WordPrinter    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		


   		Scanner keyboard = new Scanner(System.in);
   		String choice="";
   		
		do{
			System.out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
	
			System.out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();			
			
			WordPrinter.printWord(word, times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		} while(choice.equals("Y")||choice.equals("y"));		


		System.out.println();
		System.out.println();



	}

}
