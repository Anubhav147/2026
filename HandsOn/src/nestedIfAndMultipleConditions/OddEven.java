package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		/*
		 * 
		 *  Take two numbers and determine whether both are even, 
		 *  both are odd, or one iseven and one is odd.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int s1 = sc.nextInt();
		System.out.println("Enter the second number ");
		int s2 = sc.nextInt();
		
		if(s1%2==0 && s2%2==0) {
			System.out.println("Both are Even");
		}else if(s1%2!=0 && s2%2!=0) {
			System.out.println("Both are Odd");
		}else {
			System.out.println("ODD EVEN HO GYA");
		}
		
		sc.close();

	}

}
