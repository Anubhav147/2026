package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		/* Take a month number (1–12) and print
		 *  the number of days in that month (ignore leap years).
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the Month : ");
		String n = sc.next().toLowerCase(); // Converts input to lowercase to prevent bugs

        switch (n) {
            case "january", "march", "may", "july", "august", "october", "december":
                System.out.println("Days: 31");
                break;
            case "april", "june", "september", "november":
                System.out.println("Days: 30");
                break;
            case "february": 
                System.out.println("Days: 28");
                break;
            default:
                System.out.println("Not a valid Month name");
        }
        
        sc.close();
    }
}