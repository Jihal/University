import java.util.Scanner;

public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean c = true;
		while(c) {
			System.out.println("Enter a lower bound:");
			int lower = input.nextInt();
			input.nextLine();
			System.out.println("Enter a upper bound:");
			int upper = input.nextInt();
			input.nextLine();
			System.out.println("Enter a middle number:");
			int middle = input.nextInt();
			input.nextLine();
			if(lower>upper) {
				System.out.println("Error: lower bound "+lower+" is not less than or equal to the upper bound "+upper);
				boolean c2 = true;
				while(c2) {
				System.out.println("Would you like to continue printing? (Y/N)");
				String check = input.nextLine();
				if (!(check.equals("Y")) && !(check.equals("N"))) {
					System.out.println("Error: " + check + " is not valid");
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
			else if(lower>middle || middle>upper) {
				System.out.println("Error: middle number "+middle+" is not in-between the lower bound "+lower+" and upper bound "+upper);
				boolean c2 = true;
				while(c2) {
				System.out.println("Would you like to continue printing? (Y/N)");
				String check = input.nextLine();
				if (!(check.equals("Y")) && !(check.equals("N"))) {
					System.out.println("Error: " + check + " is not valid");
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
				System.out.println("Odd numbers between "+lower+" and "+middle+":");
				
				for(int i=lower; i<=middle;i++) {
					if((i%2)!=0) {
						System.out.println(i);
					}
				}
				System.out.println("Even numbers between "+middle+" and "+upper+":");
				for(int i=middle; i<=upper;i++) {
					if((i%2)==0) {
						System.out.println(i);
					}
				}
				boolean c2 = true;
				while(c2) {
				System.out.println("Would you like to continue printing? (Y/N)");
				String check = input.nextLine();
				if (!(check.equals("Y")) && !(check.equals("N"))) {
					System.out.println("Error: " + check + " is not valid");
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
