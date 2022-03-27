package com.strings_functions;

public class String_func {
public static void main(String[] args) {
	String me="My Name is Karthi5";
	String my="My Native is Arani";
	
	int a=me.length();
	System.out.println(a);
	
	 boolean b=me.contentEquals(my);
	 System.out.println(b);
	 
	String c= me.toUpperCase();
	System.out.println(c);
	
	String e=me.toLowerCase();
	System.out.println(e);
	
	boolean f=me.startsWith("My");
	System.out.println(f);
	
	boolean g=me.endsWith("karthi");
	System.out.println(g);
	
	boolean h=me.contains("name is");
	System.out.println(h);
	
	int i=my.indexOf('i');
	System.out.println(i);
	
	int j=my.lastIndexOf('i');
	System.out.println(j);
	
	char k=my.charAt(10);
	System.out.println(k);
	
	String l=my.replace("Arani", "Vellore");
	System.out.println(l);
	
	String m=me.substring(8);
	System.out.println(m);
	
	String n=me.substring(5, 12);
	System.out.println(n);
	
	boolean o=me.isEmpty();
	System.out.println(o);
	
	String p=me.trim();
	System.out.println(p);

	String q=me.concat(my);
	System.out.println(q);
	
	int a1=1500;
	String r=me.valueOf(a1);
	System.out.println(r+3);
	
	String[] t= me.split("");
	for (String str : t) {
		System.out.println(str);
		}
	
	int z= me.compareTo(my);
	System.out.println(z);
	
}

}
