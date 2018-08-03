package Chapter18Runners;

import java.util.Scanner;

import chapter18LabsClasses.Doggies;

public class DoggiesRunner {

	   public static void main( String[] args )
	   {
			System.out.println("Lab Chapter 18 - #1  Doggies    2018");
			System.out.println();
			System.out.println();
			
			// ***** fill in your name
			System.out.println("My name is Shashwath Keta");
			System.out.println();		
			System.out.println();		


			// the rest of this has been done for you

			Scanner keyboard = new Scanner(System.in);

			
			System.out.print("How many Dogs are in the pack? :: ");
			int size = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println();
			
			Doggies pack = new Doggies(size);

			for(int i=0; i<size; i++)
			{
				System.out.print("Enter the age :: ");
				int age = keyboard.nextInt();
				keyboard.nextLine();
				
				System.out.print("Enter the name :: ");
				String name  = keyboard.nextLine();
				pack.add(i, age, name);
				System.out.println();
			}	
			System.out.println("\n\n");
			System.out.println("pack :: "+pack);
			System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
			System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());		
		}		

}
