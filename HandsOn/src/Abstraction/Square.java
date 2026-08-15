package Abstraction;

public class Square extends Shape{

	@Override
	public double area() {
		double d= 2*9;
		System.out.println(" The area of square is " + d);
		return d;
	}
	
	void draw(){
		System.out.println("display square");
	}
	

}
