package com.Atinder.recursion;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = scan.nextInt();
		System.out.println("enter the first number");
		int b = scan.nextInt();

		GCD g= new GCD();
		System.out.println("GCD of two numbers ");
		System.out.println(g.gcd(a,b));
	}

}
