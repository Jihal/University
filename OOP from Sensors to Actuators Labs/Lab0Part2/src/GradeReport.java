import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println(name + ", what is your score for Quiz 1 (out of 100)?");
		int q1 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 2 (out of 100)?");
		int q2 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 3 (out of 100)?");
		int q3 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 4 (out of 100)?");
		int q4 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 5 (out of 100)?");
		int q5 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 6 (out of 100)?");
		int q6 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 7 (out of 100)?");
		int q7 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 8 (out of 100)?");
		int q8 = input.nextInt();
		System.out.println(name + ", what is your score for Quiz 9 (out of 100)?");
		int q9 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 1 (out of 100)?");
		int a1 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 2 (out of 100)?");
		int a2 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 3 (out of 100)?");
		int a3 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 4 (out of 100)?");
		int a4 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 5 (out of 100)?");
		int a5 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 6 (out of 100)?");
		int a6 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 7 (out of 100)?");
		int a7 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 8 (out of 100)?");
		int a8 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 9 (out of 100)?");
		int a9 = input.nextInt();
		System.out.println(name + ", what is your score for Assignment 10 (out of 100)?");
		int a10 = input.nextInt();
		
		System.out.println(name + ", what is your score for Lab Test 1 (out of 100)?");
		int l1 = input.nextInt();
		System.out.println(name + ", what is your score for Lab Test 2 (out of 100)?");
		int l2 = input.nextInt();
		System.out.println(name + ", what is your score for Lab Test 3 (out of 100)?");
		int l3 = input.nextInt();
		
		System.out.println(name + ", what is your midterm score (out of 100)?");
		int m1 = input.nextInt();
		System.out.println(name + ", what is your final exam score (out of 100)?");
		int f1 = input.nextInt();
		input.nextLine();
		
		System.out.println(name + ", which course are you talking about?");
		String course = input.nextLine();
		
		double quizavg = (q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9)/9;
		double assignavg = (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10)/10;
		double labavg = (l1 + l2 + l3)/3;
		double finalavg = (quizavg*0.18 + assignavg*0.20 + labavg*0.12 + m1*0.15 + f1*0.35);

		
		System.out.println(name + ", here is your grade report for " + course + ":");
		System.out.println("-----------------------------------------");
		System.out.println("Quiz 1: " + q1);
		System.out.println("Quiz 2: " + q2);
		System.out.println("Quiz 3: " + q3);
		System.out.println("Quiz 4: " + q4);
		System.out.println("Quiz 5: " + q5);
		System.out.println("Quiz 6: " + q6);
		System.out.println("Quiz 7: " + q7);
		System.out.println("Quiz 8: " + q8);
		System.out.println("Quiz 9: " + q9);
		System.out.println("-----------------------------------------");
		System.out.println("Assignment 1: " + a1);
		System.out.println("Assignment 2: " + a2);
		System.out.println("Assignment 3: " + a3);
		System.out.println("Assignment 4: " + a4);
		System.out.println("Assignment 5: " + a5);
		System.out.println("Assignment 6: " + a6);
		System.out.println("Assignment 7: " + a7);
		System.out.println("Assignment 8: " + a8);
		System.out.println("Assignment 9: " + a9);
		System.out.println("Assignment 10: " + a10);
		System.out.println("-----------------------------------------");
		System.out.println("Lab Test 1: " + l1);
		System.out.println("Lab Test 2: " + l2);
		System.out.println("Lab Test 3: " + l3);
		System.out.println("-----------------------------------------");
		System.out.println("Midterm Test: " + m1);
		System.out.println("Final Exam: " + f1);
		System.out.println("-----------------------------------------");
		System.out.println("Average of quizzes: " + quizavg);
		System.out.println("Average of assignments: " + assignavg);
		System.out.println("Average of lab tests: " + labavg);
		System.out.println("Final raw marks: " + finalavg);
		
		input.close();

	}

}
