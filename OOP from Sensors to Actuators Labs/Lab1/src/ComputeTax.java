import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.nextLine();
		System.out.println(name+", enter your filing status (1 - Single Filing; 2 - Married Filing):");
		int filing = input.nextInt();
		input.nextLine();
		
		if(filing == 1 || filing == 2) {
			System.out.println("Jim, enter your taxable income:");
			double amt = input.nextDouble();
			if(filing == 1) {
				double t1 = 0.1*8350;
				System.out.println("Calculation is based on the scheme of Single Filing:");
				if(amt <= 8350) {
					t1 = amt*0.1;
					System.out.println(name+", you should pay $"+t1);
					System.out.println("Part I: $"+t1);
				}
				else if (amt>8350 && amt<=33950) {
					double amt2 = amt - 8350;
					double t2 = amt2*0.15;
					double pay = t1+t2;
					System.out.println(name+", you should pay $"+pay);
					System.out.println("Part I: $"+t1);
					System.out.println("Part II: $"+t2);
				}
				else if (amt>33950) {
					double amt2 = 33950 - 8350;
					double t2 = amt2*0.15;
					double amt3 = amt-33950;
					double t3 = amt3*0.25;
					double pay = t1+t2+t3;
					System.out.println(name+", you should pay $"+pay);
					System.out.println("Part I: $"+t1);
					System.out.println("Part II: $"+t2);
					System.out.println("Part III: $"+t3);

				}
				
			}
			if(filing == 2) {
				System.out.println("Calculation is based on the scheme of Married Filing:");
				double t1 = 0.1*16700;
				System.out.println("Calculation is based on the scheme of Single Filing:");
				if(amt <= 16700) {
					t1 = 0.1*amt;
					System.out.println(name+", you should pay $"+t1);
					System.out.println("Part I: $"+t1);
				}
				else if (amt>16700 && amt<=67900) {
					double amt2 = amt - 16700;
					double t2 = amt2*0.15;
					double pay = t1+t2;
					System.out.println(name+", you should pay $"+pay);
					System.out.println("Part I: $"+t1);
					System.out.println("Part II: $"+t2);
				}
				else if (amt>67900) {
					double amt2 = 67900 - 16701;
					double t2 = amt2*0.15;
					double amt3 = amt-67900;
					double t3 = amt3*0.25;
					double pay = t1+t2+t3;
					System.out.println(name+", you should pay $"+pay);
					System.out.println("Part I: $"+t1);
					System.out.println("Part II: $"+t2);
					System.out.println("Part III: $"+t3);

			}
		}
	}
		else {
			System.out.println("Illegal status: "+filing);
		}
		input.close();
}

}
