package com.strings_functions;

public class String_types {
public static void main(String[] args) {
	// IMMUTABLE STRING
	String a="hello chennai";
	String b="hello chennai";
	String g="hello chennai";
	
	a=a+"gee";
	System.out.println("IMMUTABLE STRING:");
	System.out.println(System.identityHashCode(a));  // identityHashCode used to find memory address of the string
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(g));
	
	
	
	//MUTABLE STRING
	StringBuffer c= new StringBuffer("i love music");
	StringBuffer e= new StringBuffer("i love music");
	StringBuffer k= new StringBuffer("i love music");
	 c=c.append(e);
	 //k=k.append(e);
	 System.out.println("MUTABLE STRING:");
	System.out.println(System.identityHashCode(c));
	System.out.println(System.identityHashCode(e));
	System.out.println(System.identityHashCode(k));
	
	
	
}
}
