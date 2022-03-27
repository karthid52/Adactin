package com.oopsconcepts;

public class Multilevel extends Single {		//Multilevel inheritance child2 class
public void today() {
	// TODO Auto-generated method stub
System.out.println("Evening am going to marina beach");
}
public static void main(String[] args) {
	Multilevel obj = new Multilevel();
	obj.weekend();
	obj.sunday();
	obj.today();
	
	
}
}
