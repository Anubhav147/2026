package javaBasicPrograms;

import java.util.Scanner;

public class OddEvenNumber {
	
	
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a =sc.nextInt();
		System.out.println("Number is " + a);
		System.out.println("checking Number");
		
		if(a%2==0) {
			System.out.println("no is even");
		}else {
			System.out.println("number is odd");
		}
		
		
		
		
	       sc.close();
	}

}
