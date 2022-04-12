package org.info;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9 {
//	Description : Create a HashMap with the below key and values and iterate it using enhanced for loop.
//    key    : 10,20,30,40,50,60,10,50,40
//    values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
	
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap();
		
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			//System.out.println(entry);
			//System.out.println(entrySet);
			Integer key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
			
			
			
			
		}


	}

}
