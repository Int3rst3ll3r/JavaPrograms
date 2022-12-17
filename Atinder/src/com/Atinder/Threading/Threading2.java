package com.Atinder.Threading;
import java.util.Scanner;

public class Threading2 {
	
public static void main(String[] args) {
			Demo d1 = new Demo();
			Demo d2 = new Demo();
			Demo d3 = new Demo();
			Demo d4 = new Demo();
			
			Thread t1= new Thread(d1);
			Thread t2= new Thread(d2);
			Thread t3= new Thread(d3);
			Thread t4= new Thread(d4);
			t1.setName("ADD");
			t2.setName("SUB");
			t3.setName("MUL");
			t4.setName("DIV");
			t1.start();
			t2.start();
			t3.start();
			t4.start();

		}

	}
	class Demo implements Runnable{
		Scanner scan = new Scanner(System.in);
		public void run() {
			if(Thread.currentThread().getName().equals("ADD")) {
				add();
			}
			else if(Thread.currentThread().getName().equals("SUB")) {
				sub();
			}
			else if(Thread.currentThread().getName().equals("MUL")) {
				mul();
			}
			else {
				div();
			}
		}
		public void add() {
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
		public void sub() {
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
		public void mul() {
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
		public void div() {
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


