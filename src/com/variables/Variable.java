package com.variables;

public class Variable {
	static int  a=10;									 // static variable
	 static int b=15;									// static variable
	  
	
public  void local_variable() {
	int c=100;												//local variable
 int b=200;												//local variable
 int d=230;


 System.out.println(a+b+c);

}
public static void static_vari() {						    //static method
	// TODO Auto-generated method stub
System.out.println(b-a);
}
public static void main(String[] args) {
	 Variable  obj=new  Variable();			 //object creation
	 obj.local_variable();
	 // local variable method calling//
	 
	
	System.out.println(a+b);							// static variable calling
	static_vari();									   // static method calling
}
}

