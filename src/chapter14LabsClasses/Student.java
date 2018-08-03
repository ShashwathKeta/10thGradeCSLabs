package chapter14LabsClasses;

public class Student {

	// instance variables to hold the name and grades
	// name should be of the type String
	// grades should be of the type int []
	// remember to mark your instance variables as private
	
	private String name;
	private int[]  grades;
	

	// initializer constructor
	// Remember that constructors should generally have public access
	// Also, constructors should have the same name as the class and no return value
	public Student(String theName, int [] theGrades)
	{
		// assign the incoming values to the instance variables
		name = theName;
		grades = theGrades;
		

	} // remember, the parameters will be destroyed at this point



	public double getAverage()
	{
		// find the average and return it
		double sum = 0;
		
		for (int i=0; i<grades.length; i++)
		{
			// add the ith grade to the sum
			sum += grades[i];
		}
		
		return sum/grades.length;  // return the average
	}
	
	
	
	// toString() method
	// this method should return the list of numbers
	public String toString()
	{
		String output = name + "\n";
		
		output += "[";		
		
		for (int i=0; i<grades.length; i++)
		{
			// join or concatenate the ith grade to the output
			if (i < grades.length-1)
				output += grades[i] + ", ";
			else
				output += 0;			
		}
		
		output += "]";
		output += "\n";


		// call the getAverage method
		output += getAverage() + "\n";


		return output;
	}
	
	
	

}
