package Chapter19Classes;

public class Cat implements Comparable{

	// add two instance variables called 
	// name (String)  and age (int)
	// mark them with private access
	private String name;
	private int age;



	// you are give the initialization constructor
	// we are using the this reference so that we do not get a shadowing error
	// typing name = name; is a shadowing error and a -1 on AP exam 
	
	public Cat(String name, int age)
	{
		this.name = name; // this.name refers to the instance variable name
		this.age = age; // this.age refers to the instance variable age
	}

	// Override the equals method which is defined
	// in the Object class. Complete this method
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean equals( Object obj)
	{
		return false;
	}


	// this method was declared in the 
	// Comparable interface!  We must write it!
	// compare by the age
	public int compareTo(Cat other)
	{
		// we should return -1 if this cat is less 
		// than the other cat
		
		if(age < other.age) {
			return -1;
		}
		
		else if(age > other.age) {
			return 1;
		}
		
		else if(age == other.age) {
			return 0;
		}
		
		// we should return 1 if this cat is greater 
		// than the other cat



		// we should return 0 if this cat is equal to 
		// the other cat

		return 0;
	}



	
	// write a toString() method that returns
	// the Cat's name followed by a space 
	// followed by the Cat's age
	// return getName() + " " + getAge()
	
	public String toString() {
		return getName() + " " + getAge();
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
