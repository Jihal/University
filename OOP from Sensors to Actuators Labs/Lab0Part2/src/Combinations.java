import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st string: ");
		String s1 = input.next();
		System.out.println("Enter the 2nd string: ");
		String s2 = input.next();
		System.out.println("Enter the 3rd string: ");
		String s3 = input.next();
		System.out.println("Enter the 4th string: ");
		String s4 = input.next();
		
		System.out.println("Enter the 1st integer: ");
		int i1 = input.nextInt();
		System.out.println("Enter the 2nd integer: ");
		int i2 = input.nextInt();
		System.out.println("Enter the 3rd integer: ");
		int i3 = input.nextInt();
		System.out.println("Enter the 4th integer: ");
		int i4 = input.nextInt();
		
		System.out.println("Here are all 16 possible combinations:");
		System.out.println("("+s1+", "+i1+(")"));
		System.out.println("("+s1+", "+i2+(")"));
		System.out.println("("+s1+", "+i3+(")"));
		System.out.println("("+s1+", "+i4+(")"));
		System.out.println("("+s2+", "+i1+(")"));
		System.out.println("("+s2+", "+i2+(")"));
		System.out.println("("+s2+", "+i3+(")"));
		System.out.println("("+s2+", "+i4+(")"));
		System.out.println("("+s3+", "+i1+(")"));
		System.out.println("("+s3+", "+i2+(")"));
		System.out.println("("+s3+", "+i3+(")"));
		System.out.println("("+s3+", "+i4+(")"));
		System.out.println("("+s4+", "+i1+(")"));
		System.out.println("("+s4+", "+i2+(")"));
		System.out.println("("+s4+", "+i3+(")"));
		System.out.println("("+s4+", "+i4+(")"));
		
		input.close();

	}

}
