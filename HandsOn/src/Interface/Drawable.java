package Interface;

public interface Drawable extends Printable{
	
	void draw();
	
	default void msg() {
		System.out.println("Default");
	}

}
