package simpleConditionsGettingStarted;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Check if a given year is a leap year.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int year= sc.nextInt();
		
		if(year%4==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a leap year");
		}
		
		sc.close();
		
		
	}

}
