package com.decision_statements;
import java.util.Scanner;
public class If_statements {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark= sc.nextInt();
	if (mark>=90 && mark<=100) {
		System.out.println("YOUR GRADE IS S");
		
	}
	else if (mark<90  && mark>=80) {
		System.out.println("YOUR GRADE IS A");
	}
	else if (mark<80 && mark>=70) {
		System.out.println("YOUR GRADE IS B");
	}
	else if (mark<70 && mark>=60) {
		System.out.println("YOUR GRADE IS C");
	}
	else if (mark<60 && mark>=50) {
		System.out.println("YOUR GRADE IS D");
	}
	else if (mark<50 && mark>=40) {
		System.out.println("YOUR GRADE IS E");
		}
	else if (mark<40) {
		System.out.println("YOU ARE FAIL ");
	}
	else {
		System.out.println("YOU ARE ENTERED A INVALID MARK");
	}

}
}
