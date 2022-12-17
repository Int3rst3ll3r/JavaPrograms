package com.Atinder.coding;

import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Strings");
		 String s=scan.nextLine();
		 romannumbers rm = new romannumbers();
		 System.out.println("Entered Roman number is");
		System.out.println( rm.romanToInt(s));
		scan.close();
         }
	}


class romannumbers{
	Scanner scan = new Scanner(System.in);
	public int getvalue(char  c) {
		int value=0;
		if(c=='I') {
			 value= 1;
		}
		else if(c=='V') {
			value= 5;
		}
		else if(c=='X') {
			value= 10;
		}
		else if(c=='L') {
			value= 50;
		}
		else if(c=='C') {
			value= 100;
		}
		else if(c=='D') {
			value= 500;
		}
		else if(c=='M') {
			value= 1000;
		}
		return value;
	}
	public int romanToInt(String s) {
		int result =0;
		for(int i=0;i<s.length();i++) {
	        	char c = s.charAt(i);
	        	int r = getvalue(c);
	        	 if(i<s.length()-1&&r<getvalue(s.charAt(i+1))) {
					 result= result-r;
				 }
	        	 else {
	        		 result= result+r;
	        	 }
	}
		return result;
	}
		 
}

