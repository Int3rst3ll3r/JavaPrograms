package com.Atinder.coding;

import java.util.Random;
import java.util.Scanner;



public class javaprogram29 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
         String str= scan.nextLine();
         Random rd = new Random();
         String s = Integer.toString(rd.nextInt(10000));
         System.out.println(s);
         int count1=1;
         if(str.length()<3) {
         while(str.length()<3) {
        	 str=0+str; 
         }
         System.out.println(str);
         }
         
         if(s.length()<3) {
        	 while(s.length()<3) {
            	 s=0+s;
             }
             System.out.println(s); 
             }
         if(str.length()>3&&s.length()>3) {
         System.out.println(str.substring(0,3)+s.substring(0,3));
         }
         else if(str.length()==3&&s.length()>3) {
             System.out.println(str+s.substring(0,3));
             }
         else if(str.length()>3&&s.length()==3) {
             System.out.println(str.substring(0,3)+s);
             }
         else {
        	 System.out.println(str+s);
         }
	}
	
}

         



