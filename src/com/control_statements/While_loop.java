package com.control_statements;

public class While_loop {
	public static void main(String[] args) {
		int a=5;
		while (a>0) {									//entry level condition
			System.out.println("You are at floor no   "+a+"  so use lift to go ground floor");
			a--;    //Iteration
		}
	}
}
