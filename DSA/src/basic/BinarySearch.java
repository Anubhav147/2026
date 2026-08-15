package basic;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int nums[] = {4,5,5,5,2,6,9,7,3};
		int target =5;
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int result = bianarySearch(nums, target);
		
		if(result != -1) {
			System.out.println("Element found at : " + result);
		}else {
			System.out.println("NOT FOUND!!");
		}
	}

	private static int bianarySearch(int[] nums, int target) {
		
		int left =0;
		int right=nums.length-1;
		//for(int i=left;i<=right;i++) {
		
		while(left <= right) {
			int mid =(left+right)/2;
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				left = mid+1;
			}else {
				right=mid-1;
			}
		}
		//}
		return -1;
	}
}