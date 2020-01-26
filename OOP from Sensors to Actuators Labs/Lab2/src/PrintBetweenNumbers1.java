import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a lower bound:");
		int lower = input.nextInt();
		System.out.println("Enter an upper bound:");
		int upper = input.nextInt();
		
		if(lower>upper) {
			System.out.println("Error: lower bound "+lower+" is not less than or equal to the upper bound " + upper+".");
			System.out.println("Bye!");
		}
		else {
			System.out.println("Numbers between "+lower+" and "+upper+":");
			for(int i=lower; i<=upper; i++) {
				System.out.println(i);
			}
			System.out.println("Bye!");
		}
		input.close();
	}

}
