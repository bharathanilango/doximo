package org.inheritence;

//Child Class For Dog
//GrantChild Class For Animal
//MultiLevel Inheritance

public class BabyDog extends Dog{
	public void weep() {
		System.out.println("babydog Weeping...");
	}
	public static void main(String[] args) {
		BabyDog bd =new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}
}
