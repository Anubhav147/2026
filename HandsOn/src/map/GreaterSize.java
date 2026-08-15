package map;

import java.util.*;

public class GreaterSize {

	public static void main(String[] args) {
		// Write a Java program to compare the size of two  maps and print the one with the greater number of mappings.

		Map<String , Integer> s1 = new HashMap<>();
		s1.put("Anubhav", 1);
		s1.put("vaibhav", 2);
		s1.put("Amit", 3);
		s1.put("Ankit", 4);
		s1.put("Niraj", 5);
		
		Map<Integer, Integer> s2 = new LinkedHashMap<>();
		s2.put(2, 3);
		s2.put(1, 3);
		s2.put(3, 3);
		s2.put(4, 3);s2.put(8, 3);
		s2.put(5, 3);
		s2.put(7, 3);
		s2.put(6, 3);
		
		for(Map.Entry<Integer, Integer> i : s2.entrySet()) {
			System.out.println(i.getKey() + " Key "+ i.getValue() + " Value "+ i.getClass() +" Class ");
		}
		
		for(Map.Entry<String, Integer> i : s1.entrySet()) {
			System.out.println(i.getKey() + " Key "+ i.getValue() + " Value "+ i.getClass() +" Class ");
		}
		
		int a=s1.size();
		int b =s2.size();
		if(a>b) {
			System.out.println("1st is greater in size");
		}else if(b>a) {
			System.out.println("2nd is greater in size");
		}else {
			System.out.println("Both are equal");
		}
		
		
		
		
	}

}
