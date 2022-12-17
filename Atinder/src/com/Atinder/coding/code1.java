package com.Atinder.coding;

public class code1 {

	public static void main(String[] args) {
		
      for(int i =1;i<=15;i++) {
    	  for(int j=1;j<=14-i;j++) {
    		  System.out.print(" ");
    		  
    	  }
    	  for(int j=2;j<=i;j++){
    		  System.out.print((char)(j+64));
    	  }
    	 for(int j=i;j>0;j--){ 
    		  System.out.print((char)(j+64));
    	  }
    	  System.out.println();
      }
	}
}


