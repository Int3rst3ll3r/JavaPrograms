package com.Atinder.methods;

public class LinearSearch {
   
	          int  linearsearch(int arr[],int k) {
	        	  for(int i=0;i<arr.length;i++) {
	        	  if(k==arr[i]) {
	        		  return i;
	        	  }
	        	  }
	        	  return -9;
	          }
}
