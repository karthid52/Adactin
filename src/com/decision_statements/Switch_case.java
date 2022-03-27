package com.decision_statements;
import java.util.Scanner;				//import scanner class

public class Switch_case {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);  //scanner object creation
	
     for (int i = 0; i < 12; i++) {		// for loop creation
    	 
    	 System.out.println("please enter the playlist number");
    	 int song=sc.nextInt();			//  scanner return value calling using scanner object
    	 
		switch (song) {					//switch case statement creation with different cases
		case 1:
			System.out.println("you are listening Ilayaraja songs");
			break;
		case 2:
			System.out.println("you are listening AR RAHMAN songs");
			break;
		case 3:
			System.out.println("you are listening YUVAN songs");
			break;
		case 4:
			System.out.println("you are listening HARRIS songs");
			break;
		case 5:
			System.out.println("you are listening VIDHYASAGAR songs");
			break;
		case 6:
			System.out.println("you are listening ANIRUDH songs");
			break;
		case 7:
			System.out.println("you are listening G.V PRAKASH songs");
			break;
		case 8:
			System.out.println("you are listening VIJAYANTONY songs");
			break;
		case 9:
			System.out.println("you are listening IMMAN songs");
			break;
		case 10:
			System.out.println("you are listening THAMAN songs");
			break;



		default:           											// default block of code to be executed
			System.out.println("your entered invalid playlist");
			break;
		}
	}
}
}