package org.polymorphism;

//Method Overriding
public class DoximoBank extends ICICIBank{
	public void deposite() {
		System.out.println("Deposite 8%...");
	}
	public static void main(String[] args) {
		DoximoBank db = new DoximoBank();
		db.saving();
		db.deposite();
	}
}
