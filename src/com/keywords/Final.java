package com.keywords;

public final class Final {				// Using final key word we cannot overriden the class
public final void name() {				// Using final key word we cannot overload the method
	// TODO Auto-generated method stub
System.out.println("MY NAME IS KARTHI");
}

public void id_number() {
	// TODO Auto-generated method stub
final int a=12356;						// Using final key word we cannot change  the variable value
System.out.println("MY ID NUMBER IS");
System.out.println(a);
}
static public  void main(String[] args) {
	Final obj = new Final();
	obj.name();
	obj.id_number();
}
}
