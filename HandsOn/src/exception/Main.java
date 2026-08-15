package exception;

public class Main {

	public static void main(String[] args) {
		
		
		int i =10;
		int j=0;
		
		try {
		j=i/j;
		throw new Anubhav("this is error");
		} catch (Anubhav e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("r=error");
		}
		
		System.out.println(j);
		
	}
}
