package com.polymorphism;

public class Over_rid extends Over_riding {   // over riding parent class extends in child class
	
	
	@Override
	public void pen() {
		// TODO Auto-generated method stub
		super.pen();
	}
	@Override
		public void pen(byte a, int b) {
			// TODO Auto-generated method stub
			super.pen(a, b);
		}
	
	@Override
		public void pen(int a, float b) {
		System.out.println(a);
		
			// TODO Auto-generated method stub
			super.pen(a, b);
		}
	@Override
		public void pen(String c) {
			// TODO Auto-generated method stub
			super.pen(c);
		}
	
	
	public static void main(String[] args) {
		Over_rid obj=new Over_rid();
		obj.pen();
		obj.pen("need blue pen");
		obj.pen(12, 255);
		obj.pen(1222, 568f);
	}
	
}

