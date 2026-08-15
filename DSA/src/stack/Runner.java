package stack;

public class Runner {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(12);
		s.push(15);
		s.push(8);
		s.show();
		System.out.println();
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		s.show();
		System.out.println();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}
