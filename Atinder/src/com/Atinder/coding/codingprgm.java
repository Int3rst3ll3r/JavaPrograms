package com.Atinder.coding;

import java.util.Scanner;

public class codingprgm {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
//		System.out.println("enter the string ");
//		String   s = scan.nextLine();
//		System.out.println("enter the string you want to find");
//		String s1= scan.nextLine();
//		
//       
//		for(int i=0;i<=s.length()-1;i++) {
//			  int j =0;
//				 if(s.charAt(j)==s1.charAt(i)) {
//				      j++;
//				      if(j==s1.length()-1) {
//				    	  System.out.println("true");
//				      }
//				 }
//				 else {
//					 j=0;
//				 }
//			
//			}
//		
//		System.out.println("no matching string ");
//     String x="9";
//     x="00"+x;
		System.out.println("enter the number to find fibonacci series ");
		int n = scan.nextInt();
//		System.out.println(codingprgm.fibonacci2(n));  
		codingprgm.fibonacci2(n);
}
	public static int fibonacci(int number) {
		if(number==1|| number==2) {
			return 1;
		}
		return  fibonacci(number-1)+fibonacci(number-2);
	}
	public static void fibonacci2(int number) {
		int fib;
		int fibo1=1,fibo2=1;
		   for(int i=1;i<=2;i++) {
			   System.out.print("1"+" ");
		   }
			for(int i=3;i<=number;i++) {
			fib=fibo1+fibo2;
			System.out.print(fib+" ");
			fibo1=fibo2;
			fibo2=fib;
		}
			
			
		}
		
	}

