package TicTacToe;

public class TicTacToe {

	private char[][] mat;

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		// instantiate a two dimensional array of char (i.e.  mat = ????)
		
		mat[0][0] = game.charAt(0);
		mat[0][1] = game.charAt(1);
		mat[0][2] = game.charAt(2);
		mat[1][0] = game.charAt(3);
		mat[1][1] = game.charAt(4);
		mat[1][2] = game.charAt(5);
		mat[2][0] = game.charAt(6);
		mat[2][1] = game.charAt(7);
		mat[2][2] = game.charAt(8);
		// next, get the characters out of game
		// mat[0][0] = game.charAt(0);
		// mat[0][1] = game.charAt(1);
		// loops would simplify this process
		// use nested loops with r and c to move through the matrix
		// use a separate variable to move through the String (it's one dimensional)
		// for example mat[r][c] = game.charAt(k);

	}

    // see if ch (X or O) is a winner
    // precondition: row is a valid row, and ch is either an X or O
    // postcondition: returns true if X or O is a winner on row
	public boolean checkRow(int row, char ch)
	{
		//if (ch==mat[row][0] && ch == mat[row][1] && etc.)
		//	return true;
		
		if(ch == mat[row][0] && ch == mat[row][1] && ch == mat[row][2]) {
			return true;
		}
		return false;	
	}
	
    // see if ch (X or O) is a winner
    // precondition: row is a valid row, and ch is either an X or O
    // postcondition: returns true if X or O is a winner on col
	public boolean checkCol(int col, char ch)
	{
		if(ch == mat[0][col] && ch == mat[1][col] && ch == mat[2][col]) {
			return true;
		}
		
		return false;	
	}
	


    // see if ch (X or O) is a winner
    // precondition: ch is either an X or O
    // postcondition: returns true if X or O is a winner on diagonal 1 
	public boolean checkDiagonal1(char ch)
	{
		if(ch == mat[0][0] && ch == mat[1][1] && ch == mat[2][2]) {
			return true;
		}
		
		return false;
	}

    // see if ch (X or O) is a winner
    // precondition: ch is either an X or O
    // postcondition: returns true if X or O is a winner on diagonal 2 
	public boolean checkDiagonal2(char ch)
	{
		if(ch == mat[2][0] && ch == mat[1][1] && ch == mat[0][2]) {
			return true;
		}
		
		return false;
	}

	// this method should return the winner
	// Examples:
	// X wins horizontally!  or  Y wins vertically!  or  X wins diagonally!  or  Cat's Game
	public String getWinner()
	{
		// check and see if X wins horizontally
		for (int r=0; r<=2; r++)
			if (checkRow(r,'X'))		
				return "X wins horizontally";

		// check and see if O wins horizontally

		for (int r=0; r<=2; r++)
			if (checkRow(r,'O'))		
				return "O wins horizontally";

		// check and see if X wins vertically

		for (int c=0; c<=2; c++)
			if (checkCol(c,'X'))		
				return "X wins Verticaly";
		// check and see if O wins vertically

		for (int c=0; c<=2; c++)
			if (checkRow(c,'X'))		
				return "O wins Verticaly";

		// check and see if X wins diagonally
		
		if(checkDiagonal1('X') || checkDiagonal2('X')) {
			return "X wins Diagonally";
		}

		// check and see if O wins diagonally
		
		if(checkDiagonal1('O') || checkDiagonal2('O')) {
			return "O wins Diagonally";
		}


		return "Cat's Game";
	}

	// this method should return the game formatted like:
	// X X X
	// O O X
	// X O O
	public String toString()
	{
		String output="";

		// use nested loops to get the output

		for(int r = 0; r<3; r++) {
			for(int c = 0; c<3; c++) {
				output += mat[r][c];
			}
			output += "\n";
		}


		return output;
	}

}
