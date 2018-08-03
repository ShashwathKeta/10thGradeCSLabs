package Chapter18Runners;

import chapter18LabsClasses.Word;

public class WordRunner {

	public static void main(String[] args)
	{

		System.out.println("Lab Chapter 18 - #2  Word    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		


		
		Word word = new Word("chicken");
		
		System.out.println(word.toString());
		System.out.println("num vowels == " + word.getNumVowels());
		System.out.println("num chars  == " + word.getLength() + "\n");
		
		word.setWord("alligator");

		System.out.println(word.toString());
		System.out.println("num vowels == " + word.getNumVowels());
		System.out.println("num chars  == " + word.getLength() + "\n");
		
		word.setWord("elephant");

		System.out.println(word.toString());
		System.out.println("num vowels == " + word.getNumVowels());
		System.out.println("num chars  == " + word.getLength() + "\n");
	}

}
