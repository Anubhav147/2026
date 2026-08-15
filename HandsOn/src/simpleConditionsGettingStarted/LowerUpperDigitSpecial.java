package simpleConditionsGettingStarted;

import java.util.Scanner;

public class LowerUpperDigitSpecial {

	public static void main(String[] args) {
		/* 
		 * Take a character and check whether 
		 * it’s uppercase, lowercase, a digit, 
		 * or a special character.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Input Please"); 
		String s =sc.next();
		
		if(s.length() >1) {
			System.out.println("Enter only single Char only");
		}else {
			char ch = s.charAt(0);

            // Check character type using Character class helper methods
            if (Character.isUpperCase(ch)) {
                System.out.println("Result: '" + ch + "' is an Uppercase letter.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Result: '" + ch + "' is a Lowercase letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println("Result: '" + ch + "' is a Digit.");
            } else {
                // If it's none of the above, it's a special character (symbol, space, punctuation)
                System.out.println("Result: '" + ch + "' is a Special Character.");
            }

			
		}
		
		sc.close();
	}

}
