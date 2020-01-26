import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		while(cont) {
			System.out.println("Enter the size of Fibonacci Sequence: ");
			int size = input.nextInt();
			input.nextLine();
			int[] seq = new int[size];
			if(size==0) {
				System.out.println("Error: Fibonacci Sequence must have size >= 1.");
				System.out.println("Would you like to continue? (Y/N)");
				String res = input.nextLine();
				if(res.equals("N")) {
					cont = false;
				}
			}
			else if(size==1) {
				System.out.println("Fibonacci Sequence of size 1:");
				System.out.println("<1>");
				System.out.println("Would you like to continue? (Y/N)");
				String res = input.nextLine();
				if(res.equals("N")) {
					cont = false;
				}
			}
			else if(size==2) {
				System.out.println("Fibonacci Sequence of size 2:");
				System.out.println("<1, 1>");
				System.out.println("Would you like to continue? (Y/N)");
				String res = input.nextLine();
				if(res.equals("N")) {
					cont = false;
				}
			}
			else if(size>2) {
				System.out.println("Fibonacci Sequence of size "+size+":");
				System.out.print("<1, 1, ");
				seq[0] = 1;
				seq[1] = 1;
				for(int i = 2; i < size-1; i++) {
					seq[i] = seq[i-1]+seq[i-2];
					System.out.print(seq[i]+", ");
				}
				seq[size-1] = seq[size-2] + seq[size-3];
				System.out.println(seq[size-1] + ">");
				System.out.println("Would you like to continue? (Y/N)");
				String res = input.nextLine();
				if(res.equals("N")) {
					cont = false;
				}
			}
		}
		System.out.println("Bye!");
		input.close();
	}

}
