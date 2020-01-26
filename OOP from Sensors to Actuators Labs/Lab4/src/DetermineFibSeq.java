import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		while(cont) {
			boolean ask = true;
			int counter = 0;
			int[] inputSeq = new int[20];
			while(ask) {
				System.out.println("Enter a positive integer value, or -1 to stop");
				inputSeq[counter] = input.nextInt();
				input.nextLine();
				if(inputSeq[counter]==-1) {
					ask = false;
				}
				counter++;
			}
			int[] newSeq = new int[counter-1];
			int[] fibSeq = new int[counter-1];
			for(int i = 0; i < counter-1; i++) {
				newSeq[i] = inputSeq[i];
			}
			for(int i=0; i<fibSeq.length; i++) {
				if(i==0 || i==1) {
					fibSeq[i] = 1;
				}
				else {
					fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
				}
			}
			boolean equals = true;
			for(int i=0; i<newSeq.length; i++) {
				if(!(newSeq[i]==fibSeq[i])) {
					equals = false;
				}
			}
			if(equals) {
				System.out.print("The sequence you entered <");
				for(int i = 0; i < newSeq.length-1; i++) {
					System.out.print(newSeq[i] + ", ");
				}
				System.out.println(newSeq[newSeq.length-1] + ">");
				System.out.println("   is the first "+(newSeq.length)+" numbers in the Fibonacci sequence.");
			}
			else {
				System.out.print("The sequence you entered <");
				for(int i = 0; i < newSeq.length-1; i++) {
					System.out.print(newSeq[i] + ", ");
				}
				System.out.println(newSeq[newSeq.length-1] + ">");
				System.out.println("   is not the first "+(newSeq.length)+" numbers in the Fibonacci sequence.");
			}
			System.out.println("Would you like to try another sequence? (Y/N)");
			String res = input.nextLine();
			if(res.equals("N")) {
				cont = false;
			}
		}
		System.out.println("Bye!");
		input.close();
	}

}
