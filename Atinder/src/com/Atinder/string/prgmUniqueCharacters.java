package com.Atinder.string;

import java.util.Scanner;

public class prgmUniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a string");
	      String s= scan.nextLine();
	      char a[]= s.toCharArray();
	      boolean b[]= new boolean[a.length];
	      for(int i=0;i<a.length-1;i++) {
	    	  if(a[i]==a[i+1]) {
	    		 b[i]= true;
	    	  }
	    	  else {
	    		  b[i]=false;
	    	  }
	      }
	     for(int i=0;i<b.length;i++) {
	    	 if(b[i]==false) {
	    		 System.out.println("All unique characters");
	    	 }
	    	 System.out.println("Not all unique chracters");
	     }
	}

}
