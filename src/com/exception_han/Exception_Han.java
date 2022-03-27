package com.exception_han;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Han {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);

		
		try {								//in try block we provide a program which may create exceptions
			System.out.println("print num1");
			int num1=sc.nextInt();
			System.out.println("print num2");
			int num2=sc.nextInt();
			System.out.println(num1+num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			
		}
		catch(ArithmeticException | InputMismatchException e) { // in catch we give what the exception happen
			System.out.println("Exception occurs");
			System.out.println(e);
			
	
		}
		finally {
			System.out.println("successfully fineshed ");
		}
		
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				throw new Exception();
				
			}
			System.out.println(i);
		}
		
		
		
		
}}