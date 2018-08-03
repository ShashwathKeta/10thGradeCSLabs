package chapter18LabsClasses;

public class Rational {

	// add two instance variables
	// call the variables
	// numerator and denominator  (type int and make them private)
	
	private int numerator;
	private int denominator;	

	// write an initialization constructor
	// it should receive values for the numerator and denominator
	// and it should reduce the fraction by calling the reduce() method
	// REMEMBER:
	// a constructor has NO return type (NOT EVEN void)
	// it has the SAME NAME AS THE CLASS	

	public Rational(int num, int denum) {
		numerator = num;
		denominator = denum;
	}
	
	


	// write a setRational method
	public void setRational(int num, int den)
	{
		// store the input values into the instance variables
		numerator = num;
		denominator = den;	
	}
	
	
	

	// write  a setter method for numerator and a setter method for denominator
	// a setter method needs to have an input parameter to receive a value to store in an instance variable
	// they should always be void, since they do NOT return any data, they only receive data
	// public void setNumerator(int num)
	
	public void setNumerator(int num) {
		numerator = num;
	}
	
	public void setDenominator(int den) {
		denominator = den;
	}




	
	public Rational add(Rational  other)
	{
		// This is what you are trying to accomplish:
		// numerator/denominator  +  other.numerator/other.denominator 
		
		int num = 0;
		int den = 0;
		
		// These are the formulas to use:
		num = numerator * other.denominator + other.numerator * denominator;
		den = denominator * other.denominator;
		
		
		
		Rational result = new Rational(num, den);
		result.reduce();

		return result; // replace me (what are we supposed to return?)
	}



	private void reduce()
	{
		// to reduce you will need to find the greatest common divisor
		// Example:  8/12  the gcd is 4  (so we could try dividing by 8, 7, 6, 5, 4)
		int gcd = 1; // call the gcd() method below and send it your numerator and denominator
		
		gcd = gcd(numerator, denominator);
		
		
		
		// then we can divide the gcd into both the numerator and denominator to reduce our fraction
		
		numerator = numerator / gcd;
		denominator = denominator / gcd;
		
	}



	private int gcd(int numOne, int numTwo)
	{
		// see if divisor divides evenly into both numOne and numTwo
		// and if it does, return divisor
		
		for (int divisor=numOne; divisor>=1; divisor--)
		{
			if(numTwo%divisor == 0) {
				return divisor;
			}
		}


		return 1;
	}



	public Rational clone ()
	{
		// to make a clone of ourself, we will need to make a 
		// new Rational object that looks just like us
		// i.e. with the same numerator and denominator
		// Rational clone = new Rational(?, ?);
		
		return new Rational(numerator, denominator);  // replace me
	}



	// ACCESSORS

	// write getter methods for numerator and denominator
	// getter methods get something for the caller
	// and thus must have a return type (THEY ARE NEVER VOID)
	// they do not have any input parameters
	
	
	// getNumerator() should return the numerator
	public int getNumerator()
	{
		return numerator;  // replace me ?????			
	}
	
	public int getDenominator() {
		return denominator;
	}
	// getDenominator() should return the denominator
	
	
	
	// we are overriding (replacing) the equals method in the Object class
	public boolean equals( Object obj)
	{
		Rational other = (Rational) obj;  // we convert the reference to a Rational pointer (reference)

		// we will be considered equal if
		// my numerator == the other numerator (i.e. if  (numerator == other.numerator)   )
		// and (&&) my denominator == the other denominator
		
		if(numerator == other.numerator && denominator == other.denominator) {
			return true;
		}
		

		return false;
	}



	public int compareTo(Rational other)
	{
		// if my numerator / my denominator  is less than the other guy's then return -1
		// if my numerator / my denominator  is greater than the other guy's then return 1

		if((double)numerator/(double)denominator < (double)other.numerator/(double)other.denominator) {
			return -1;
		}
		
		if((double)numerator/(double)denominator > (double)other.numerator/(double)other.denominator) {
			return 1;
		}
		
		return 0;  // we must be the same
	}



	
	// write the  toString() method
	// it should return the fraction as a String (i.e. the return type must be String)
	// so if my fraction is 3/4, you should return "3/4"     numerator + "/" + denominator
	// if my fraction is 1/1, you should return "1"  (it is kinda iffy for this one)
	
	public String toString() {
		if(numerator == denominator) {
			return "" + numerator;
		}
		
		return numerator + "/" + denominator;
	}
}
