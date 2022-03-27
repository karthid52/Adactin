package com.java_programs;

public class Butterfly {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int len=a.length/2;
	for (int i = len-1; i >=0; i--) {
		System.out.println(a[i]);
		
	}
	for (int i = len; i <a.length; i++) {
		System.out.println(a[i]);
		
	}
}
}
