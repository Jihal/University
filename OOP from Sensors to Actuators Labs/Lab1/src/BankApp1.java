import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		/*
		 * Problem:
		 * 1. Prompt the user for an initial balance of their bank account.
		 * 		(0 < balance <= 1000)
		 * 2. Prompt the user for a transaction
		 * 		(transaction should be either "d" or "w"; otherwise it's invalid)
		 * 3. Prompt the user for an amount
		 * 		+ in the both cases: amount > 0
		 * 		+ in the case of withdraw: amount < balance
		 * 		+ in the case of deposit: balance + amount <= 1000
		 * 4. Perform the transaction accordingly and output the resulting balance to console.
		 * Note. As soon as an error occurs, your app should print out an error right away,
		 * 			and terminate the app.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		// ----------------------------
		/* Stage 1 */
		// ----------------------------
		System.out.println("Enter a balance (e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();
		
		if(0 < balance && balance<=1000) {
			//Valid amt
		}
		else {
			System.out.println("Error: initial balance "+ balance + " is not in (0, 1000].");
		}
		//Stage 2
		System.out.println("Enter a transaction type {\"d\" or \"w\"):");
		String type = input.nextLine();
		
		if(type.equals("d")) {
			//valid
		}
		else if(type.equals("w")) {
			//valid
		}
		else {
			System.out.println("Error: transaction type "+ type + " is neither d nor w");
		}
		//Stage 3
		System.out.println("Enter an amount for "+ type + ": ");
		double amount = input.nextDouble();
		input.nextLine();
		
		if(type.equals("d")) {
			if(amount<=0) {
				System.out.println("Error: deposit amount is not positive.");
			}
			else if (balance + amount > 1000) {
				System.out.println("Error: deposit amount is too large.");
			}
			else {
				balance += amount;
			}
		}
		else if(type.equals("w")) {
			if(amount <= 0) {
				System.out.println("Error: withdraw amount is not positive.");
			}
			else if(amount >= balance) {
				System.out.println("Error: withdraw amount is too large.");
			}
			else {
				balance -= amount;
			}
		}
		//Stage 4
		System.out.println("Resulting balance after performing transaction of " + type + "with $" + amount + ": "+ balance);
		input.close();
	}

}
