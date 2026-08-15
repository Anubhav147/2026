package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {

		/*
		 * Take an alphabet character and check if 
		 * it lies between ‘a’ and ‘m’ or ‘n’
		 * and ‘z’.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Char : ");
		String s = sc.next();
		
		if(s.length() != 1) {
			System.out.println("Enter a Valid Char");
		}
		
		char c = s.charAt(0);
		
		if (!Character.isLetter(c)) {
            System.out.println("Error: '" + c + "' is not a valid alphabet letter.");
        } else {
            // Convert to lowercase to make the range check case-insensitive
            char lowerC = Character.toLowerCase(c);

            // 3. Check ranges using relational operators
            if (lowerC >= 'a' && lowerC <= 'm') {
                System.out.println("Result: '" + c + "' lies between 'a' and 'm'.");
            } else if (lowerC >= 'n' && lowerC <= 'z') {
                System.out.println("Result: '" + c + "' lies between 'n' and 'z'.");
            }
        }
		 sc.close();
    }
    
}