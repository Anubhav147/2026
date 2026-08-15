package Interface;

public class Print implements Printable,Showable{

	@Override
	public void print() {
		System.out.println("Print ");
		
	}

	@Override
	public void show() {
		System.out.println("Show");
		
	}

}
