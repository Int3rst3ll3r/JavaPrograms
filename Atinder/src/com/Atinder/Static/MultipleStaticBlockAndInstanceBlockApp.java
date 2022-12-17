package com.Atinder.Static;

public class MultipleStaticBlockAndInstanceBlockApp {
	static {
		System.out.println("hey ");
	}
	static {
		System.out.println("how ");
	}
	static {
		System.out.println("are");
	}
	static {
		System.out.println("you ");
	}
	{
		System.out.println("heyah");
	}
	{
		System.out.println("whats");
	}
	{
		System.out.println("up");
	}
	public static void main(String[] args) {
		System.out.println("how are you doing?");
		MultipleStaticBlockAndInstanceBlockApp ms =new MultipleStaticBlockAndInstanceBlockApp();
	}

}
