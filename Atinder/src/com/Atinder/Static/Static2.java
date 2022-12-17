package com.Atinder.Static;

public class Static2 {

	static int x ;
	static int y;
	static int  z;
	
	static {
		x=100;
		y=200;
		z=300;
//		i=1000;  //Cannot make static reference to non- static field
//		j=2000;  //as it is static block we really cannot put instance varaiable into static block because staic block executed before the objection creation or can say before the memory assigned to instance varaible 
//		k=3000;
	}
	static void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	int i;
	int j;
	int k;

	{
		i=1000;
		j=2000;
		k=3000;
		x=4000;
		y=5000;
		z=6000;
		
	}
	
	
	void display1() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
