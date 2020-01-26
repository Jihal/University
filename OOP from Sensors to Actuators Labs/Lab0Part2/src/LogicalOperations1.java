
public class LogicalOperations1 {

	public static void main(String[] args) {
		/*
		 * There are three logical operators for you to
		 * combine relational operations (each of which evaluating to true or false).
		 * 1. Logical negation (not) !
		 * 2. Logical conjunction (and) &&
		 * 3. Logical disjunction (or) ||
		 */
		boolean p = true;
		boolean negation = !p;
		System.out.println("Logical negation of p being " + p + " is: " + negation);
		p = false;
		negation = !p;
		System.out.println("Logical negation of p being " + p + " is: " + negation);
		
	}

}
