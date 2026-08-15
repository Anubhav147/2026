package map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeWithStream {

	public static void main(String[] args) {
		// Write a Java program to merge two maps into a new map using Java streams and then print the merged result.
		HashMap<String, Integer> map1 = new HashMap<>();

		map1.put("Anubhav", 1);
		map1.put("Amit", 2);
		map1.put("Ankit", 3);

		HashMap<String, Integer> map2 = new HashMap<>();

		map2.put("Anubhav", 8);
		map2.put("Raj", 2);
		map2.put("Vaibhav", 3);
		
		// Merge both maps into a brand-new map using Streams
        Map<String, Integer> mergedMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,                      // Key mapper
                        Map.Entry::getValue,                    // Value mapper
                        (value1, value2) -> value1 + value2 // Merge function for collisions
                ));

        // Print the final merged result
        System.out.println("Original Map 1: " + map1);
        System.out.println("Original Map 2: " + map2);
        System.out.println("Merged Map:     " + mergedMap);
    }
}