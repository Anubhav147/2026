package mathAndNumberLogic;

import java.util.Scanner;

public class AmountCheck {

	public static void main(String[] args) {
		// Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter you number : ");
		int n = sc.nextInt();
		
		int a = Math.abs(n);
		
		if(a<100) {
			System.out.println("Enter a greater no");
		}else if(a%100 ==0) {
			System.out.println("Yes It is");
			int num = a;
			int num2000 = num/2000;
			num = num%2000;
			
			int num500 = num/500;
			num = num%500;
			
			int num100 =num/100;
			
			System.out.println("2000 notes are : " + num2000);
			System.out.println("500 notes are : " + num500);
			System.out.println("100 notes are : " + num100);
			
		}else {
		System.out.println("Not Possible");
		}
		
		//4100/2000
		sc.close();

	}

}
