package mathAndNumberLogic;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// Check whether a number is a perfect square (without using the square root function)
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        if(num<0) {
        	System.out.println("Enter a valid no");
        }
        
      boolean isSquare =false;
        
       int i=0;
       while((long) i*i <=num) {
    	   if(i*i==num) {
    		   isSquare=true;
    		   break;
    	   }
    	   i++;
       }
       
      // System.out.println(num +" Is  square root of : "+i);
       if (isSquare) {
           System.out.println("Result: " + num + " is a perfect square (" + i + " * " + i + ").");
       } else {
           System.out.println("Result: " + num + " is not a perfect square.");
       }
        
        sc.close();
	}

}
