package simpleConditionsGettingStarted;

import java.util.Scanner;

public class PositiveNegativeZero {
//Take a number and print whether it’s positive, negative, or zero.
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no. :");
	 int  n =sc.nextInt();
	 
	 if(n<0) {
		 System.out.println("Number is negative!!");
	 } else if(n==0) {
		 System.out.println("Number is Zero");
	 }else {
		 System.out.println("POSITIVE");
	 }
	 
	 sc.close();
 }
}