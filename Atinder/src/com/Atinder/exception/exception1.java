package com.Atinder.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers ");
		int a=0,b=0;
		try {
		 a = scan.nextInt();
	     b = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("exception caught");
		}
		int c=0;
		try {
		 c =a/b;
		 System.out.println(c); 
		}
		catch (ArithmeticException e) {
			System.out.println("exception caught");
		}
		
		finally {
			scan.close();	
		}
		
	}

}
