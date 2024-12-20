package org.polymorphism;

public class MethodOverLoad {
	//dataType
	public void empDetails(String name) {
		System.out.println("Employee name is : "+name);
	}
	//dataType
	public void empDetails(int id) {
		System.out.println("Employee Id is : "+id);
	}
	//dataType count
	public void empDetails(String name , long mobileNo) {
		System.out.println("Employee name is : "+name);
		System.out.println("Employee Mobile Number is : "+mobileNo);
	}
	//dataType Order
	public void empDetails(long mobileNo, String name) {
		System.out.println("Employee name is : "+name);
		System.out.println("Employee Mobile Number is : "+mobileNo);
	}
	public static void main(String[] args) {
		MethodOverLoad ml = new MethodOverLoad();
		ml.empDetails(100);
		ml.empDetails("Bharathan");
		ml.empDetails(9876543210l, "Kalai");
		ml.empDetails("vijay", 654321879l);
	}
}
