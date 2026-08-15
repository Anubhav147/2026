package nestedIfAndMultipleConditions;

import java.util.Scanner;

public class GradeCheck {
	
	public static void main(String[] args) {
		/* 
		 * Take a number from (0–100) and print 
		 * the corresponding grade (A/B/C/D/F)
		 * 
		 */
		
		Scanner sc=  new Scanner(System.in);
		System.out.println();
		System.out.println(" Enter the number : ");
		int score =sc.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("Enter the valid no.");	
		}else {
			if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
			}
		}
		
		
		sc.close();
	}

}
