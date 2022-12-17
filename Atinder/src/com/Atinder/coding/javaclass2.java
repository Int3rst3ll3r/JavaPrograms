package com.Atinder.coding;

import java.util.Scanner;

public class javaclass2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int len = scan.nextInt();
		int ar[]=new int[len];
		System.out.println("enter the two numbers to swap");
		int a =scan.nextInt();
		int b = scan.nextInt();
		javaclass2.swap(ar,a, b);

	}

	
	public static void swap(int ar[],int a ,int b) {
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
		System.out.println("the numbers are "+a +" and "+ b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("the numbers after swapping are "+a+" and "+b);
	}
}

