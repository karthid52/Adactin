package com.scanner;

import java.util.Scanner;

public class Use_scanner {


public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	
	System.out.println("Quoat of the day");  
		  String quoat = sc.nextLine();
	  System.out.println(quoat);
	  
	  System.out.println("year of the day");
	  int num = sc.nextInt();
	  int num1 = sc.nextInt();
	  System.out.println(num/num1);
	  
	  System.out.println("Today Day");
	  String line = sc.next();
	  System.out.println(line);
	  
	  System.out.println("your fifth letter");
	  char letter = sc.next().charAt(4);
	  System.out.println(letter);
	
			
}
}