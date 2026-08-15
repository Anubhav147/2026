package arrays;

import java.util.Scanner;

public class UserInput2D {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns = sc.nextInt();
		
		int[][] a = new int[rows][columns];
		System.out.println("Enter the elements of array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("enter the elements for the position ("+i+","+j+"):");
			a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("entered 2d array are");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
