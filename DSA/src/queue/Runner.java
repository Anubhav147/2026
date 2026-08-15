package queue;

public class Runner {

	public static void main(String[] args) {
		Queue q= new Queue();
		q.enQueue(5);
		q.enQueue(3);
		q.enQueue(7);
		q.enQueue(9);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(66);
		q.enQueue(29);
		
		
		System.out.println("Size is "+ q.getSize());
		q.show();

	}

}
