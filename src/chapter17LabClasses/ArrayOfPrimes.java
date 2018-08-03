package chapter17LabClasses;

public class ArrayOfPrimes {

	// instance variables and constructors could be present, but are not necessary


	// isPrime will return true if num is prime
	// a prime number is any number only divisible by 1 and itself
	private static boolean isPrime(int num)
	{
		
		if(num == 2)
			return true;
		
		for(int i = 2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	
	// getPrimeList(int numPrimes) will return an array 
	// containing the first numPrimes primes starting at 2

	// getPrimeList(int numPrimes, int primeStart) will return an array 
	// containing the first numPrimes primes starting at primeStart
	
	public static int[] getPrimeList(int numPrimes, int primeStart)
	{
		int[] primes = new int[numPrimes];		

		int prime = primeStart;
			
		for (int i=0; i<numPrimes; i++)			
		{
			// find a prime number and put it into the array primes at the i position
			
			boolean foundPrime = false;
			
			while (!foundPrime)
			{
				// see if prime is a prime number (call a method)
				// it's very iffy
				// and if it is prime, then
				// {
				//    1) store prime into the array at the i position
				//    2) set foundPrime to true since you found a prime number
				//    3) add 1 to prime
				// }
				
				if(isPrime(prime)) {
					primes[i] = prime;
					foundPrime = true;
				}
				prime++;
			}	
		}		
		return primes;
	}
}
