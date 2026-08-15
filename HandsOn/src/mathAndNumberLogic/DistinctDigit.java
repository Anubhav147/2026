package mathAndNumberLogic;

import java.util.Scanner;

public class DistinctDigit {

	public static void main(String[] args) {
		// Take a 3-digit number and check if all digits are distinct.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		// 1. Validate that the input is strictly a 3-digit number
        // Using Math.abs to handle negative 3-digit numbers cleanly
        int positiveNum = Math.abs(n);
        if (positiveNum < 100 || positiveNum > 999) {
            System.out.println("Error: Please enter a valid 3-digit number.");
        } else {
            // 2. Extract individual digits
            int hundreds = positiveNum / 100;       // Gets the first digit
            int tens = (positiveNum / 10) % 10;     // Gets the middle digit
            int units = positiveNum % 10;           // Gets the last digit

            // 3. Check if all digits are different from each other
            if (hundreds != tens && hundreds != units && tens != units) {
                System.out.println("Result: All digits are distinct.");
            } else {
                System.out.println("Result: Digits are not distinct (there are duplicates).");
            }
        }

        sc.close();
    }

}
