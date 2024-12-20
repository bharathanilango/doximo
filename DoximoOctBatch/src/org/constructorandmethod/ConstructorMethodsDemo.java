package org.constructorandmethod;

public class ConstructorMethodsDemo {
	
	ConstructorMethodsDemo(){
		super();
		System.out.println("Iam No argument constructor");
	}
	ConstructorMethodsDemo(int id){
		this("Bharathan", 987654210l);
		System.out.println("id  parametarized constructor");
		System.out.println(id);
	}
	ConstructorMethodsDemo(String name, long phoneNo){
		System.out.println("String and long parameterized constructor");
		System.out.println(name);
		System.out.println(phoneNo);
	}
	public void method1() {
		System.out.println("Method 1");
	}
	public void method2() {
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		ConstructorMethodsDemo cmo = new ConstructorMethodsDemo();
		cmo.method1();
		cmo.method2();
	}
}
