package com.control_statements;

public class Nested_forloop {
	
	
	
	public static void main(String[] args) {
		
		int a[][]= {{7,8,9,10},{4,5,6
			},{2,3,7,9},{1,9,7,5}};
		int b[][] = new int[4][4];
		
		for (int row= 0; row < 4; row++) {
			
			
			for (int col = 0; col <4; col++) {
				
				 b[row][col]=a[row][col];
				 System.out.print(b[row][col]+"   ");	
			}
			System.out.println();
		}
		
				
		
	
	}

}
