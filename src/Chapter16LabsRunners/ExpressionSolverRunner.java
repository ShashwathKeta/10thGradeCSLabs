package Chapter16LabsRunners;

import chapter16LabsClasses.ExpressionSolver;

public class ExpressionSolverRunner {

	public static void main( String args[] )
	{
		System.out.println("Lab Chapter 16 - #2  ExpressionSolver    2018");
		System.out.println();
		System.out.println();
		
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		




		// get your add to work first
		ExpressionSolver test = new ExpressionSolver("3 + 5");
		test.solveExpression();
		System.out.println(test);
		System.out.println();


		// once you get all of the other operators finished, uncomment this code
		// and see if they all work

		test.setExpression("3 * 5");
		test.solveExpression();
		System.out.println(test);
		System.out.println();

		test.setExpression("3 - 5");
		test.solveExpression();
		System.out.println(test);
		System.out.println();

		test.setExpression("3 / 5");
		test.solveExpression();
	   	System.out.println(test);
		System.out.println();

	   	test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		test.solveExpression();
		System.out.println(test);
		System.out.println();

	   	test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		test.solveExpression();
		System.out.println(test);
		System.out.println();
		System.out.println();
		

	}

}
