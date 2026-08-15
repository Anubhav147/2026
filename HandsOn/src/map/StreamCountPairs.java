package map;

import java.util.HashMap;
import java.util.Map;

public class StreamCountPairs {
	public static void main(String[] args) {

		// Write a Java program to use Java streams to count and print the total number
		// of key-value pairs in a map.

		// 1. Create a HashMap and add key-value pairs
		Map<String, String> map = new HashMap<>();
		map.put("Anubhav", "Raj");
		map.put("Vaibhav", "Raj");
		map.put("Amit", "Singh");
		map.put("Srijan", "Sah");

		// 2. Open a stream on the entry set and count the elements
		long totalPairs = map.entrySet().stream().count();

		// 3. Print the total count
		System.out.println("Total number of key-value pairs: " + totalPairs);
	}
}
