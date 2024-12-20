package org.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		m.put(1,"java");m.put(2, "sql");m.put(4, "selenium");m.put(5, "sql");
		m.put(3, "c#");
		m.put(1, "css");
		System.out.println(m);
		//to get the key and value by using particular key
		String s = m.get(1);
		System.out.println(s);
		//check the particular key is present or not
		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);
		//check the particular value is present or not
		boolean containsValue = m.containsValue("selenium");
		System.out.println(containsValue);
		//to obtain keys
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		//to obtain values
		Collection<String> values = m.values();
		System.out.println(values);
		//to iterate the data from map
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		for(Entry<Integer,String> x : entrySet) {
			System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
	}
}
