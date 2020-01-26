
public class StringExpressions {

	public static void main(String[] args) {
		System.out.println("We have various attemps to calculate the average between 5 and 2.");
		
		System.out.print("5 + 2 / 2");
		System.out.print(" is ");
		System.out.println(5 + 2 / 2); // 3.5? No, 6
		
		System.out.println("(5 + 2)/ 2 is " + ((5 + 2) / 2)); // 3.5? No, 3
		System.out.println("(5 + 2)/ 2.0 is " + ((5 + 2) / 2.0)); // 3.5
		
		System.out.println("Lassonde School of Engineering");
		System.out.println("Lassonde" + " " + "School" + " " + "of " + "Engineering");
		
		System.out.println("Experiment with concatenating (1 + 1): " + (1 + 1));
		System.out.println("Experiment with concatenating 1 + 1: " + 1 + 1);
		
	}

}
