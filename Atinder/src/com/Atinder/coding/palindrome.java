package com.Atinder.coding;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int rev=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int a = scan.nextInt();
		while(a!=0) {
        int d = a%10;
	   rev= rev*10+d;
	    a =a/10;
	}
     System.out.println("the reverse of number is "+ rev);
}
}
