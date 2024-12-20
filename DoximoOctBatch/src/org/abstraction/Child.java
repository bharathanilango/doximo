package org.abstraction;

public class Child implements Par1,Par2{
	@Override
	public void test1() {System.out.println("Test1");}
	@Override
	public void test2() {System.out.println("Test2");}
	@Override
	public void test3() {System.out.println("Test3");}
	@Override
	public void test4() {System.out.println("Test4");}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
	}
}
