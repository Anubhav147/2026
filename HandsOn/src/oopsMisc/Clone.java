package oopsMisc;

public class Clone {
	
	public static void main(String[] args) {
		
		try {
			Students s1 = new Students(101, "Jack");
			Students s2 = (Students) s1.clone();
			System.out.println("Original Student Object: " + s1.id + " - " + s1.name);
			System.out.println("Cloned Student Object: " + s2.id + " - " + s2.name);
			s2.name="anu";
			System.out.println("Original Student Object: " + s1.id + " - " + s1.name);
			System.out.println("Cloned Student Object: " + s2.id + " - " + s2.name);
		
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();;
		}
		
		
	}

}
