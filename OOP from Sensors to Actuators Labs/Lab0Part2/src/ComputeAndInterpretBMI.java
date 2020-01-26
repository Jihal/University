import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your height in inches:");
		int heightIn = input.nextInt(); 

		System.out.println(name + ", enter your weight in pounds:");
		int weightP = input.nextInt(); 
		
		double heightM = heightIn*0.0254;
		double weightKg = weightP*0.45359237; 
		double BMI = weightKg/(heightM*heightM);
		
		System.out.println(name + ", your BMI is " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("You are underweight!");
		}
		else if (18.5 <= BMI && BMI < 25.0) {
			System.out.println("You are normal!");
		}
		else if (25.0 <= BMI && BMI < 30.0) {
			System.out.println("You are overweight!");
		}
		else if (30.0 <= BMI) {
			System.out.println("You are obese!");
		}
		
		input.close();
	}

}
