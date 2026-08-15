package mathAndNumberLogic;

import java.util.Scanner;

public class SevenCheck {

	public static void main(String[] args) {
		// Check if a number is a multiple of 7 or ends with 7.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Digit : ");
		int y = sc.nextInt();
		int x= Math.abs(y);
		
		if(x%7==0 || x%10==7) {
			System.out.println(" multiple of 7 or ends with 7");
		}else {
			System.out.println("not part of 7 series");
		}
		
		sc.close();

	}

}
