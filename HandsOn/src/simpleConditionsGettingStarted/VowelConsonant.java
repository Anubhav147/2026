package simpleConditionsGettingStarted;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// Take a character and check if it’s a vowel or consonant.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Char : ");
		String a= sc.next();
		
		if(a.length()>1) {
			System.out.println("Enter a valid Char!!");
		}else {
			char c =a.charAt(0);
			
			
			if(!Character.isLetter(c)) {
				System.out.println("Hey ! " + c +" is not a Character !! ");
			}else {
				System.out.println("Yeah ! " + c +" is a Character !! ");
				char lower = Character.toLowerCase(c);
//				if(lower=='a') {
//					System.out.println("Vowel");
//				}else if(lower=='e') {
//					System.out.println("Vowel");
//				}else if(lower=='i') {
//					System.out.println("Vowel");
//				}else if(lower=='o') {
//					System.out.println("Vowel");
//				}else if(lower=='u') {
//					System.out.println("Vowel");
//				}else {
//					System.out.println("Consonent");
//				}
				
				if("aeiou".indexOf(lower) != -1) {
					System.out.println("Result: '" + lower + "' is a Vowel.");
                } else {
                    System.out.println("Result: '" + lower + "' is a Consonant.");
                }
			}
		}
		
		sc.close();
	}

}
