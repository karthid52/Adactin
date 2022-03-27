package com.polymorphism;

public class Over_riding {  						// over riding parent class
public void pen() {								   // method creation
	System.out.println("i need pen");
}
public void pen(int a,float b) {
	System.out.println(a+b);
}	
public void pen(byte a,int b) {
	System.out.println(a+b);
}
public void pen(String c) {
	System.out.println(c);

}
}