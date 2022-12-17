package com.Atinder.coding;

import java.util.Scanner;

public class MyApi4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int len= scan.nextInt();
		int a[]= new int[len];
		for(int i=0;i<len;i++) {
		System.out.println("enter the element "+i);
		a[i]=scan.nextInt();
		}
		boolean b =MyApi4.minimum(a);
		if(b==true) {
        System.out.println("the maximum element is  prime ");
		}
		else {
	        System.out.println("the maximum element is not prime ");

		}
	}
public static boolean minimum(int arr[]) {
	int max=arr[0];
	int flag=0;
	for(int i=0;i<arr.length-1;i++) {
		if(max<arr[i+1]) {
		  max=arr[i+1];	
		}
	}
	System.out.println("the maximum number is "+max);
	for(int i=2;i<max/2;i++) {
		if(max!=1) {
			if(max!=0) {
		if(max%i==0) {
	    flag=1;
	    break;
	}
		}
	}
}
     if(flag==1) {
    	 return false;
     }
     return true;
}
}
//package com.Atinder.coding;
//
//import java.util.Scanner;
//
//public class MyApi4 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the length of the array");
//		int len= scan.nextInt();
//		int a[]= new int[len];
//		for(int i=0;i<len;i++) {
//		System.out.println("enter the element "+i);
//		a[i]=scan.nextInt();
//		}
//		
//        System.out.println("the minimum element is "+MyApi4.minimum(a));
//	}
//public static int minimum(int arr[]) {
//	int min=arr[0];
//	for(int i=0;i<arr.length-1;i++) {
//		if(min<arr[i+1]) {
//		  min=arr[i+1];	
//		}
//	}
//	
//	return min;
//}
//}
