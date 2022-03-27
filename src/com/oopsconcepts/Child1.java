package com.oopsconcepts;

public class Child1 extends Parent {			//Hierarchical inheritance child1 class

public void write() {

System.out.println("write your homework now");

}
public static void main(String[] args) {
	Child1 obj = new Child1();
	obj.sunday();
	obj.write();
}
}
