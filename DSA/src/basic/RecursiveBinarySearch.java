package basic;

import java.util.Arrays;

public class RecursiveBinarySearch {

public static void main(String[] args) {
		
		int nums[] = {4,5,2,6,9,7,3};
		int target =9;
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int result = bianarySearch(nums, target,0 ,nums.length-1);
		
		if(result != -1) {
			System.out.println("Element found at : " + result);
		}else {
			System.out.println("NOT FOUND!!");
		}
	}

private static int bianarySearch(int[] nums, int target, int left, int right) {
	// TODO Auto-generated method stub
	
	if(left<=right) {
		int mid=(left+right)/2;
		if(nums[mid]==target) {
			return mid;
		}else if(nums[mid] < target){
			return bianarySearch(nums,target,mid+1,right);
		}else {
			return bianarySearch(nums,target,left,mid-1);
		}
		
	}
	
	return -1;
}


}