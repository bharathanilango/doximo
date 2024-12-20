package org.condition;
//Control Flow Statement - While Loop
public class WhileLoop {
	public static void main(String[] args) {
		//While Loop
		System.out.println("Example for While Loop");
		int a = 0;
		while(a <= 5) {
			System.out.println("a is : "+ a);
			a++;
		}
		//do While Loop
		//It Execute Once Even If The Condition True Or False
		System.out.println("Example for do While Loop");
		int b = 10;
		do {
			System.out.println("Execute Once");
			b++;
		}while(b<10);
	}
}
