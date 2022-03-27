package com.java_programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		
		//using Scanner:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int temp=a;
		int len = String.valueOf(a).length();		
		double output=0;	
		
		while (a>0) {
			
		
			int rem=a%10;
			output=output+Math.pow(rem, len);
			a=a/10;
		}
		if (output==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
		
		
		// to get 153 as Armstrong number:
		int num=153;
		int leng = String.valueOf(num).length();
		int tem=num;
		int value=0;
		
		while(num>0){
			int reme=num%10;
			value=value+(reme*reme*reme);
			num=num/10;
			
		}
		
		if (tem==value) {
			
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("not a armstrong number");
		}
	}
}
