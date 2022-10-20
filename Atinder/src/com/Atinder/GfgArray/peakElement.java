package com.Atinder.GfgArray;

import java.util.Arrays;
import java.util.Scanner;

public class peakElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[10];
		System.out.println("enter the number of th elements");
		int n = scan.nextInt();
		System.out.println("enter the array elements ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The array is ");
		System.out.println(Arrays.toString(arr));
		int h =peakElement.peakele(arr,n);
		System.out.println("the index of the peak element is "+ h);
		
	
	}
	static int peakele(int arr[],int n) {
		   
	      if(n==0) { return 0; }
	   
	      if(arr[0]>=arr[1]) { return 0; }
	      
	      if(arr[n-1]>=arr[n-2]) { return n-1; }
	      
	      for(int i=1;i<n-1;i++) {
	    	  if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]) {
	    		  return i;
	    	  }
	      }
	   return 0;

}
   }



