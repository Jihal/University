
public class RelationalOperations2 {

	public static void main(String[] args) {
		int x = 23; 
		int y = 23; 
		System.out.println("After initializing x to 23 and y to 23."); 
		System.out.println("x == y: " + (x == y)); // 23 == 23 (T)
		System.out.println("x < y: " + (x < y)); // 23 < 23 (F)
		System.out.println("x <= y: " + (x <= y)); // 23 <= 23 (T)
		System.out.println("x >= y: " + (x >= y)); // 23 >= 23 (T)
		System.out.println("x > y: " + (x > y)); // 23 > 23 (F)
		x = 56; 
		y = 89; 
		System.out.println("After initializing x to 56 and y to 89."); 
		System.out.println("x == y: " + (x == y)); // 56 == 89 (F)
		System.out.println("x < y: " + (x < y)); // 56 < 89 (T)
		System.out.println("x <= y: " + (x <= y)); // 56 <= 89 (T)
		System.out.println("x >= y: " + (x >= y)); // 56 >= 89 (F)
		System.out.println("x > y: " + (x > y)); // 56 > 89 (F)
		x = 101; 
		y = 48; 
		System.out.println("After initializing x to 101 and y to 48."); 
		System.out.println("x == y: " + (x == y)); // 101 == 48 (F)
		System.out.println("x < y: " + (x < y)); // 101 < 48 (F)
		System.out.println("x <= y: " + (x <= y)); // 101 <= 48 (F)
		System.out.println("x >= y: " + (x >= y)); // 101 >= 48 (T)
		System.out.println("x > y: " + (x > y)); // 101 > 48 (T)


	}

}
