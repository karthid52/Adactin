package com.oops;

public class Method {
	public void T20cricket(String A) {      			// method creation
			// TODO Auto-generated method stub
System.out.println(A);
	}
	public void ODICRICKET(String B) {					// 2nd method creation
		// TODO Auto-generated method stub
System.out.println(B);
	}
	public void TESTCRICKET(String C) {					// 3rd method creation
		// TODO Auto-generated method stub
System.out.println(C);
	}
public static void main(String[] args) {				// main method
	Method captain = new Method();						// object 1 creation
	captain.T20cricket("INDIAN T20 CAPTAIN IS ROHIT SHARMA");   // 1st method calling
	Method captain2 = new Method();								// object 2 creation
	captain2.ODICRICKET("INDIAN ODI CAPTAIN IS VIRAT KOHLI");	// 2nd method calling
	Method captain3 = new Method();								// object 3 creation
	captain3.TESTCRICKET("INDIAN TEST CRICKET CAPTAIN IS VIRAT KOHLI");   // 3rd method calling
}
 }
