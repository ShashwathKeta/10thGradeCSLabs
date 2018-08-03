package chapter18LabsClasses;

import java.util.Arrays;

public class Doggies {


	private Dog[] pups;  // you have an array of Dog objects named pups


	public Doggies(int size)
	{
		// point pups to a new array of Dog
		 pups = new Dog[size];
		
	}


	
	public void add(int spot, int age, String name)
	{
		// add a new Dog to the array at the spot position (index) 
		// make sure spot is in bounds
		
		 Dog pup = new Dog(age, name);
		 if (spot >= 0 && spot < pups.length)
		     pups[spot] = pup;
	}



	public String getNameOfOldest()
	{
		Dog oldest = pups[0];
		
		for(Dog var: pups) {
			if(var.getAge() > oldest.getAge()) {
				oldest = var;
			}
		}
		
		return oldest.getName();  // change me
	}



	public String getNameOfYoungest()
	{
		// see above comments for a hint
		Dog youngest = pups[0];
		
		for(Dog var: pups) {
			if(var.getAge() < youngest.getAge()) {
				youngest = var;
			}
		}
		
		return youngest.getName();  // change me
	}



	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
	

}
