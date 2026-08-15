package ArrayAsObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAElement {
	
	public static void main(String[] args) {
		
		String[] originalArray = {"apple", "banana"};
		String newEle ="cat";
		
		List<String> list= new ArrayList<>(Arrays.asList(originalArray));
		list.add(newEle);
		
		String[] newArray = list.toArray(new String[0]);

		System.out.println(Arrays.toString(newArray));
	}

}
