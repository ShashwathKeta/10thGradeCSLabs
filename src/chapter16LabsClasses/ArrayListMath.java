package chapter16LabsClasses;

import java.util.ArrayList;

public class ArrayListMath {

	
	// FINISH ME
	public static int getSum(ArrayList<Integer> list)
	{
		int sum = 0;
		
		for(int i = 0; i<list.size(); i++) {
			sum = sum+list.get(i);
		}
		
		return sum;
	}
	
	
	
	// FINISH ME
	// PRECONDITION: list.size() is greater than 0
	public static double getAverage(ArrayList<Integer> list)
	{
		double average = (double)getSum(list)/(double)list.size();
		
		return average;
	}
	
	// FINISH ME
	public static int getLargestValue(ArrayList<Integer> list)
	{
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)>largest) {
				largest = list.get(i);
			}
		}
		
		return largest;
	}



	// FINISH ME
	public static int getSmallestValue(ArrayList<Integer> list)
	{
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)<smallest) {
				smallest = list.get(i);
			}
		}
		
		return smallest;
	}



	// FINISH ME
	public static int getNumberOfEvens(ArrayList<Integer> list)
	{
		int count = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)%2==0) {
				count++;
			}
		}
		
		return count;
	}



	// FINISH ME
	public static int getNumberOfOdds(ArrayList<Integer> list)
	{
		int count = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)%2==1) {
				count++;
			}
		}
		
		return count;
	}



	// FINISH ME
	// get the number of numbers greater than or equal to the parameter number
	public static int getNumberOfNumbersGTE(ArrayList<Integer> list, int number)
	{
		int count = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)>=number) {
				count++;
			}
		}
		
		return count;
	}



	// FINISH ME
	// get the number of numbers less than the parameter number
	public static int getNumberOfNumbersLT(ArrayList<Integer> list, int number)
	{
		int count = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)<number) {
				count++;
			}
		}
		
		return count;
	}
	

}
