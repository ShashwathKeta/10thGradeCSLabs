import java.util.Scanner;

public class doWhileTest {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		long count;
		
		while (true) {
			// this is a comment
			System.out.print("Enter the maximum number for your prime number: ");
			count = scan.nextLong();
			for (long i = (long) count; i > 0; i--) {
				if (noFactors(i)) {
					System.out.println("The highest prime number in your range is: " + i + "\n");
					break;
				}
			} 
		}
	}
	
	public static boolean noFactors(long i) {
		long count = i;
		
		for(int j = 2; j<Math.sqrt(count)+1; j++) {
        	if(count%j==0) {	
        		return false;
        	}
        }
		return true;
	}
}