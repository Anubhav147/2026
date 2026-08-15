package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		// Check voting eligibility for a given age (18+).

		Scanner sc=  new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the Age : ");
		int n =sc.nextInt();
		if(n>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Minor");
		}
		
		sc.close();
		
	}

}
