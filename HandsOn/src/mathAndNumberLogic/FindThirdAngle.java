package mathAndNumberLogic;

import java.util.Scanner;

public class FindThirdAngle {

	public static void main(String[] args) {
		// Take two angles of a triangle and compute the third angle.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of triangle : ");
		int a1 = sc.nextInt();
		System.out.println("Enter the second side of triangle : ");
		int a2 = sc.nextInt();
		
		// Validate that both input angles are physically possible
        if (a1 <= 0 || a2 <= 0) {
            System.out.println("Error: Angles must be greater than 0 degrees.");
        } else if (a1 + a2 >= 180) {
            System.out.println("Error: The sum of two angles must be strictly less than 180 degrees.");
        } else {
            // Compute the third angle
            int a3 = 180 - (a1 + a2);
            System.out.println("The third angle is: " + a3 + " degrees.");
        }

        sc.close();
    }
}