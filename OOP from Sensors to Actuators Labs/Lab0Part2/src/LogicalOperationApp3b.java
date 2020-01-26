import java.util.Scanner;

public class LogicalOperationApp3b {

	public static void main(String[] args) {
		/*
		 * We expect the integer entered by the user
		 * not to be in a particular range.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer that is not between 1 and 10:");
		int i = input.nextInt();
		// Wrong choice of operator
		boolean isNotBetween1and10 = i < 1 && i > 10; // this condition is equivalent to false!!!
		System.out.println("The number you entered " + i + " is not between 1 and 10: " + isNotBetween1and10);
		input.close();		
	}
}
