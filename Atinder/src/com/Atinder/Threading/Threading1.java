package com.Atinder.Threading;

import java.util.Scanner;

public class Threading1 {

	public static void main(String[] args) {
		demo1 d1 = new demo1();
		demo2 d2 = new demo2();
		demo3 d3 = new demo3();
		demo4 d4 = new demo4();
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();

	}

}
class demo1 extends Thread{
	Scanner scan = new Scanner(System.in);
	public void run() {
		try {
		System.out.println("enter a number");
		int a =  scan.nextInt();
		System.out.println("enter another number");
		int b =  scan.nextInt();
		Thread.sleep(5000);
		int c = a+b;
		System.out.println("the addition of the numbers is "+ c);

		}
		catch (Exception e) {
			System.out.println("Not valid input");
		}
	}
	}

class demo2 extends Thread{
	Scanner scan = new Scanner(System.in);
	public void run() {
		try {
		System.out.println("enter a number");
		int a =  scan.nextInt();
		System.out.println("enter another number");
		int b =  scan.nextInt();
		Thread.sleep(5000);
		int c = a-b;
		System.out.println("the substraction of the numbers is "+ c);

		}
		catch (Exception e) {
			System.out.println("Not valid input");
		}
	}
	}

class demo3 extends Thread{
	Scanner scan = new Scanner(System.in);
	public void run() {
		try {
		System.out.println("enter a number");
		int a =  scan.nextInt();
		System.out.println("enter another number");
		int b =  scan.nextInt();
		Thread.sleep(5000);
		int c = a*b;
		System.out.println("the multiplication of the numbers is "+ c);
		}
		catch (Exception e) {
			System.out.println("Not valid input");
		}
	}
	}

class demo4 extends Thread{
	Scanner scan = new Scanner(System.in);
	public void run() {
		try {
		System.out.println("enter a number");
		int a =  scan.nextInt();
		System.out.println("enter another number");
		int b =  scan.nextInt();
		Thread.sleep(5000);
		int c = a/b;
		System.out.println("the division of the numbers is "+ c);
		}
		catch (Exception e) {
			System.out.println("Not valid input");
		}
	}
	}