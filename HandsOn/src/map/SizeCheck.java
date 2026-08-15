package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SizeCheck {

	public static void main(String[] args) {
		// Count Key-Value Mappings in Map

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Pear");
		// map.putIfAbsent(1, "PineApple");
		map.put(4, "PineApple");

		for (Entry<Integer, String> test : map.entrySet()) {
			System.out.println(test.getValue() + " " + test.getKey());
		}

		System.out.println("Size should be : " + map.size());

	}

}
