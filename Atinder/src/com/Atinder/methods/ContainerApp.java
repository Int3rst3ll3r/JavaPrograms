package com.Atinder.methods;

import java.util.Scanner;

public class ContainerApp {
       public static void main(String[]args) {
    	   Scanner scan = new Scanner(System.in);
    	   System.out.println("enter the string ");
    	   String s=scan.nextLine();
    	   System.out.println("enter the character to search ");
    	   char g=scan.next().charAt(0);
    	   
    	   Container c = new Container();
    	   System.out.println(c.container(s,g));
       }
}
