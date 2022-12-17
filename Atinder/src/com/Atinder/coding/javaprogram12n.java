package com.Atinder.coding;

import java.util.Scanner;

//basic calculator 
public class javaprogram12n {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number a ");
		int a =scan.nextInt();
		System.out.println("Enter the number b ");
		int b =scan.nextInt();
		javaprogram12n java = new javaprogram12n();
		while(true){
			System.out.println("PRESS 1 FOR ADDITION");
			System.out.println("PRESS 2 FOR SUBSTRACTION");
			System.out.println("PRESS 3 FOR DIVISION");
			System.out.println("PRESS 4 FOR MULTIPLICATION");
			System.out.println("PRESS ANY TO STOP");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 :System.out.println(java.add(a,b));
			break;
			case 2 :System.out.println(java.sub(a,b));
			break;
			case 3 :System.out.println(java.div(a,b));
			break;
			case 4 :System.out.println(java.mul(a,b));
			break;
			default: System.exit(0);
			}
		}
		
	}

	public int add(int a,int b) {
		int c = a+b;
		return c;
		
	}
	public int sub(int a,int b) {
		int c = a-b;
		return c;
		
	}
	public float div(int a,int b) {
		if(a!=0) {
		float c = (float)a/b;
		return c;
		}
		return 0;
		
	}
	public int mul(int a,int b) {
		int c = a*b;
		return c;
		
	}
}
