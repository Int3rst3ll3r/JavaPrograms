package com.Atinder.coding;

import java.util.Scanner;

public class javaclass4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int len=scan.nextInt();
		int len1=scan.nextInt();
		int a[][]= new int[len][len1];
		for(int i=0;i<len;i++) {
			for(int j=0;j<len1;j++) {
			System.out.println("enter element "+(i+1));
			a[i][j]=scan.nextInt();
			}
		}
		javaclass4.checkprime(a);
		}
public static void checkprime(int a[][]) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
		int prime = a[i][j];
		int flag=0;
		for(int k=2;k<=prime/2;k++) {
			if(prime!=0) {
				if(prime!=1) {
					if(prime%k==0) {
						flag=1;
						break;
					}
				}
			}
			break;
		}
		if(flag==1) {
			continue;
		}
		else {
			System.out.println(a[i][j]+" is prime");
		}
	}
	}
}
}

//package com.Atinder.coding;
//
//import java.util.Scanner;
//
//public class javaclass4 {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter the length of the array");
//		int len=scan.nextInt();
//		int a[]= new int[len];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("enter element "+(i+1));
//			a[i]=scan.nextInt();
//			javaclass4.checkprime(a);
//		}
//		}
//public static void checkprime(int a[]) {
//	
//	for(int i=0;i<a.length;i++) {
//		int prime = a[i];
//		int flag=0;
//		for(int j=2;i<=prime/2;i++) {
//			if(prime!=0) {
//				if(prime!=1) {
//					if(prime%j==0) {
//						flag=1;
//						break;
//					}
//				}
//			}
//			break;
//		}
//		if(flag==1) {
//			continue;
//		}
//		else {
//			System.out.println(a[i]+" is prime");
//		}
//	}
//}
//}
