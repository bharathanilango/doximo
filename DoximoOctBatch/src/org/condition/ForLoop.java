package org.condition;
//Control Flow Statement - For loop 
public class ForLoop {
	public static void main(String[] args) {
		//For loop
		for(int i = 0; i <= 2; i++) {
			//Nested For loop
			for(int j = 0; j<=3; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
		//break and Continue Statement
		System.out.println("Examble for break and continue Statement");
		for(int i = 0; i <= 10; i++) {
			if(i==3) {
				continue;
			}
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
	}
}
