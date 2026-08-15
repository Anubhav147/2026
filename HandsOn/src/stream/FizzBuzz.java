package stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {

		// List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

		// list.stream().filter(n->n%2==0).forEach(n->System.out.println("Fizz"));
		String result = IntStream.rangeClosed(1, 15)
				.mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i))
				.collect(Collectors.joining(" , "));

		System.out.println(result);
	}

}
