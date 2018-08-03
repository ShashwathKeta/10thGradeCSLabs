package chapter16LabsClasses;

import java.util.*;

public class Student {

	String name;
	String id;
	String age;
	ArrayList <Integer> grades;	
	
	public Student(String theName, String theId, String theAge,
	               ArrayList<Integer> theGrades)
	{
		name = theName;
		id = theId;
		age = theAge;
		grades = theGrades;
	 	// FINISH ME	               
	}	
	
	
	public String getName()
	{
	 	// FINISH ME
				
		return name;  // replace me
	}

	public String getId()
	{
	 	// FINISH ME

		return id;  // replace me
	}

	public String getAge()
	{
	 	// FINISH ME

		return age;  // replace me
	}
	
	
	// finds the sum of grades
	public int getSum()
	{
		int sum = 0;
		
		for(int i = 0; i<grades.size(); i++) {
			sum = sum+grades.get(i);
		}

		return sum;  // replace me		
	}
	
	
	// finds the average of grades
	public double getAverage()
	{
		// FINISH ME
		double average = (double)getSum()/(double)grades.size();
		
		return average;  // replace me		
	}
	

	// finds the higest grade of grades
	public int getHighestGrade()
	{
		// FINISH ME
		int highest = Integer.MIN_VALUE;
		
		for(int i = 0; i<grades.size(); i++) {
			if(grades.get(i)>highest) {
				highest = grades.get(i);
			}
		}
		
		return highest;  // replace me		
	}
	
	
	// finds the lowest grade of grades
	public int getLowestGrade()
	{
		// FINISH ME
		int lowest = Integer.MAX_VALUE;
		
		for(int i = 0; i<grades.size(); i++) {
			if(grades.get(i)<lowest) {
				lowest = grades.get(i);
			}
		}
		
		return lowest;  // replace me		
	}

	
	// finds the difference of the highest and lowest grade
	public int getRange()
	{
		// FINISH ME
		int range = getHighestGrade()-getLowestGrade();
		
		return range;  // replace me		
	}

	
	// finds the number of val grades found in grades
	// for example if val is 100, it would count the
	//     number of times 100 appears in the list grades
	public int getCountOf(int val)
	{
		int count = 0;
		
		for(int i = 0; i<grades.size(); i++) {
			if(grades.get(i)==val) {
				count++;
			}
		}
		// FINISH ME
		
		return count;  // replace me		
	}


	// finds the number of grades greater than or equal to val
	public int getNumGTE(int val)
	{
		int count = 0;
		
		for(int i = 0; i<grades.size(); i++) {
			if(grades.get(i)>=val) {
				count++;
			}
		}
		// FINISH ME
		
		return count;  // replace me		
	}

	// finds the number of grades less than val
	public int getNumLT(int val)
	{
		int count = 0;
		
		for(int i = 0; i<grades.size(); i++) {
			if(grades.get(i)<val) {
				count++;
			}
		}
		// FINISH ME
		
		return count;  // replace me			
	}

	public String getGradeList()
	{
		String output = "";
		
		// FINISH ME
		// get a list of all of the grades separated with " "
		for (int i=0;  i<grades.size();  i++)
		{
		  output += grades.get(i) + " ";
		}	
			
		return output;
	}
}
