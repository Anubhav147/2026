package arrays;

public class FIndMin {
	
	static void min(int arr[]) {
		int min =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			
			
		}
		System.out.println(min);
	}
public static void main(String[] args) {
	int a[]= {3,2,4,1,5};
	min(a);
}

}
