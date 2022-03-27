package com.java_programs;

public class Even_number {
		 static int sum=0,count=0;
	public static void main(String[] args) {
	for (int i = 0; i < 39; i++) {
		if (i%2==0) {       // for to print odd numbers if(i%2!=0)  
			System.out.print(i+"  ");
			sum=sum+i;
			count=count+1;
			
		}
	}
		System.out.println("\nsum of even numbers is  :"+sum);
		System.out.println("Total even numbers count is  :"+count);
	}

}
