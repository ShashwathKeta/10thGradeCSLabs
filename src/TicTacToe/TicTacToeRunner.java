package TicTacToe;

import java.io.IOException;
import java.util.Scanner;

public class TicTacToeRunner {

	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter Matrices - #2  TicTacToe    2018");
		System.out.println();
		System.out.println();
		
		String info = "5\r\n" + 
				"XXXOOXXOO\r\n" + 
				"OXOOXOXOX\r\n" + 
				"OXOXXOXOO\r\n" + 
				"OXXOXOXOO\r\n" + 
				"XOXOOOXXO\r\n";
		
		// FINISH ME
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		


		Scanner file = new Scanner (info);

		// we will read in the number of games
		int numberOfGames = file.nextInt();
		file.nextLine();
		
		// read in one game and determine the winner
		for (int i=1; i<=numberOfGames; i++)
		{
			// read in the game result 
			// the first three characters are for row 0, the next three for row 1, etc.
			String game = file.nextLine(); // something like XXXOOXXOO
			
			// instantiate a new TicTacToe object (new it!)
			TicTacToe obj = new TicTacToe(game);
			System.out.println(obj);
			System.out.println(obj.getWinner());
			// call your toString() method to print out the Tic Tac Toe board
			
			// call your getWinner() method and print it
			
			System.out.println();		
			System.out.println();
			
		}






	}

}
