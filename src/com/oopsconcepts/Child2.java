package com.oopsconcepts;

public class Child2 extends Parent{			//Hierarchical inheritance child2 class
private void tv() {
	// TODO Auto-generated method stub
System.out.println("switch off our tv now");
}
public static void main(String[] args) {
	Child2 obj = new Child2();
	obj.sunday();
	obj.tv();
}
}
