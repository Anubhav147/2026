package ArrayAsObject;

public class Main {
	
	public static void main(String[] args) {
		
		
		Book[] book = new Book[2];
		
//		book[0]=new Book(1,"history");
//		book[1]=new Book(2,"science");
//		
//		for(int i =0;i<book.length;i++) {
//			book[i].display();
//		}
		
		book[0]= new Book();
		book[1]=new Book();
		
		book[0].setCost(900);
		book[0].setAuthor("anubhav");
		book[1].setCost(500);
		book[1].setAuthor("ana");
		
		System.out.println("book 1 details are ");
		book[0].display();
		System.out.println("book 2 details are ");
		book[1].display();
		
		
		
		
	}

}
