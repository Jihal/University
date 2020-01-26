import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Enter integer " + i + ":");
			int x = input.nextInt();
			total += x;
		}
		
		double average = ((double) total)/5;
		System.out.println("Average is " + average);
		input.close();
	}

}
