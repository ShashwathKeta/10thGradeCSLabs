package chapter14LabsClasses;

public class ArrayFunHouse {
	// getSum() will return the sum of the numbers from start to stop, including stop
		@SuppressWarnings("null")
		public static int getSum(int[] numArray, int start, int stop)
		{
			// you will need a temporary local variable to keep track of the sum
			int sum = 0;
			
			
			// you will need a for loop to traverse the array
			// from start to stop,  including stop
			
			if(start > numArray.length-1) {
				System.out.println("ERROR: The start or stop values are not in the array");
				return (Integer) null;
			}
			
			
			for (int i = start;  i <= stop; i++)
			{
				sum = sum + numArray[i];
			}
			
			
			return sum;  // ***************** change me
		}



		// getCount() will return number of times val is present
		public static int getCount(int[] numArray, int val)
		{
			// you will need a temporary local value to keep track of the 
			// number of times that you find val in the array
			int count = 0;
			
			for(int i = 0; i<numArray.length; i++) {
				if(numArray[i] == val) {
					count++;
				}
			}
			
			// you will need a for loop to traverse the array
			
				
				// each time through the loop, you will need to check
				// and see if (numArray[i] == val)
				// and if so, add 1 to your count	
			
			
			return count;  // ***************** change me
		}



		// *** There is a picture at the end of this class that may
		//     help you understand this problem better.
		public static int[] removeVals(int[] numArray, int val)
		{
			// First we will create a new int [] to hold only the 
			// 		numbers that are not equal to val
			
			// The size of the new array should be 
			// 		the length of numArray - (subtract)the number of elements that we are removing from numArray
			
			// How do you find the length of numArray?   
			//    	numArray.???
			
			// How do you find the number of elements that we are removing from numArray?
			//      getCount(???, ???)
			
			int[] tempArray = new int[numArray.length-getCount(numArray,val)];
			
			// int size = numArray.??? - getCount(???, ???);
			// int [] tempArray = ??? int[size];
			
			
			
			// Now you will need to copy all of the elements from numArray
			//  	that are not equal to val to the tempArray.
			 
			
			// You will need to traverse numArray, so you need a for loop,
			// but you will also need to keep track of where to put each 
			// element into the tempArray.
			
			int k = 0;  // position in tempArray that will receive the next element
			
			for(int i = 0; i<numArray.length; i++) {
				if(numArray[i] != val) {
					tempArray[k] = numArray[i];
					k++;
				}
			}
			
			// for (int i=?;  i<numArray.?;  ???)
			// {
					// if the number in position i of numArray is not equal to val, then copy it
					// to tempArray and increment k so that it once again is the
					// position in tempArray that will receive the next element
				
			// }
			 
			 
			return tempArray;  // ***************** change me (what is it that you need to return?????)
		}
}
