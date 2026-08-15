package arrays;

import java.util.Arrays;

public class CopyArry {
	
	public static void main(String[] args) {
		
		
		int[] copyFrom = {2,3,4,5,6,5,1,1,1};
		int[] copyTo= new int[5];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		System.out.println(Arrays.toString(copyTo));
	}

}
