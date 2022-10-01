package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
//		*
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
	      int n =scan.nextInt();
	      int g;
	     for(int i=1;i<=2*n;i++) {
	    	 if(i<=n) {
	    		  g=i;
	    	 }
	    	 else {
	    		 g=2*n-i;
	    	 }
	    	 for(int j=1;j<=g;j++) {
	    		 System.out.print("* ");
	    	 }
	    	System.out.println();
	     }

	}

}
