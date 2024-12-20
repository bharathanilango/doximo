package org.datatype;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int 
		System.out.println("Enter the Employee Id : ");
		int id = sc.nextInt();
		System.out.println("Employee Id Is : "+ id);
		
		//long
		System.out.println("Enter the Mobile Number : ");
		long number = sc.nextLong();
		System.out.println("Employee Mobile Number Is : "+number);
		
		//float
		System.out.println("Enter the Student CGPA : ");
		float  cgpa= sc.nextFloat();
		System.out.println("Student CGPA Is : "+cgpa);
		
		//double
		System.out.println("Enter the Mobile Price : ");
		double price = sc.nextDouble();
		System.out.println("Mobile Price Is : "+price);
		
		
	}
}
