package org.collections;

import java.util.*;

public class Sett {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(40);
		s.add(50);
		System.out.println(s);
		Set<Integer> s1 = new TreeSet<Integer>();
		s1.add(20);
		s1.add(60);
		s1.add(30);
		s1.add(50);
		s1.add(10);
		s1.add(40);
		System.out.println(s1);
		s1.remove(50);
		System.out.println(s1);
		for(Integer i : s1) {
			System.out.println(i);
		}
	}
}
