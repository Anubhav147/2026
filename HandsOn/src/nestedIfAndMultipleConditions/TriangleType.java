package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		/*
		 * if the sides form a valid triangle, 
		 * determine whether it is equilateral, 
		 * isosceles, or scalane.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of triangle : ");
		int s1 = sc.nextInt();
		System.out.println("Enter the second side of triangle : ");
		int s2 = sc.nextInt();
		System.out.println("Enter the third side of triangle : ");
		int s3= sc.nextInt();
		
		if(s1+s2+s3 == 180) {
			if(s1==s2 || s2== s3) {
				System.out.println(" It's a equilateral triangle");
			}else if(s1+s2 ==90 || s2+s3 ==90 ||s1+ s3 ==90){
				System.out.println(" It's a isosceles triangle");
			}else {
				System.out.println(" It's a scalane triangle");
			}
		}else {
			System.out.println("Not a valid triangle");
		}
		
		sc.close();
	}

}
