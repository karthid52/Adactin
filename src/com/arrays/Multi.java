package com.arrays;

public class Multi {
public static void main(String[] args) {
	
	int a[][]= {{1,2,3}, {6,7,9},{8,9,10}};
	int b[][]= {{5,4,2},{8,9,5},{6,8,7}};
	System.out.println("Addition of two matrix values  are :");
	
	for (int i = 0; i <3; i++) {
		
		for (int j = 0; j <3; j++) {
			System.out.print(a[i][j]+b[i][j]+"  ");
		} 
		    System.out.println();
	}
}
}
