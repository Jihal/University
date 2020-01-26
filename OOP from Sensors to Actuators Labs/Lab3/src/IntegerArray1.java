
public class IntegerArray1 {

	public static void main(String[] args) {
		int[] ia = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		System.out.println("Size of the array \"ia\": "+ ia.length);
		System.out.println("First index of the array ia: " + 0);
		System.out.println("Last index of the array ia: " + (ia.length - 1));
		
		for(int i = 0; i < ia.length; i++) {
			System.out.println("Element of ia at index " + i + ": " + ia[i]);
		}
	}

}
