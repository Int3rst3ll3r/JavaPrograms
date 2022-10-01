package com.Atinder.methods;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      
	      System.out.println("enter the length of array");
	      int l = scan.nextInt();
	      int arr[]=new int[l];
	      System.out.println("enter the array elements");
	      for(int i=0;i<l;i++) {
	       arr[i]=scan.nextInt();
	      }
	      //using bubbleosrt to sort the array 
	      for(int i=0;i<=arr.length-2;i++) {
	    	  for(int j=0;j<=arr.length-2-i;j++) {
	    		  if(arr[j]>arr[j+1]) {
	    			  int temp=arr[j];
	    			  arr[j]=arr[j+1];
	    			  arr[j+1]=temp;
	    		  }
	    	  }
	      }
	      System.out.println("enter the key to search ");
	      int key = scan.nextInt();
	      
	      binarySearch bs = new binarySearch();
	      int h = bs.binarysearch(arr,key);
	      if(h>=0) { 
       	   System.out.println("Element found at index at "+ h);
          }
          else {
       	   System.out.println("Element not found ! have a Look at the array  ");
       	   System.out.println(Arrays.toString(arr));
          }


	}

}
