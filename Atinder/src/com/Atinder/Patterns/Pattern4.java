package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {


//		    1
//		    1 2
//		    1 2 3
//		    1 2 3 4
//		    1 2 3 4 5
		
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
	      int n =scan.nextInt();
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print(j+" ");
	    	 }
	    	 System.out.println();
	     }

	}

}
