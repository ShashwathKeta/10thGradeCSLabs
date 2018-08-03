import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AscendingOrder {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String testNumbers;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers seperated by commas: ");
		testNumbers = scanner.nextLine();
		scanner.close();
		
		Scanner miniScan = new Scanner(testNumbers);
		miniScan.useDelimiter(",");

		while (miniScan.hasNext()) {
			int i=0;
			try {
				i = miniScan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Enter Numbers only. Error occured at: " + numbers
						+ "\n stopped scanning after this point.");
				return;
			}
			if (numbers.contains(i)) {
				continue;
			} else {
				numbers.add(i);
			} 
		}
		
		Collections.sort(numbers);
		System.out.println("Sorted numbers: " + numbers);
	}
}