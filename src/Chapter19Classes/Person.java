package Chapter19Classes;

public class Person extends Object implements Comparable{

	// add two instance variables called 
	// name (String)  and id (String)
	
	protected String name;
	protected String id;


	// write an initialization constructor
	// you should have parameters to receive the
	// name and the id (in that order)

	public Person(String nm, String ID) {
		name = nm;
		id = ID;
	}



	public String getName() {
		return name;
	}



	public String getId() {
		return id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setId(String id) {
		this.id = id;
	}


	// we will override the equals method which is defined
	// in the Object class
	// this person should be considered equal to the
	// other person if their names are the same
	

	public boolean equals( Object obj)
	{
		Person other = (Person) obj;

		if(name.equals(other.name)){
			return true;
		}


		return false;
	}


	// this method was declared in the 
	// comparable interface!  We must write it
	public int compareTo(Object obj)  
	{
		Person other = (Person) obj; // since we received the obj as an Object, we cast it as a Person
		
		
		// we should return -1 if this Person is less 
		// than the other Person (compare their names)
		if (getName().compareTo(other.getName()) < 0)
		     return -1;
		
		
		// we should return 1 if this Person is greater 
		// than the other Person
		if (getName().compareTo(other.getName()) > 0)
		     return 1;


		// we should return 0 if this Person is equal to 
		// the other Person (names are the same)
		
		if (getName().compareTo(other.getName()) == 0)
		     return 0;

		return 0;
	}



	
	// write a toString() method that returns
	// the Person's name followed by a space 
	// followed by the Person's id
	
	public String toString() {
		return name + " " + id;
	}
	
	
	
	

}
