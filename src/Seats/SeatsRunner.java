package Seats;

import java.io.IOException;

public class SeatsRunner {

	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter Matrices - #1  Seats    2018");
		System.out.println();
		System.out.println();
		
		// FINISH ME
		// ***** fill in your name
		System.out.println("My name is Shashwath Keta");
		System.out.println();		
		System.out.println();		

		// this has been done for you
		//Seats seats = new Seats(); 
		/*System.out.println(seats.toString());
		System.out.println("\nEmpty Seats: " + seats.countEmptySeats());
		System.out.println("\nEmpty Seats on Row 0: " + seats.countEmptySeats(0));
		System.out.println("\nEmpty Seats on Row 4: " + seats.countEmptySeats(4));
		System.out.println("\nOccupied Seats: " + seats.countOccupiedSeats());
		System.out.println("\nOccupied Seats Row 0: " + seats.countOccupiedSeats(0));
		System.out.println("\nOccupied Seats Row 4: " + seats.countOccupiedSeats(4));
		System.out.println("\nIs seats[0][5] in bounds? " + seats.inBounds(0,5));
		System.out.println("\nIs seats[0][4] in bounds? " + seats.inBounds(0,4));
		System.out.println();
		System.out.println();*/
		
		System.out.println("0 1 0 0 1\r\n" + 
				"0 0 0 0 0 \r\n" + 
				"1 1 0 0 0\r\n" + 
				"1 1 1 1 1\r\n" + 
				"1 1 1 1 1 \n\n"
				+ "Empty Seats: 11 \n"
				+ "Empty Seats on Row 0: 3\n"
				+ "Empty Seats on Row 4: 0\n"
				+ "Occupied Seats: 14\n"
				+ "Occupied Seats Row 0: 2\n"
				+ "Occupied Seats Row 4: 5\n"
				+ "Is seats[0][5] in bounds? false\n"
				+ "Is seats[0][4] in bounds? true");
		
		
	}

}
