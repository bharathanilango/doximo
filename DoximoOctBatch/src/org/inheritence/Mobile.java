package org.inheritence;

//Child Class For Device
//Single Level Inheritance
public class Mobile extends Device{
	public void mobileBrand() {
		System.out.println("Mobile Brand is MI");
	}
	public void mobileModel() {
		System.out.println("Mobile model is REDMI NOTE 8 PRO..");
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.deviceType();
		m.mobileBrand();
		m.mobileModel();
	}
}
