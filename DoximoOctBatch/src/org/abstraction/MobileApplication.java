package org.abstraction;

public class MobileApplication implements WebApplication{
	@Override
	public void login() {
		System.out.println("Mobile Login");	
	}
	@Override
	public void flightSearch() {
		System.out.println("Mobile Flight Search");	
	}
	@Override
	public void singUp() {
		System.out.println("Sign up Successfully...");
	}
	public static void main(String[] args) {
		MobileApplication ma = new MobileApplication();
		ma.login();
		ma.flightSearch();
		ma.singUp();
	}
}
