package mathAndNumberLogic;

import java.util.Scanner;

public class QuadsCheck {

	public static void main(String[] args) {
		// Take coordinates (x, y) and determine which quadrant the point lies in.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Digit : ");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd Digit : ");
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("Its + +");
		}else if(x>0 && y<0) {
			System.out.println("Its + -");
		}else if(x<0 && y>0) {
			System.out.println("Its - +");
		}else if(x<0 && y<0) {
			System.out.println("Its - -");
		}else if (x == 0 && y == 0) {
            System.out.println("Origin (0, 0)");
        } else if (x == 0) {
            System.out.println("On the Y-Axis");
        } else {
            System.out.println("On the X-Axis");
        }
		
		sc.close();

	}

}
