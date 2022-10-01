package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		
//		*****
//	    ****
//	    ***
//	    **
//	    *

		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
	      int n =scan.nextInt();
	     for(int i=0;i<n;i++) {
	    	 for(int j=i;j<n;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	}

}
