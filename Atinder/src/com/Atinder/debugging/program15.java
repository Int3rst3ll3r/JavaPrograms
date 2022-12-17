package com.Atinder.debugging;

public class program15 {

	public static void main(String[] args) {
		Alpha alpha = new Beta();
		alpha.a = 10;
//		alpha.display();
		}
	}


	class Alpha
	{
	int a = 50;
	Alpha()
	{
	a = 50+50;
	}
	public void manage()
	{
	System.out.println(a);
	}
	}
	class Beta extends Alpha
	{
	public void manage()
	{
	System.out.println(a*a);
	}
	public void display()
	{
	System.out.println(a+25);
	}
	}


