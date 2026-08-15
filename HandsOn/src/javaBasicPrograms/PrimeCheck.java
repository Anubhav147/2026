package javaBasicPrograms;

public class PrimeCheck {
	
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
			return false;
		return true;
		
	}
	
	public static void main(String[] args) {
		//isPrime(65);
		//System.out.println(isPrime(11));
		
		int start =2;
		int end =10;
		
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		
//		boolean isPrime = true;
//		
//		if(n<=1) {
//			isPrime =false;
//		}
//		for(int i=2;i<=Math.sqrt(n);i++) {
//			if(n%i==0) {
//				isPrime =false;
//				break;
//			}
//			
//		}
		
//		if (isPrime) {
//            System.out.println(n + " is a prime number.");
//        } else {
//            System.out.println(n + " is not a prime number.");
//        }
		
		
		
	}

}
