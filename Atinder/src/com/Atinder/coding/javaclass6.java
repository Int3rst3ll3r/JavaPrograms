package com.Atinder.coding;

import java.util.Scanner;

public class javaclass6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyApi m = new MyApi();
		System.out.println("enter the string");
		String str = scan.nextLine();
		int h =m.count(str);
		System.out.println("enter the character");
		char ch = scan.next().charAt(0);
        int g= m.count(str,ch);
        System.out.println("The length of the string is "+h);
        System.out.println("The count of the letter "+ "'"+ch+"'"+" in the string is "+g);
	}

}

class MyApi{
	public int count(String str) {
		int len = str.length();
		return len;
	}
	public int count(String str,char ch) {
		int count=0;
		char []ar = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ar[i]==ch) {
				count++;
			}
		}
		return count;
	}
	
}
