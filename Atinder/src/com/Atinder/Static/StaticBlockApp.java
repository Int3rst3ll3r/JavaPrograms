package com.Atinder.Static;

public class StaticBlockApp {

	
	static {
	System.out.println("world");
	
	//Static block always executed beforee the main method 
}
	   
	public static void main(String[] args) {
		System.out.println("hello");

	}

}

