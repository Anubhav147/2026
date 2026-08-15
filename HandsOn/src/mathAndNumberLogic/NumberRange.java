package mathAndNumberLogic;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		// Check if a number lies within the range [100, 999].

Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
       

        // 1. Fixed validation upper boundary from 1000 to 999
        if (num >= 100 && num <= 999) {
        System.out.println("in range");    
        } else {
            	System.out.println("Not in range");
        	
        }
        sc.close();
	}

}
