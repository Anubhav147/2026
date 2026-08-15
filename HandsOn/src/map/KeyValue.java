package map;

import java.util.*;

public class KeyValue {

	public static void main(String[] args) {
		// Write a Java program to associate the specified value with the specified key
		// in a HashMap.

		Map<String, Integer> map = new HashMap<>();
		map.put("Anubhav", 007);
		map.put("Amit", 8);
		map.put("Ankit", 9);
		map.put("Anubhav", 19);

		System.out.println(map);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " || " + entry.getValue());
		}
	}

}

//		for(String s : map.keySet()) { 
//            System.out.println(s + " " + map.get(s)); 
//        } 
