package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		// Take three sides and check if they form a valid triangle.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of triangle : ");
		int s1 = sc.nextInt();
		System.out.println("Enter the second side of triangle : ");
		int s2 = sc.nextInt();
		System.out.println("Enter the third side of triangle : ");
		int s3= sc.nextInt();
		
		if(s1+s2+s3 == 180) {
			System.out.println("Its a valid triangle");
		}else {
			System.out.println("Not a valid triangle");
		}
		
		sc.close();
	}

}
