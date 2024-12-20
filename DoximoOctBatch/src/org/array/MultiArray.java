package org.array;

public class MultiArray {
	public static void main(String[] args) {
		int a[][] = new int[2][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		System.out.println("Length Of The Array");
		int length = a.length;
		System.out.println(length);
		System.out.println("Iterating By Using Noramal For Loop");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Iterating By Using Enhanced For Loop");
		for(int x[] : a) {
			for(int y : x) {
				System.out.println(y);
			}
		}
	}
}
