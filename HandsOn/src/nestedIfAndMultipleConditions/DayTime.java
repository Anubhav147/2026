package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class DayTime {

	public static void main(String[] args) {
		/*
		 *  Take the hour of the day (0–23) and
		 *   print “Good Morning”, “Good Afternoon”, 
		 *   “GoodEvening”, or “Good Night”.
		 *   
		 */

		Scanner sc=  new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the time : ");
		double n =sc.nextDouble();
		
		if (n < 0 || n >= 24) {
		System.out.println("Enter a valid time");
		}
		
		if(n>=4 && n<=11) {
			System.out.println(" Good Morning !!");
		}else if(n>=11 && n<=20) {
			System.out.println(" Good Afternoon !!");
		} else if (n >= 17 && n < 22) {
            System.out.println("Good Evening !!");
        } else {
			System.out.println(" Good Night !!");
		}
		sc.close();
		
	}

}
