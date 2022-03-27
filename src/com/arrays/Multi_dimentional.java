package com.arrays;

public class Multi_dimentional {
public static void main(String[] args) {
	int mat[][]=new int[2][2]; 	        // multi dimensional array creation
	mat[0][0]=15;                   // multi dimensional array values assigning using row an column concept [0,0]
	mat[0][1]=18;					// multi dimensional array values assigning using row an column concept [0,1]
	mat[1][0]=30;					// multi dimensional array values assigning using row an column concept [1,0]
	mat[1][1]=10;					// multi dimensional array values assigning using row an column concept [1,1]
	for (int i = 0; i < mat.length; i++) {    // where length refer to how many row in i index 
		
		for (int j = 0; j < mat.length; j++) {  //// where length refer to how many column in j index 
			System.out.print(mat[i][j]+"  ");   // 1st outer loop print then + "  " print then inner loop print + "  " print
		}
		System.out.println(); // println for  to get next line in console
	}
}
}
