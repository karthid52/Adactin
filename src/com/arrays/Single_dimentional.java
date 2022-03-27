package com.arrays;


import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Single_dimentional {
public static void main(String[] args) {
	//int ref[]= {1,2,3,5,6,7,8,9};
int ref[]=new int[5];    //array declaration,instantiation,initialize
	
	ref[0]=10;  			//0 index value assigning
	ref[1]=20;				//1 index value assigning
	ref[2]=30;				//2 index value assigning
	ref[3]=40;				//3 index value assigning
	ref[4]=50;				//4 index value assigning
	
	for (int i = 0; i < ref.length; i++) {    //for loop creation for call array values by using index   where i referred as index number
	System.out.println(ref[i]);	
	
	}
	
	for (int i : ref) {                      // for each loop creation //We can also call the array values by using for each loop
	System.out.println(i);
	}





String a[]= {"karthi","maijn","sdfhk"};
 
List<String> list=Arrays.asList(a);

System.out.println(list);
}
}