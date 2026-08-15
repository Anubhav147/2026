package arrays;

public class Multiply2D {
	
	public static void main(String[] args) {
		
		int[][] a= {{2,3,4},{3,4,5}};
		int[][] b= {{4,5,6},{5,6,7}};
		
		int[][] c = new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
