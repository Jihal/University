import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		
		while(cont) {
			int task = 0;
			while(!(task==1 || task==2 || task==3)) {
				System.out.println("What kind of processing task would you like to perform?");
				System.out.println("1: Generate an arithmetic sequence.");
				System.out.println("2: Generate an geometric sequence.");
				System.out.println("3: Determine an arithmetic sequence.");
				task = input.nextInt();
				input.nextLine();
				if(!(task==1 || task==2 || task==3)) {
					System.out.println("Error: task number must be 1, 2, or 3.");
				}
			}
			if(task == 1) {
				System.out.println("Enter the first term in the arithmetic sequence:");
				int first = input.nextInt();
				input.nextLine();
				System.out.println("Enter the common difference in the arithmetic sequence:");
				int comDiff = input.nextInt();
				input.nextLine();
				System.out.println("Enter the number of terms in the arithmetic sequence:");
				int terms = input.nextInt();
				input.nextLine();
				
				int[] seq = new int[terms];
				seq[0] = first;
				for(int i = 1; i < terms; i++) {
					seq[i] = seq[i-1] + comDiff;
				}
				System.out.print("<");
				for(int i = 0; i<seq.length-1; i++) {
					System.out.print(seq[i]+", ");
				}
				System.out.print(seq[seq.length-1]);
				System.out.println(">");
				int sum = 0;
				for(int i = 0; i<seq.length; i++) {
					sum = sum+seq[i];
				}
				System.out.println("Sum of the arithmetic sequence: " + sum);
				
				System.out.println("Would you like to process another sequence? (Y/N)");
				String res = input.nextLine();
				if(res.equals("N")) {
					cont = false; 
					System.out.println("Bye!");
				}
			}
			else if(task == 2) {
				System.out.println("Enter the first term in the geometric sequence:");
				int first = input.nextInt();
				input.nextLine();
				System.out.println("Enter the common ratio in the geometric sequence:");
				int comRat = input.nextInt();
				input.nextLine();
				System.out.println("Enter the number of terms in the geometric sequence:");
				int terms = input.nextInt();
				input.nextLine();
				
				int[] seq = new int[terms];
				seq[0] = first;
				for(int i = 1; i < terms; i++) {
					seq[i] = seq[i-1]*comRat;
				}
				System.out.print("<");
				for(int i = 0; i<seq.length-1; i++) {
					System.out.print(seq[i]+", ");
				}
				System.out.print(seq[seq.length-1]);
				System.out.println(">");
				int sum = 0;
				for(int i = 0; i<seq.length; i++) {
					sum = sum+seq[i];
				}
				System.out.println("Sum of the geometric sequence: " + sum);
				
				System.out.println("Would you like to process another sequence? (Y/N)");
				String res = input.nextLine();
				if(res.equals("N")) {
					cont = false; 
					System.out.println("Bye!");
				}
			}
			else if(task == 3) {
				boolean seqDone = true;
				int[] tempSeq = new int[10];
				int term = -1;
				while(seqDone) {
					term+=1;
					if(term>=0 && term<10) {
						System.out.println("Enter a new number:");
						tempSeq[term] = input.nextInt();
						input.nextLine();
						if(term!=9) {
							System.out.println("You have entered " + (term+1) + " numbers.");
							System.out.println("You may still enter another "+ (10-term-1) + " numbers.");
							System.out.println("Would you like to enter another new number? (Y/N)");
							String res = input.nextLine();
							if(res.equals("N")) {
								seqDone = false;
								if(term == 0) {
									System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
								}
							}
						}
					}
					else {
						System.out.println("You have entered the maximum number of numbers!");
						System.out.println("We will start processing your sequence right away.");
						seqDone = false;
					}
				}
				if(term == 0) {
					System.out.println("Would you like to process another sequence? (Y/N)");
					String res = input.nextLine();
					if(res.equals("N")) {
						cont = false; 
						System.out.println("Bye!");
					}
				}
				else {
					boolean isArithmetic = true;
					if(term<10) {
						int[] seq = new int[term+1];
						for(int i = 0; i < term+1; i++) {
							seq[i] = tempSeq[i];
						}
						int[] diffChecker = new int[term];
						for(int i = 0; i < term; i++) {
							diffChecker[i] = seq[i+1] - seq[i];
						}
						for(int i = 0; i < diffChecker.length-1; i++) {
							if(!(diffChecker[i] == diffChecker[i+1])) {
								isArithmetic = false;
							}
						}
						if(isArithmetic) {
							int sum = 0;
							for(int i = 0; i<seq.length; i++) {
								sum = sum+seq[i];
							}
							System.out.print("<");
							for(int i = 0; i<seq.length-1; i++) {
								System.out.print(seq[i]+", ");
							}
							System.out.print(seq[seq.length-1]);
							System.out.println("> is an arithmetic sequence with");
							System.out.println("first term " + seq[0] + ", common difference " + diffChecker[0] + ", length " + seq.length + ", and sum " + sum);
							System.out.println("Would you like to process another sequence? (Y/N)");
							String res = input.nextLine();
							if(res.equals("N")) {
								cont = false; 
								System.out.println("Bye!");
							}
						}
						else {
							System.out.print("<");
							for(int i = 0; i<seq.length-1; i++) {
								System.out.print(seq[i]+", ");
							}
							System.out.print(seq[seq.length-1]);
							System.out.println("> is not an arithmetic sequence");
							System.out.println("Would you like to process another sequence? (Y/N)");
							String res = input.nextLine();
							if(res.equals("N")) {
								cont = false; 
								System.out.println("Bye!");
							}
						}
					}
					else {
						int[] seq = new int[term];
						for(int i = 0; i < term; i++) {
							seq[i] = tempSeq[i];
						}
						int[] diffChecker = new int[term-1];
						for(int i = 0; i < term-1; i++) {
							diffChecker[i] = seq[i+1] - seq[i];
						}
						for(int i = 0; i < diffChecker.length-1; i++) {
							if(!(diffChecker[i] == diffChecker[i+1])) {
								isArithmetic = false;
							}
						}
						if(isArithmetic) {
							int sum = 0;
							for(int i = 0; i<seq.length; i++) {
								sum = sum+seq[i];
							}
							System.out.print("<");
							for(int i = 0; i<seq.length-1; i++) {
								System.out.print(seq[i]+", ");
							}
							System.out.print(seq[seq.length-1]);
							System.out.println("> is an arithmetic sequence with");
							System.out.println("first term " + seq[0] + ", common difference " + diffChecker[0] + ", length " + seq.length + ", and sum " + sum);
							System.out.println("Would you like to process another sequence? (Y/N)");
							String res = input.nextLine();
							if(res.equals("N")) {
								cont = false; 
								System.out.println("Bye!");
							}
						}
						else {
							System.out.print("<");
							for(int i = 0; i<seq.length-1; i++) {
								System.out.print(seq[i]+", ");
							}
							System.out.print(seq[seq.length-1]);
							System.out.println("> is not an arithmetic sequence");
							System.out.println("Would you like to process another sequence? (Y/N)");
							String res = input.nextLine();
							if(res.equals("N")) {
								cont = false; 
								System.out.println("Bye!");
							}
						}
					}
				}
			}
		}
		input.close();
	}

}
