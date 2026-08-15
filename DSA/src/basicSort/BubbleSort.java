package basicSort;

public class BubbleSort {
	
	public static void main(String[] args) {
		 int nums[] = {2,5,44,33,13,23,2456,6,54,21,0};
		 // want to sort
		 
		 int temp =0;
		 System.out.println("before Sort : " );
		 for(int n : nums) {
			 System.out.print(n + " ");
		 }
		 System.out.println();
		 
		 for(int i=0;i<nums.length;i++) {
			 for(int j=0;j<nums.length-i-1;j++) {
				 if(nums[j]>nums[j+1]) {
					 temp=nums[j];
					 nums[j]=nums[j+1];
					 nums[j+1]=temp;
				 }
			 }
		 }
		 
		 
		 System.out.println("After Sort : " );
		 for(int n : nums) {
			 System.out.print(n + " ");
		 }
		 System.out.println();
	}

}
