package com.iterato_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_list {
public static void main(String[] args) {
	
	List<Object> a=new ArrayList<Object>();
	a.add(100);
	a.add("java");
	a.add(12.23);
	a.add(true);
	a.add('k');
	System.out.println(a);
	
	Iterator<Object> ab=a.iterator();
	while (ab.hasNext()) {
		System.out.println(ab.next());
	}
	System.out.println("-------------------------------");
	
	
	ListIterator<Object> ac=a.listIterator();
	while (ac.hasNext()) {
		System.out.println(ac.next());
	}
	System.out.println("----------------------------------");
	
	while(ac.hasPrevious()) {
		System.out.println(ac.previous());
	}
}
}  
