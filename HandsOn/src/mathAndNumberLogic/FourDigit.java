package mathAndNumberLogic;

import java.util.Scanner;

public class FourDigit {
	public static void main(String[] args) {
		//Take a 4-digit number and check if the first and last digits are equal.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit : ");
		int a = sc.nextInt();
		
		if(a<=999 || a>=10000) {
		System.out.println("No is not in range");	
		}else {
			int first = a/1000;
			int last=a%10;
			System.out.println(first);
			System.out.println(last);
			if(first==last) {
				System.out.println("both are same");
			}else {
				System.out.println("Not Same");
			}
		}
		sc.close();
		
	}
}
