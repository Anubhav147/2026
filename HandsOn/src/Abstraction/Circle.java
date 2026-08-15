package Abstraction;

public class Circle extends Shape{

	@Override
	public double area() {
		double pi=3;
		int r=2;
		double d=pi*(r*r);
		System.out.println(" The area of circle is " + d);
		return d;
		
		
	}
	
	void draw(){
		System.out.println("display circle");
	}

}
