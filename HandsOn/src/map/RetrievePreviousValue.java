package map;

import java.util.HashMap;
import java.util.Map;

public class RetrievePreviousValue {

	public static void main(String[] args) {
		// Write a Java program to implement a method that adds a key-value pair to a
		// HashMap and returns the previous value associated with the key.

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Anubhav", 1);
		map.put("Vaibhav", 2);

		Integer s = mapMethod(map, "Raj", 3);
		System.out.println(s);
		Integer s1 = mapMethod(map, "Raj", 4);
		System.out.println(s1);
		System.out.println(map);

	}

	public static Integer mapMethod(Map<String, Integer> m, String s, Integer i) {
		return m.put(s, i);
	}

}


/**
 * Associates the specified value with the specified key.
 * Returns the previous key that was mapped to this value, or null if none.
 
 
public static <K, V> K putAndGetPreviousKey(Map<K, V> map, K newKey, V value) {
    K previousKey = null;

    // 1. Scan the map to find if any key already holds this value
    for (Map.Entry<K, V> entry : map.entrySet()) {
        if (Objects.equals(entry.getValue(), value)) {
            previousKey = entry.getKey();
            break; // Stop searching once the first matching key is found
        }
    }

    // 2. Insert the value under the new key
    map.put(newKey, value);

    // 3. Return the key that used to hold this value
    return previousKey;
}

public static void main(String[] args) {
    Map<String, String> employeeIds = new HashMap<>();
    employeeIds.put("E001", "Anubhav");
    employeeIds.put("E002", "Vaibhav");

    System.out.println("Original Map: " + employeeIds);

    // Scenario 1: Assigning "Anubhav" to a new ID (E003)
    String oldKey1 = putAndGetPreviousKey(employeeIds, "E003", "Anubhav");
    System.out.println("\nAssigned 'Anubhav' to E003. Previous key was: " + oldKey1);
    System.out.println("Map state: " + employeeIds);

    // Scenario 2: Assigning a brand new name "Amit" to a new ID (E004)
    String oldKey2 = putAndGetPreviousKey(employeeIds, "E004", "Amit");
    System.out.println("\nAssigned 'Amit' to E004. Previous key was: " + oldKey2);
    System.out.println("Final Map: " + employeeIds);
}


*/