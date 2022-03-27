package com.abstraction;

public  class Hiden_details extends Partial_abstraction {
@Override
public void atmpin() {
	// TODO Auto-generated method stub
System.out.println("1265");	
}
@Override
	public void cvvnum() {
		// TODO Auto-generated method stub
	System.out.println("132");	
	}
public static void main(String[] args) {
	Hiden_details obj = new Hiden_details();
	obj.name();
	obj.ac_number();
	obj.bank();
	obj.ifsc();
	obj.atmpin();
	obj.cvvnum();
}
}
