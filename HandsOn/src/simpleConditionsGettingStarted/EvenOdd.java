package simpleConditionsGettingStarted;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	//	Check if a number is even or odd.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		
		if(n%2==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		
		sc.close();
		
		
	}

}
