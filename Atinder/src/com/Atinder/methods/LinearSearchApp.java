package com.Atinder.methods;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.println("enter the length of array");
		      int l = scan.nextInt();
		      int arr[]=new int[l];
		      System.out.println("enter the array elements");
		      for(int i=0;i<l;i++) {
		       arr[i]=scan.nextInt();
		      }
		      System.out.println("enter the key to search ");
		      int key = scan.nextInt();
		      LinearSearch ls = new LinearSearch();
		      int h=  ls.linearsearch(arr, key);
               if(h>=0) { 
            	   System.out.println("key found at index at "+ h);
               }
               else {
            	   System.out.println("key not found  ");
               }
	}

}
