package chapter17LabClasses;

public class LetterBoxes {

	// instance variables and constructors could be present, but are not necessary
	
	public static void printLetterBox(char letter, int numRows)
	{
		
		for(int i = 0; i<numRows; i++) {
			for(int j = 0; j<numRows; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
		
	
	}

}
