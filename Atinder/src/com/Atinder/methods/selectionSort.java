package com.Atinder.methods;

import java.util.Arrays;

public class selectionSort {
  
	        void selectionsort(int arr[]) {
	        	
	             for(int i=0;i<=arr.length-2;i++) {
	            	int min =arr[i];
	            	 int pos=i;
	            	 for(int j=i+1;j<=arr.length-1;j++) {
	            		 if(min>arr[j]) {
	            			 min =arr[j];
	            			 pos=j;
	            			 
	            		 }
	            	 }
	            	 int temp= arr[i];
        			 arr[i]=arr[pos];
        			 arr[pos]=temp;
	             }
	             System.out.println("Elements after Sorting");
	             System.out.println(Arrays.toString(arr));
	        }
}
