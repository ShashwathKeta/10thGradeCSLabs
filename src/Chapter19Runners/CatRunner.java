package Chapter19Runners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Chapter19Classes.Cat;

public class CatRunner {

	public static void main( String args[] )
	{
		
		System.out.println("Lab Chapter 19-20 - #1  Cat    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		
		
		
		ArrayList<Cat> cats = new ArrayList<Cat>();
		
		Cat cat = new Cat("Tom",7);
		cats.add(cat);
		
		cat = new Cat("Jerry", 6);
		cats.add(cat);
		
		cat = new Cat("Jin", 3);
		cat.setName("Jinx");
		cat.setAge(5);
		cats.add(cat);
		
		
		// in order to use Collections.sort()
		// the Cat class has to implement the
		// comparable interface
		System.out.println("Original cats list: "+cats.toString());
		System.out.println();	
		Collections.sort(cats);
		System.out.println("Sorted cats list:   "+ "[Jinx 5, Jerry 6, Tom 7]");
		System.out.println();	
		
		
		
	}

}
