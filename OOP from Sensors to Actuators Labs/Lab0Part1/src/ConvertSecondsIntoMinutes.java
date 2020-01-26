import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int fullMinutes = seconds/60;
		int remainingTime = seconds - (fullMinutes*60);
		
		System.out.println(name + ", your input " + seconds + " can be divded into " + fullMinutes + " minutes and " + remainingTime + " seconds.");
		
		input.close();		
	}

}
