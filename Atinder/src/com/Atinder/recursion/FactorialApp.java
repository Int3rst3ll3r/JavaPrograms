package com.Atinder.recursion;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int a = scan.nextInt();
		

		Factorial g= new Factorial();
		System.out.println("Factorial ");
		System.out.println(g.factorial(a));

	}

}
