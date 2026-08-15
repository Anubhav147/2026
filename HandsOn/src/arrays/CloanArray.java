package arrays;

public class CloanArray {
	public static void main(String[] args) {
		
		int arr[]= {33,3,4,5};
		
		System.out.println("print original");
		for(int i:arr) {
			System.out.println(i);
			
		}
		
		System.out.println("print clone");
		int[] carr = arr.clone();
		for(int i:carr) {
			System.out.println(i);
		}
		
		System.out.println("are they equal");
		System.out.println(arr == carr);
		
		// it returns false as both are distinct arr although they have same elements
	}

}
