import java.util.Scanner;

public class PrintBetweenNumbers3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean c = true;
		
		
		while(c==true) {
			System.out.println("Enter a lower bound:");
			int lower = input.nextInt();
			input.nextLine();
			System.out.println("Enter an upper bound:");
			int upper = input.nextInt();
			input.nextLine();
			
			if(lower>upper) {
				System.out.println("Error: lower bound "+lower+" is not less than or equal to the upper bound " + upper+".");
				boolean c2 = true;
				while(c2) {
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				String check = input.nextLine();
				if (!(check.equals("Y")) && !(check.equals("N"))) {
					System.out.println("Invalid indication on continuation: " + check);
				}
				if(check.equals("Y")||check.equals("N")) {
					c2 = false;
					if(check.equals("N")){
						System.out.println("Bye!");
						c = false;
					}
				}
				}
				
			}
			else {
				System.out.println("Numbers between "+lower+" and "+upper+":");
				for(int i=lower; i<=upper; i++) {
					System.out.println(i);
				}
				boolean c2 = true;
				while(c2) {
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				String check = input.nextLine();
				if (!(check.equals("Y")) && !(check.equals("N"))) {
					System.out.println("Invalid indication on continuation: " + check);
				}
				if(check.equals("Y")||check.equals("N")) {
					c2 = false;
					if(check.equals("N")){
						System.out.println("Bye!");
						c = false;
					}
				}
			}
		}
	}
		input.close();
}

}
