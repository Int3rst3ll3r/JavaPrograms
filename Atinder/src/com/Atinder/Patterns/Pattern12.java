package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
//		 * * * * *
//	      * * * *
//	       * * *
//	        * *
//	         *
//	         *
//	        * *
//	       * * *
//	      * * * *
//	     * * * * *
 
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
	      int n =scan.nextInt();
	     for(int i=1;i<=2*n;i++) {
	    	 int totalspaces = i<=n?i-1:2*n-i;
	    	 for(int j=1;j<=totalspaces;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 int totalstar = i<=n?i:1;
	    	 int total = i<=n?n:2*n-(totalspaces+n);
              for(int j=totalstar;j<=total;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	     
	}

}
