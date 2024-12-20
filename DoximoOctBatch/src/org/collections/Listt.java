package org.collections;

import java.util.*;

public class Listt {
	public static void main(String[] args) {
		 
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> ni = new ArrayList<Integer>();
		ni.add(2);
		ni.add(30);
		ni.add(40);
		ni.add(3);
		//add method is for adding the element into the collection
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		//contains method is for check the element present or not
		boolean b=li.contains(100);
		System.out.println(b);
		//get method is for get the element based on index
		int get = li.get(3);
		System.out.println(get);
		//retainAll method is for remove the all element which is in 
		//specified collection
		ni.retainAll(li);
		System.out.println(ni);
		//isEmpty method is for check the collection is empty or not
		boolean b1 = li.isEmpty();
		System.out.println(b1);
		//remove method is for remove the element based on index
		li.remove(3);
		System.out.println(li);
		//indexOf Method is for fetch the index for specified element
		int i = li.indexOf(20);
		System.out.println(i);
		int i2 = li.lastIndexOf(30);
		System.out.println(i2);
	}
}
