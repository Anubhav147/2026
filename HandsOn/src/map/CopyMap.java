package map;

import java.util.HashMap;

public class CopyMap {

	public static void main(String[] args) {
		// Write a Java program to copy all mappings from the specified map to another map.
		HashMap<String, Integer> map1 = new HashMap<>();

		map1.put("Anubhav", 1);
		map1.put("Amit", 2);
		map1.put("Ankit", 3);

		HashMap<String, Integer> map2 = new HashMap<>();

		map2.put("Anubhav", 8);
		map2.put("Raj", 2);
		map2.put("Vaibhav", 3);
		
		System.out.println(map1);
		System.out.println("Before");
		System.out.println(map2);
		map2.putAll(map1);
		System.out.println("After");
		System.out.println(map2);

	}

}
