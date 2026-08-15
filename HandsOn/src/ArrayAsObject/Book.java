package ArrayAsObject;

public class Book {
	
	private int id;
	private String name;
	
	private String author;
	private int cost;

	public void setAuthor(String author) {
		this.author = author;
	}
    public void setCost(int cost) {
		this.cost = cost;
	}

//	Book(int i, String s){
//		this.id=i;
//		this.name=s;
//	}
	
	void display() {
		System.out.println("Book Id is " + id + cost + " and name is "+ author + name);
	}

}
