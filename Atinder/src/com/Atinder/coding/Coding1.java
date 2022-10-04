package com.Atinder.coding;

import java.util.Scanner;

public class Coding1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the upSpeed");
	     a = scan.nextInt();
	     System.out.println("enter the downSpeed");
	     b = scan.nextInt();
	     System.out.println("enter the desiredHeight");
	     c = scan.nextInt();
	     int count=0;
	     int temp =0;
	    while(c>=temp) {
	    	 int d =temp+a;
	    	  temp =d-b;
	    	 
	    	 count++;
	     }
	     System.out.println("the result is  "+ count);
		

	}

}
