import java.util.Scanner;

public class LogicalOperationApp1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * Develop a console application that
		 * determines if the user's entered integer is positive (> 0) 
		 */
		System.out.println("Enter an integer:");
		int i = input.nextInt();
		boolean isPositive = i > 0;
		System.out.println("The number you entered was positive: " + isPositive);
	//	System.out.println("The number you entered was positive: " + (i > 0)));

		input.close();
	}

}
