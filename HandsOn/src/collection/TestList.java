package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestList {
	
	
	
	public static void main(String[] args) {
		
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10 < o2%10)
				return -1;
				else
					return 1;
			}
			
		};
		
	List<Integer> n = new ArrayList<>();
	n.add(98);
	n.add(74);
	n.add(51);
	n.add(83);
	
	System.out.println(n);
	Collections.sort(n,c);
	System.out.println(n);
	
	for(Integer n1:n) {
		System.out.println(n1);
	}
	}

}
