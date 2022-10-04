package com.Atinder.Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		
//		*********
//	     *******
//	      *****
//	       ***
//	        *
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();int k=n;
		  for(int i=1;i<2*n;i++) {
			  if(i%2!=0) {
				  if(k>=1) {
					  for(int j=k;j<n;j++) {
						  System.out.print("  ");
					  }
					  k--;
					  
						  for(int j=1;j<=2*n-i;j++) {
							  System.out.print("* ");
						  }
					  
				  }
			  }
			  System.out.println();
		  }

	}

}
