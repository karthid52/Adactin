package com.constructor;

public class New_car {
	public New_car() {								// Default constructor creation
		System.out.println("I WANT TO BUY A NEW CAR"); // output
	}
	public  New_car(int a,int b,String c) {				// Parameterised constructor creation
		
		System.out.println(c);							// output using arguments
		System.out.println(a+b);						//output using arguments
	}
	public static void main(String[] args) {
		New_car obj=new New_car();						//object creation and also constructor calling
		New_car obj2=new New_car(500000,15000,"Honda City Car rate is");  ////object creation and also constructor calling using parameter
		
	}
}
