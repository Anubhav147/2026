package arrays;

import java.util.Arrays;

public class ReverseOfArray {
	public static void main(String[] args) {
		
	 int[] arr = {3,4,2,3,8,9,-1};
	 Arrays.sort(arr);
	 System.out.println(Arrays.toString(arr));
	 
	 int start =0;
	 int end = arr.length-1;
	 while(start<end) {
		 int temp=arr[start];
		 arr[start]=arr[end];
		 arr[end]=temp;
		 
		 start++;
		 end--;
	 }
	 
	 System.out.println(Arrays.toString(arr));
	
	}
}
