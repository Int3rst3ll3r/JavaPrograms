package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {


//		 * * * * *
//	      * * * *
//	       * * *
//	        * *
//	         *
		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
	      int n =scan.nextInt();
	     for(int i=0;i<n;i++) {
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int j=i;j<n;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }

	}

}
