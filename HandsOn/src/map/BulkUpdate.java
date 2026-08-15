package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BulkUpdate {
	public static void main(String[] args) {
		// Write a Java program to calculate the size of a HashMap after bulk insertion
		// and deletion operations.

		Map<String, String> map = new LinkedHashMap<>();
		map.put("Anubhav", "Varanasi");
		map.put("Amit", "HYD");
		map.put("Ankit", "Pune");
		System.out.println(map);
		Map<String, String> bulk = new HashMap<String, String>();
		System.out.println("Original size : " + map.size() + " And BULK is : " + bulk.size());

		bulk.putAll(map);

		System.out.println(bulk);

		System.out.println("After Bulk Update Bulk size : " + bulk.size());
		bulk.remove("Amit");
		System.out.println(bulk);

		bulk.clear();
		System.out.println("clear is used to delete all record,so now buld size is : " + bulk.size());
		System.out.println(bulk);
	}
}
