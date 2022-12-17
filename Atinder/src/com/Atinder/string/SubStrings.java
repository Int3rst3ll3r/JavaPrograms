package com.Atinder.string;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		char []ch = s.toCharArray();
		for(int k=0;k<s.length();k++) {
		for(int i=0;i<=s.length()-1;i++){
			for(int j=k;j<=i;j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		}
		for(int i=0;i<=s.length()-1;i++){
			String temp=" ";
			for(int j=i;j<=s.length()-1;j++) {
				temp=temp+ch[j];
				System.out.println(temp);
			}
			System.out.println();
		}

	}

}
