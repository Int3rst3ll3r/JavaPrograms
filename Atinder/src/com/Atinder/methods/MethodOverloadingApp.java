package com.Atinder.methods;

public class MethodOverloadingApp {

	public static void main(String[] args) {
		   int a=10,b=20,c=30,d=40;
		   float e=10.8f,f=4.56f,g=98.78f;
		   double h=3.456,i=90.786;
		   
            
		   MethodOverloading mo = new MethodOverloading();
		  System.out.println(mo.add(h,a,c)); 
		  System.out.println(mo.add(a,f)); 
	}

}
