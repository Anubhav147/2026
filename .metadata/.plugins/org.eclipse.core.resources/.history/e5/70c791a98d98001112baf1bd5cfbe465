package map;

import java.util.*;

public class KeyAlreadyExist {

	public static void main(String[] args) {
		// Write a Java program to insert a key-value pair into a HashMap and then
		// update the value if the key already exists.
		HashMap<String, Integer> productStock = new HashMap<>();

		// 1. Initial Insertions
		productStock.put("Laptop", 10);
		productStock.put("Phone", 25);
		System.out.println("Initial Stock: " + productStock);

		// -------------------------------------------------------------
		// APPROACH 1: Using classic put()
		// Behavior: If the key exists, it completely overwrites the value.
		// -------------------------------------------------------------
		String key1 = "Laptop";
		int newStock1 = 15; // We want to update Laptop stock to 15

		productStock.put(key1, newStock1);
		System.out.println("\nAfter Approach 1 (put): " + productStock);

		// -------------------------------------------------------------
		// APPROACH 2: Using merge() (Best for math-based updates)
		// Behavior: If the key exists, it applies a function (e.g., adding to it).
		// -------------------------------------------------------------
		String key2 = "Phone";
		int stockToAdd = 5; // We want to ADD 5 more Phones to the existing stock

		// (oldValue, newValue) -> oldValue + newValue defines the update logic
		productStock.merge(key2, stockToAdd, (oldValue, newValue) -> oldValue + newValue);
		System.out.println("After Approach 2 (merge): " + productStock);

		// -------------------------------------------------------------
		// APPROACH 3: Explicit check using containsKey()
		// Behavior: Good if you need custom log messages for insertions vs updates.
		// -------------------------------------------------------------
		String key3 = "Tablet";
		int targetStock = 8;

		if (productStock.containsKey(key3)) {
			System.out.println("\nUpdating existing product...");
			productStock.put(key3, targetStock);
		} else {
			System.out.println("\nKey '" + key3 + "' not found. Inserting fresh entry...");
			productStock.put(key3, targetStock);
		}
		System.out.println("Final Stock State: " + productStock);
	}
}
