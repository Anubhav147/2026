package simpleConditionsGettingStarted;

import java.util.Scanner;

public class largestInThree {

	public static void main(String[] args) {
		// Take three numbers and print the largest.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a= sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b= sc.nextInt();
		System.out.println("Enter the Third number : ");
		int c= sc.nextInt();

		if(a>b && a>c) {
			System.out.println("First no is larger");
		}else if(b>a && b>c){
			System.out.println("Second no is larger");
		}else if(c>a && c>b){
			System.out.println("Third no is larger");
		}else {
			System.out.println("All equal");
		}
		
		sc.close();
	}

}
