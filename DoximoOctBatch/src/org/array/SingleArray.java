package org.array;

public class SingleArray {
	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("Iterating By Normal For loop");
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Iterating By Enhanced For Loop");
		for(int x : a) {
			System.out.println(x);
		}
	}
}
