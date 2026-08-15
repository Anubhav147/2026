package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print p = new Print();
		p.print();
		p.show();
		
		Drawable d= new Square();
		d.draw();
		d.msg();
		Drawable d1 = new Circle();
		d1.draw();

	}

}
