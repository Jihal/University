import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of player 1:");
		String name1 = input.nextLine();
		System.out.println("Enter the name of player 2:");
		String name2 = input.nextLine();
		
		int p1w = 0;
		int p2w = 0;
		
	    System.out.println("========");
	    System.out.println("Round 1:");
	    System.out.println("========");
	    System.out.println("What does "+name1+" play? (R, P, or S)");
	    String p1 = input.nextLine();
	    System.out.println("What does "+name2+" play? (R, P, or S)");
	    String p2 = input.nextLine();
		if(p1.equals("R")) {
			if(p2.equals("P")) {
				p2w++;
			}
			else if(p2.equals("S")) {
				p1w++;
			}
		}
		if(p1.equals("P")) {
			if(p2.equals("S")) {
				p2w++;
			}
			else if(p2.equals("R")) {
				p1w++;
			}
		}
		if(p1.equals("S")) {
			if(p2.equals("R")) {
				p2w++;
			}
			else if(p2.equals("P")) {
				p1w++;
			}
		}
	    System.out.println("========");
	    System.out.println("Round 2:");
	    System.out.println("========");
	    System.out.println("What does "+name1+" play? (R, P, or S)");
	    p1 = input.nextLine();
	    System.out.println("What does "+name2+" play? (R, P, or S)");
	    p2 = input.nextLine();
		if(p1.equals("R")) {
			if(p2.equals("P")) {
				p2w++;
			}
			else if(p2.equals("S")) {
				p1w++;
			}
		}
		if(p1.equals("P")) {
			if(p2.equals("S")) {
				p2w++;
			}
			else if(p2.equals("R")) {
				p1w++;
			}
		}
		if(p1.equals("S")) {
			if(p2.equals("R")) {
				p2w++;
			}
			else if(p2.equals("P")) {
				p1w++;
			}
		}
		if(p1w > p2w) {
			System.out.println("Game over: "+name1+" wins!");
		}
		else if (p2w > p1w) {
			System.out.println("Game over: "+name2+" wins!");
		}
		else {
			 	System.out.println("========");
			    System.out.println("Round 3:");
			    System.out.println("========");
			    System.out.println("What does "+name1+" play? (R, P, or S)");
			    p1 = input.nextLine();
			    System.out.println("What does "+name2+" play? (R, P, or S)");
			    p2 = input.nextLine();
				if(p1.equals("R")) {
					if(p2.equals("P")) {
						p2w++;
					}
					else if(p2.equals("S")) {
						p1w++;
					}
				}
				if(p1.equals("P")) {
					if(p2.equals("S")) {
						p2w++;
					}
					else if(p2.equals("R")) {
						p1w++;
					}
				}
				if(p1.equals("S")) {
					if(p2.equals("R")) {
						p2w++;
					}
					else if(p2.equals("P")) {
						p1w++;
					}
				}
				if(p1w > p2w) {
					System.out.println("Game over: "+name1+" wins!");
				}
				else if (p2w > p1w){
					System.out.println("Game over: "+name2+" wins!");
				}	
				else if (p2w == p1w) {
					System.out.println("Game over: a tie between "+name1+" and "+name2);
				}
		}
		input.close();
	}

}
