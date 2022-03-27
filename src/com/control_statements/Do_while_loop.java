package com.control_statements;

public class Do_while_loop {
public static void main(String[] args) {
	int a=10000;
	do {            //loop execution 
		System.out.println("Your A/C balance is Rs."+a+"    we proceed your NEFT Request of Rs.2500");
		a=a-2500;			//Iteration
	} while (a>0);			//condition
	
}
}
