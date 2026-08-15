package simpleConditionsGettingStarted;

import java.util.Scanner;

public class TemperatureValue {

	public static void main(String[] args) {
		// Take a temperature value and print “Cold”
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temp : ");
		double a= sc.nextDouble();
		
		if(a>16) {
			System.out.println("It's Hot");
		}else {
			System.out.println("Cold");
		}
		
		sc.close();

	}

}
