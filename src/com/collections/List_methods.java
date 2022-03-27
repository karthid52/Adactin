package com.collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_methods {
	public static void main(String[] args) {
		List<Object> a=new ArrayList<Object>();
		List<Object> b=new ArrayList<Object>();
		
		List<Object> aa=new LinkedList<Object>();
		//List aa=new LinkedList();
		a.add(29);
		a.add(15.5);
		a.add("karthi");
		a.add("java");
		a.add(true);
		a.add(29);
	
		
		b.add(98);
		b.add("kumaran");
		b.add("music");
		b.add(false);
		b.add(29);
		b.add(15.5);
		
		aa.add(85);
		aa.add("foodball");
		aa.add(15.5);
		aa.add('c');
		aa.add("cricket");
		
		
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.get	(5));
		a.set(3, "Selenium");
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		int b1=a.indexOf("karthi");
		System.out.println(b1);
		
		boolean c=a.contains(29);
		System.out.println(c);
		
		a.clear();
		
		System.out.println(a);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
		a.retainAll(b);
		System.out.println(a);
		
		a.removeAll(b);
		System.out.println(a);
		
		a.removeAll(b);
		System.out.println(a);
		
		
		System.out.println(aa);
		
		
		
		
		
		
		
		
	}

}
