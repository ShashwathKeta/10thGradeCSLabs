package Chapter19Runners;

import java.util.ArrayList;
import java.util.Collections;

import Chapter19Classes.Person;

public class PersonRunner {

	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 19-20 - #2  Person    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		


		// *** the main program has been done for you


		ArrayList<Person> persons = new ArrayList<Person>();
		
		Person person1 = new Person("Tom","34589");
		persons.add(person1);
		
		Person person2 = new Person("Jill","34999");
		persons.add(person2);
		
		Person person3 = new Person("Jack","34888");
		persons.add(person3);
		
		
		
		// in order to use Collections.sort()
		// the Person class has to implement the
		// comparable interface
		
		Collections.sort(persons);
		
		System.out.println(persons.toString());
		
		
		
	}

}
