package org.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSet {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(21);
		l.add(22);
		l.add(26);
		l.add(25);
		
		
		Set<Integer> s = new TreeSet<>(l)
;
		
	System.out.println(s);
	
	for (int i = 0; i < l.size(); i++) {
Integer sl = l.get(i);
if (sl%2==0) {
	System.out.println(sl);
}
		
		//System.out.println(i);
		
		
		
	}
	
	}

}
