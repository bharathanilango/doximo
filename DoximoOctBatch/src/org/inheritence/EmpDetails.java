package org.inheritence;

//Child Class for CompanyDetails
//hierarchical Inheritance
public class EmpDetails extends CompanyDetails{
	public void EmpId() {
		System.out.println("Employee id is 1001");
	}
	public void EmpName() {
		System.out.println("Employee name is BHARATHAN");
	}
	public static void main(String[] args) {
		EmpDetails emp = new EmpDetails();
		emp.comId();
		emp.comName();
		emp.EmpId();
		emp.EmpName();
	}
}
