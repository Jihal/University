import java.util.Scanner;

public class StringArrayApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many people do you want to greet?");
		int howMany = input.nextInt();
		input.nextLine();
		
		String[] names = new String[howMany];
		
		for(int i = 0; i < howMany; i++) {
			System.out.println("Enter name " + (i + 1) + ":");
			String name = input.nextLine();
			names[i] = name;
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Hello " + names[i] + "!");
		}
		input.close();
	}

}
