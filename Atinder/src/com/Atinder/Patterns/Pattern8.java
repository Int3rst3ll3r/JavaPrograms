package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

//		    *
//	       ***
//	      *****
//	     *******
//	    *********
		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
	      int n =scan.nextInt();int k=1;
	     for(int i=1;i<=2*n;i++) {
	    	 
	    	 if(i%2!=0) {
	    		 if(k<=n) {
	    	    	 for(int j=k;j<=n-1;j++) {
	    	    		 System.out.print("  ");
	    	    	 }
	    	    	 }
	    	    	 k++;
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 
	     }
	    	 System.out.println(); 
	     }


	}

}
