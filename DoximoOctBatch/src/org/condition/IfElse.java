package org.condition;

//If Else Conditions
public class IfElse {

	public static void main(String[] args) {
		int clgId = 10, deptId=20;
		//Logical AND
		if(clgId==10 && deptId==20) {
			System.out.println("Both college id and Department id is Correct");
		}
		//Logical OR
		if(clgId==10 || deptId==10) {
			System.out.println("Either One Of The Condition Is Correct");
		}
		else {
			System.out.println("Both Conditions Are InCorrect");
		}
	}
}
