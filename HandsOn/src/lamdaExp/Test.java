package lamdaExp;

public class Test {
	
	public static void main(String[] args) {
		
//		Playable p = new Playable() {
//			
//			@Override
//			public void show(int i) {
//				System.out.println("in play" +i);
//				
//			}
//		};
//		p.show(5);
		
		
		Playable p=(i,j) -> i + +j;
		
		int result = p.show(7,9);
		System.out.println(result);
	}

}
