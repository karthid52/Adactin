package com.decision_statements;
import java.util.Scanner;
public class Jumbing_statements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the break point");
	int num=sc.nextInt();			// assign a break point using scanner input
	for (int i = 0; i<52;i++) {		//for loop statement
			
		if (i>=num) {				// if condition assignment for break 
			break; 					// IF the if condition is true then loop will be terminated false means loop will be continued
			
		}
		System.out.println(i);		
	}
	
	for (int j = 0; j < 15; j++) {			//for loop statement
				
		if (j>5 && j<8) {				// if condition assignment for break 
			continue;	// IF the if condition is true then loop will be skipped for the current condition  false means loop will be continued
		}
		System.out.println(j);
	}

}

}



