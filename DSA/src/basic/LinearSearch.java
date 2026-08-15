package basic;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int nums[] = {4,5,2,6,9,7,3};
		int target =3;
		
		int result = linearSearch(nums, target);
		
		if(result != -1) {
			System.out.println("Element found at : " + result);
		}else {
			System.out.println("NOT FOUND!!");
		}
	}

	

	private static int linearSearch(int[] nums, int target) {

		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i] == target) {
				return i;
			}
		}

		return -1;
	}



	

}
