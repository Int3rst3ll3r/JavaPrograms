package com.Atinder.methods;
import java.util.*;
public class GCDApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number ");
		int a =scan.nextInt();
		System.out.println("enter the second number ");
		int b =scan.nextInt();
		GCD g = new GCD();
		System.out.println(g.gcd(a,b));

	}

}
