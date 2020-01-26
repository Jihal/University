
public class NumericalExpressions {

	public static void main(String[] args) {
		// 15 + 4 this is a comment that is not executed by the computer
		System.out.println(15 + 4); // 19
		// 15 - 4
		System.out.println(15 - 4); // 11
		// 15 * 4
		System.out.println(15 * 4); // 60
		// 15/ / 4: because both are integers, we will get the quotient
		System.out.println(15 / 4); // 3
		// 15 % 4: remainder
		System.out.println(15 % 4); //3
		
		// 23 / 4: because both are integers, we will get the quotient
		System.out.println(23 / 4); // 5
		// 23 % 4: remainder
		System.out.println(23 % 4); // 3
		
		//4 * (23 / 4) + (23 % 4) = 23
		System.out.println(4 * (23 / 4) + (23 % 4)); // 23
		
//		System.out.println("1" * "1"); // this is not correct
		System.out.println("1 + 1"); // output: 1 + 1
		System.out.println(1 + 1); // output: 2
		
		// 5.2 / 2
		System.out.println(5.2 / 2); // 2.6
		// 5 / 2.5
		System.out.println(5 / 2.5); // 2.0
	}

}
