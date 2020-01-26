import java.util.Scanner;

public class IfStatementApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Problem: read from the user an integer, and return the absolute value.
		 */
		System.out.println("Enter an integer:");
		int i = input.nextInt();
		int abs = i;
		if(i < 0) {
	// 		abs = -1; 
			abs = abs * -1; 
		}
		System.out.println("The aboslute value for " + i + " is: " + abs);
		input.close();
	}

}
