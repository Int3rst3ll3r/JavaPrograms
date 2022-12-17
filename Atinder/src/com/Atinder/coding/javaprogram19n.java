package com.Atinder.coding;

import java.util.Arrays;
import java.util.Scanner;
//write a java program to create an one dimensional array called as rollno  
//you need to accept number of students(size of array) from user . the user should then enter roll no of all the students 
// all the odd rollno should be kept in different array called as oddroll and even shoul be stored in different array called as evenroll
//print all the three arrays
public class javaprogram19n{
public static void main(String[] args) {
	       Scanner  scan = new Scanner(System.in);
	        javaprogram19n java = new javaprogram19n();
	        System.out.println("Enter the number of the Students");
	        int len = scan.nextInt();
            int rollno[]= new int[len];
            for(int i=0;i<rollno.length;i++) {
            	System.out.println("Enter the rollno of the students "+(i+1));
            	rollno[i]= scan.nextInt();
            }
           int oddroll[] = new int[rollno.length];
           int evenroll[] = new int[rollno.length];
           int j=0;
           int k =0;
           for(int i=0;i<rollno.length;i++) {
        	   if(rollno[i]%2!=0) {
        		   oddroll[j]=rollno[i];
        		   j++;
        	   }
            else {
        		   evenroll[k]=rollno[i];
        		   k++;
        	   }
           }
           System.out.println("Roll numbers of students are");
           for(int i=0;i<rollno.length;i++) {
        	   System.out.print(rollno[i]+" ");
           } 
           System.out.println();
           System.out.println("Odd roll numbers are ");
           for(int i=0;i<j;i++) {
        	   System.out.print(oddroll[i]+" ");
           }
           System.out.println();
           System.out.println("Even roll numbers are ");
           for(int i=0;i<k;i++) {
        	   System.out.print(evenroll[i]+" ");
           }
           System.out.println();
      
}
}

//package com.Atinder.coding;
//
//import java.util.Scanner;
//create a java application it must contain a method called ass acceptinput() 
//the acceptinput method must be capable of taking eight values from user of different data type
////another method display must be able to all the eight inputs given by user
//public class javaprogram19n {
//	byte age;
//	short year ;
//	int distance;
//	long displnt;
//	float pi;
//    double pi1;
//	boolean b;
//	char c;
//public  void acceptInput() {
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter the age(byte)");
//	age =scan.nextByte();
//	System.out.println("Enter the year(short)");
//	year =scan.nextShort();
//	System.out.println("Enter the distance between two states(Int)");
//	distance =scan.nextInt();
//	System.out.println("Enter the distance between two planets(long)");
//	displnt =scan.nextLong();
//	System.out.println("Enter the value of pi(float)");
//	pi =scan.nextFloat();
//	System.out.println("Enter the value of pi(double)");
//	pi1 =scan.nextDouble();
//	System.out.println("Enter the boolean value(boolean)");
//	b =scan.nextBoolean();
//	System.out.println("Enter a vowel(char)");
//	c =scan.next().charAt(0);
//	scan.close();
//}
//public void display() {
//	System.out.println("the age(byte)"+" "+age);
//	System.out.println("the year(short) "+year);
//	System.out.println("the distance between two states(Int) "+distance);
//	System.out.println("the distance between two planets(long) "+displnt);
//	System.out.println("the value of pi(float) "+pi);
//	System.out.println("the value of pi(double) "+pi1);
//	System.out.println("the boolean value(boolean) "+b);
//	System.out.println("vowel(char) "+c);
//}
//public static void main(String[] args) {
//	        javaprogram19n java = new javaprogram19n();
//	        java.acceptInput();
//	        java.display();
//}
//}
