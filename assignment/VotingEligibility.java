package assignment;
import java.util.Scanner;

public class VotingEligibility {
	private boolean citizen;
	private int age;

	Scanner sc = new Scanner(System.in);

	void set() {
		System.out.println("Enter the citizen and age");
		String checkcitizen = sc.next();
		citizen = checkcitizen.equals("india");
		age = sc.nextInt();

	}

	void check() {
		if (citizen && age >= 18) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
	}

	public static void main(String[] args) {
		VotingEligibility v = new VotingEligibility();
		v.set();
		v.check();

	}

}



