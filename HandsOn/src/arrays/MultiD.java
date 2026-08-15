package arrays;

public class MultiD {
	
	public static void main(String[] args) {
		
		int[][] n = new int[4][3];
		
		n[0][0] =10;
		n[0][1]=11;
		n[0][2]=12;
		n[1][0]=20;
		n[1][1]=21;
		n[1][2]=22;
		n[2][0]=30;
		n[2][2]=32;
		n[2][1]=31;
		n[3][0]=40;
		n[3][1]=41;
		n[3][2]=42;
		
		for(int[] i:n) {
			for (int j:i) {
				System.out.print(j + " ");
            }
            System.out.println(); 
		}
		 System.out.println(); 
		 System.out.println(); 
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
