package simpleConditionsGettingStarted;

import java.util.Scanner;

public class largestInTwo {

	public static void main(String[] args) {
		// Take two numbers and print the larger one.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a= sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b= sc.nextInt();

		if(a>b) {
			System.out.println("First no is larger");
		}else if(b>a){
			System.out.println("Second no is larger");
		}else {
			System.out.println("Both are equal");
		}
		
		sc.close();
	}

}
