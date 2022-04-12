package org.info;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map<String,String> m = new Hashtable();
		
		m.put("10", "Sathish");
		m.put("15", "Devi");
		m.put("60", "Banu");
		m.put("30", "Priya");
		m.put("20", "Janu");
		m.put("40", "Dharshini");
		m.put("60", "Ram");
		m.put("80", "Ram");
		
		int size = m.size();
		System.out.println(size);
		
		boolean containsKey = m.containsKey("60");
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("Priya");
		System.out.println(containsValue);
		
		String string = m.get("60");
		System.out.println(string);
		
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
			
			String key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
			
		}
	}

}
