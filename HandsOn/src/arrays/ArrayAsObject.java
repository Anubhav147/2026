package arrays;

public class ArrayAsObject {
	public static void main(String[] args) {
		
		double arr[][] = {{4.0,4,5},{2,3}};
		
		String c =arr.getClass().getName();
		System.out.println(c);
	}

}
