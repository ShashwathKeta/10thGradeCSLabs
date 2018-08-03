package Chapter19Classes;

import java.util.ArrayList;

public class Student extends Person implements Comparable {

	// add an instance variable called 
	// grades, which is an ArrayList<Integer>
	
	ArrayList<Integer> grades;


	// write an init constructor
	// you should have parameters to receive
	//    the name, id, and an ArrayList<Integer> reference
	//    in that order
	// call super(name, id);  to initialize the Person part 
	// the call to super MUST be the first line of code
	// what do you need to do to grades?

	public Student(String nm, String ID, ArrayList<Integer> ref) {
		super(nm, ID);
		grades = ref;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}


	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

// we will override the equals method which is defined
	// in the super class
	// two Student objects will be considered equal if
	// their names are the same

	public boolean equals( Object obj)
	{
		Student other = (Student) obj;
		
		if(name == other.getName()) {
			return true;
		}

		return false;
	}

	public double getAverage() {
		
		double sum = 0;
		for(int i = 0; i<grades.size(); i++) {
			sum = sum + grades.get(i);
		}
		
		return sum/grades.size();
	}

	// this method was declared in the 
	// comparable interface!  We must write it
	// compare this student's average to the 
	//    other student's average
	public int compareTo(Object obj)
	{
		Student other = (Student) obj; // cast obj as a Student
		
		
		// we should return -1 if this Student is less 
		// than the other Student
		
		if(getAverage() < other.getAverage()) {
			return -1;
		}
		
		// we should return 1 if this Student is greater 
		// than the other Student
		
		if(getAverage() > other.getAverage()) {
			return 1;
		}


		// we should return 0 if this Student is equal to 
		// the other Student
		
		if(getAverage() == other.getAverage()) {
			return 0;
		}
		
		return 0;
	}



	
	// write a toString() method that returns
	// the Student's name followed by a space 
	// followed by the Student's id, followed by
	// the Student's list of grades
	// call super.toString() to get the Person part
	//    and then grades.toString() to get the grades
	
	public String toString() {
		return super.toString() + " " + grades.toString();
		
	}
	
	
	
	

}
