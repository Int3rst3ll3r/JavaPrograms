package com.Atinder.coding;

import java.util.Arrays;
import java.util.Scanner;

public class javaclass3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the length of array");
		int len=s.nextInt();
		int a[] =new int[len];
		for(int i=0;i<a.length;i++) {
		System.out.println("enter the array elements "+i);
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(operation(a)));
			
		}
	
 public static int[] operation(int a[]) {
	 int count =0;
	 int count1=0;
	 int x[]= new int[a.length];
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==0) {
			 count++;
		 }
	 }
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==1) {
			 count1++;
		 }
	 }int i;
	 for(i=0;i<count;i++) {
		 x[i]=0;
	 }
	 for(i=count+1;i<count+count1;i++) {
		 x[i]=1;
	 }
	 return x;
 }
}
