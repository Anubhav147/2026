package ArrayAsObject;

public class StringArray {
	
	public static void main(String[] args) {
		
		String[] students = {"Ani", "Sam", "Joe"};  
		
	System.out.println("enhance loop");
		for(String stu:students) {
			System.out.println(stu);
		}
		
		students[1]="anubhav";
		System.out.println("For loop");
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		
	}

}
