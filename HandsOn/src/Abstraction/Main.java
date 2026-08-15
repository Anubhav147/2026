package Abstraction;

public class Main {

	public static void main(String args[]) {
		
		Bike bike = new Honda();
		bike.run();
		
		Shape s= new Circle();
		s.area();
		s.draw();
		Shape s1= new Square();
		s1.area();
		s1.draw();
		
		
		A a = new C();
		a.a();
		a.b();
		a.c();
		a.d();
		A.test();
	}
}
