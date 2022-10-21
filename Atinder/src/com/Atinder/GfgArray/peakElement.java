package com.Atinder.GfgArray;

import java.util.Arrays;
import java.util.Scanner;

public class peakElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[] {2,5,6,3,7,9,5,3,8};
//		System.out.println("enter the number of the elements");
//		int n = scan.nextInt();
//		System.out.println("enter the array elements ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
		int  n=arr.length;
		System.out.println("The array is ");
		System.out.println(Arrays.toString(arr));
		int h =peakElement.peakele(arr,n);
		System.out.println("the index of the peak element is "+ h);
		int k =peakElement.peakele2(arr,n,0,n-1);
		System.out.println("the index of the peak element is "+ k);
		
	
	}
	//Binary Search is correct one
	static int peakele2(int arr[],int n,int low,int high ) {
		while(low<=high) {
		int mid=(low+high)/2;
	   if((mid==0||arr[mid]>=arr[mid+1])&&(mid==n-1||arr[mid]>=arr[mid-1])) 
		   return mid;
	   else if((mid>0&&arr[mid]<arr[mid+1])) {
	      return peakele2(arr,n,mid+1,high);
	    	  }
	   else {
				
		  return peakele2(arr,n,low,mid-1);
			}
		}
		return 0;
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



