 package com.polymorphism;

public class Overloading {							//Class creation 
public void bike() {								//method creation
		// TODO Auto-generated method stub			
System.out.println("I want buy a new bike");		//method s.out
}
public void bike(int a) {							// same method creation with different Arguments
	// TODO Auto-generated method stub
System.out.println(a);								// method s.out
}
public void bike(int a, String b) {					// same method creation with different Arguments
	// TODO Auto-generated method stub
System.out.println(a+b);							// method s.out
}
public void bike(int a, double b) {						// same method creation with different Arguments
	// TODO Auto-generated method stub
System.out.println(a+b);							// method s.out
}
public static void main(String[] args) {			// main method creation
	Overloading obj = new Overloading();			// object creation
	obj.bike();										// method calling with using arguments
	obj.bike(150000);								// method calling with using arguments
	obj.bike(150000, "   Bike on road price amount");		// method calling with using arguments
	obj.bike(14, 112.25);										// method calling with using arguments
	
}
}
