package chapter17LabClasses;

public class WordPrinter {

	// instance variables and constructors could be present, but are not necessary
		
	public static void printWord(String word, int times)
	{
		// print out the word each time on a separate line
		// do it times times
		 
		for(int i = 0; i<times; i++) {
			System.out.println(word);
		}
		
		System.out.println(); // skips a line
	}

}
