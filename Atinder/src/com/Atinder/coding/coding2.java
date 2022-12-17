package com.Atinder.coding;

import java.util.Scanner;

public class coding2 {
	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            int count=0;
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                int t=x;
	                if(s1.length()<=10){
	                    if(x>0 && x<999){
	               while(t!=0){
	                   int rem=t%10;
	                   t=t-rem;
	                   t=t/10;
	                   count++;
	               }
	               if(count>0){
	                   if(count==1){
	                       System.out.println(s1+"               "+"00"+x);
	                   }
	                   else if(count==2){
	                     System.out.println(s1+"               "+"0"+x);
	                   }
	                   else{
	                   System.out.println(s1+"               "+x);
	                   }
	               } 
	              
	               
	            }
	                }
	            }
	            
	            System.out.println("================================");

	    }
	}


