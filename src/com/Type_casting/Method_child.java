package com.Type_casting;

public class Method_child extends Method_upcasting {

	
public void mom() {
	// TODO Auto-generated method stub
System.out.println("karpagam");
}
	
	public static void main(String[] args) {
		Method_upcasting obj=new Method_child();  //object upcasting  // parentclass objectname= new childclaass();
	obj.yourname();
	obj.bro();
	}
}
