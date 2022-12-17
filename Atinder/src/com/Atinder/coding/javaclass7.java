package com.Atinder.coding;

import java.util.Scanner;

public class javaclass7 {

	public static void main(String[] args) {
   try {
	   calci c = new calci();
	   Thread t1= new Thread(c);
	   Thread t2= new Thread(c);
	   Thread t3= new Thread(c);
	   t1.setName("Calculator1");
	   t2.setName("Calculator2");
	   t3.setName("Calculator3");
	   t1.start();
	   t2.start();
	   t3.start();
   }
   catch (Exception e) {
	    e.printStackTrace();
}
	}

}
class  calci implements Runnable{

	synchronized public  void run() {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number  for thread   "+Thread.currentThread().getName());
				int a = scan.nextInt();
				System.out.println("Enter the number for thread  "+Thread.currentThread().getName());
				int b = scan.nextInt();
				int c =a+b;
				System.out.println("The sum is "+c+" of thread "+Thread.currentThread().getName());
				System.out.println("The numbers for a and b for "+Thread.currentThread().getName()+" is "+a+ " "+b);
	}
	
}
