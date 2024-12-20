package org.exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println(0);
		//Handling ArithmaticException by using try and catch block 
		try {
			System.out.println(1/0);//Occurs ArithmaticException
		}catch(ArithmeticException e) {
			System.out.println("Numbers Can not be divided by zero");
		}
		System.out.println(2);
		//Handling NullPointerException by using try and catch block
		try {
			String s = null;
			System.out.println(s.charAt(5));//Occurs NullPointerException
		}catch(NullPointerException e){
			System.out.println("String is null");
		}
		System.out.println(3);
		//Handling StringIndexOutOfBoundsException by using try and catch block
		try {
			String s1 = "java";
			System.out.println(s1.charAt(10));//StringIndexOutOfBoundsException
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Searching index is not present in the String");
		}
		System.out.println(4);
		//Handling  ArrayIndexOutOfBoundsException by using try and catch block
		try {
			int a[] = new int[3];
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			System.out.println(a[20]);//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Searching index not present in the array");
		}
		System.out.println(5);
		//Handling IndexOutOfBoundsException
		try {
			List<Integer> li = new ArrayList<>();
			li.add(40);
			li.add(50);
			li.add(60);
//			System.out.println(li.get(5));//IndexOutOfBoundsException
		
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Searching index not present in the list");
		}
		finally {
			System.out.println("Finally block holds important message if exception occurs or not it will always execute ");
		}
		System.out.println(6);
//		String s2 = "@54100";//numberFormatException
		String s3 = "54100";//it will not throw Exception
		int convToInt = Integer.parseInt(s3);
		if(convToInt >= 50000) {
			System.out.println("Product is greater than 50k");
		}
	}
}
