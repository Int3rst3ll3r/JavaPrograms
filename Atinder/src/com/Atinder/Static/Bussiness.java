package com.Atinder.Static;

import java.util.Scanner;

public class Bussiness {

	
	   private int p;
	   private int t;
	   static int r=2;
	   float SI;
	   public void takeinput() {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the principle amount");
		   p = sc.nextInt();
		   System.out.println("Enter the time period");
		   t = sc.nextInt();
		   
	   }
	   
	   public void calculate() {
		    SI = p*r*t*0.001f;
	   }
	   public void output() {
		   System.out.println("Simple Interest is  "+ SI);
	   }
}
