package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		s1.add(55);
		s1.add(65);
		s1.add(43);
		s1.add(65);
		s1.add(92);
		
Set<Integer> s2 = new TreeSet<Integer>();
		
		s2.add(5);
		s2.add(5);
		s2.add(3);
		s2.add(9);
		
		
		s1.addAll(s2);
		
Set<String> s3 = new LinkedHashSet<String>();
		
		s3.add("anu");
		s3.add("aba");
		s3.add("vai");
		s3.add("raj");
		
		
		//s1.addAll(s3);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
