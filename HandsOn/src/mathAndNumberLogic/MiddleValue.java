package mathAndNumberLogic;

import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {

		// Take a 3-digit number and determine if the middle digit is the largest,
		// smallest, or neither.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int num = Math.abs(n);
		if (num < 100 || num > 1000) {
			System.out.println("Enter a valid number");
		} else {
			int first = num / 100;
			int middle = (num / 10) % 10;
			int last = num % 10;

			System.out.println("first : " + first);
			System.out.println("middle : " + middle);
			System.out.println("last : " + last);

			if (middle > first && middle > last) {
				System.out.println("Result: The middle digit is the Largest.");
			} else if (middle < first && middle < last) {
				System.out.println("Result: The middle digit is the Smallest.");
			} else {
				System.out.println("Result: The middle digit is Neither the largest nor the smallest.");
			}

		}
		sc.close();
	}

}
