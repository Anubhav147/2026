package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class MultiplyOfEach {

	public static void main(String[] args) {
		// check if one of two given numbers is a multiple of the other
		
		Scanner sc=  new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the first number : ");
		int n1 =sc.nextInt();
		System.out.print("Enter the second number : ");
		int n2 =sc.nextInt();
		
		// Prevent division-by-zero crash
        if (n1 == 0 || n2 == 0) {
            System.out.println("Error: Numbers cannot be zero.");
        } 
		
		if(n1%n2==0 || n2%n1==0) {
			System.out.println("no. is multiple of each other");
		}else {
			System.out.println("Not a multiple");
		}
			
			sc.close();

	}

}
