package javaBasicPrograms;

import java.util.Scanner;

public class Demo {

	
	
	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
//		int start = sc.nextInt();
//		System.out.println("Starting Number "+ start);
//		int end = sc.nextInt();
//		System.out.println("End Point is y "+ end);
//		
//		
//		boolean isPrime = true;
//		
//		if(n)
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Start number");
			int start = sc.nextInt();
			System.out.println("Starting Number "+ start);
			System.out.println("Enter the End number");
			int end = sc.nextInt();
			System.out.println("End Point is  "+ end);
			
			boolean isPrime = true;
			
//			if(n<=1) {
//				isPrime =false;
//			}
//			for(int i=2;i<=Math.sqrt(n);i++) {
//				if(n%i==0) {
//					isPrime =false;
//					break;
//				}
//				
//			}
			for(int i=start;i<=end;i++) {
				if(isPrime) {
					System.out.println(i);
				}
			}
			sc.close();
	}

}
