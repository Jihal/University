
public class IntegerArray3b {

	public static void main(String[] args) {
		int[] ia = new int[5];
		
		for(int i = 0; i <= 4; i++) {
			ia[i] = 7 + i*3;
		}
		
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of ia at index " + i + " is: " + ia[i]);
		}
	}

}
