
public class StringVariables {

	public static void main(String[] args) {
		String firstName = "";
		String lastName = ""; 
		int i = 0;
		System.out.println("Preson " + i + ": " + lastName + ", " + firstName);
		
		firstName = "Heeyeon";
		lastName = "Kang";
		i = i + 1;
		System.out.println("Preson " + i + ": " + lastName + ", " + firstName);
		
		firstName = "Jihye";
		lastName = "Park";
		i = i + 1;
		System.out.println("Preson " + i + ": " + lastName + ", " + firstName);
		
		/*
		 * Remark:
		 * Lines 8, 13, and 18 are identical.
		 * However, at runtime, they produce different outputs to the console.
		 * This is because they depend on values of variables, which are changed
		 * at Lines 5 - 7, 10 - 12, and 15 - 17.
		 */
	}

}
