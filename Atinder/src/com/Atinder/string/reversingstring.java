package com.Atinder.string;
import java.util.Scanner;

public class reversingstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String  s =scan.nextLine();
		char a[]= s.toCharArray();
		char a1[]= new char[a.length];
		for(int i=0;i<a.length;i++) {
			a1[i]=a[a.length-i-1];
		}
		System.out.println(a1);
	     s = new String(a1);
		System.out.println(s);
	}

}
