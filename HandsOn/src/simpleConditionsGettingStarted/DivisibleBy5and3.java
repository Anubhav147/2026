package simpleConditionsGettingStarted;

import java.util.Scanner;

public class DivisibleBy5and3 {

	public static void main(String[] args) {
		// Check if a number is divisible by both 3 and 5.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		
		if(n%5==0 && n%3==0) {
			System.out.println("Divisible by 5 and 3");
		}else {
			System.out.println("Not divisible by 5 and 3");
		}
		
		sc.close();
		
		
	}

}
