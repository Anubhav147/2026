package mathAndNumberLogic;

import java.util.Scanner;

public class IntegerCheck {

	public static void main(String[] args) {
		// Check whether a given integer is single-digit, double-digit, or multi-digit.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = String.valueOf(Math.abs(n)).length();

		if (a == 1) {
			System.out.println("Single Digit");

		} else if (a == 2) {
			System.out.println("double digit");
		} else {
			System.out.println("Multidigit");
		}

		sc.close();
	}

}
