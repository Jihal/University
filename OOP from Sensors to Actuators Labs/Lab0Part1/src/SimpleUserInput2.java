import java.util.Scanner;

public class SimpleUserInput2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st number (which can contain a decimal)");
		double n1 = input.nextDouble(); // if 3 is read, it's treated as 3.0
		input.nextLine(); //necessary
		 
		System.out.println("Enter the 2nd number (which can contain a decimal)");
		double n2 = input.nextDouble(); // if 3 is read, it's treated as 3.0
		input.nextLine(); //necessary
		
		System.out.println("What's your name: ");
		String name = input.nextLine();
		
		double average = (n1 + n2) / 2;
		
		System.out.print(name + ", ");
		System.out.print("the numbers you entered were " + n1 + " and " + n2 + ", and ");
		System.out.println("their average is " + average);
		
		input.close();
		
	}

}
