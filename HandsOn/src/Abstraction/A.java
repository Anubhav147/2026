package Abstraction;

public interface A {
	
	static void test() {
		System.out.println("Test");
	}
	void a();
	void b();
	default void c() {
		System.out.println("c");
	}
	
	void d();

}
