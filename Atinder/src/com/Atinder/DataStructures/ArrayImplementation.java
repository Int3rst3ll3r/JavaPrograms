package com.Atinder.DataStructures;

import java.util.Scanner;

public class ArrayImplementation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = scan.nextInt();
		Array ai = new Array(n);
		while(true) {
			System.out.println("PRESS 1 ------->INSERTING");
			System.out.println("PRESS 2 ------->DELETING");
			System.out.println("PRESS 3 ------->DISPLAY");
			System.out.println("PRESS ANY------>TO GET OUT OF THE PROGRAM");
			int choice= scan.nextInt();
			switch(choice) {
			case 1: ai.insert();
			        break;
			case 2: ai.delete();
			        break;
			case 3: ai.display();
			        break;
		    default:System.exit(0);
			}
		}

	}

}
class Array{
	private int arr[];
	private Scanner scan = new Scanner(System.in);
	
	public Array(int a ) {
		arr = new int[a];
	}
	public void insert() {
		System.out.println("Enter the position from 0 to "+(arr.length-1 ));
		int pos = scan.nextInt();
		System.out.println("Enter the element to insert at position "+pos);
		arr[pos]=scan.nextInt();
	}
	public void delete() {
		System.out.println("Enter the position to delete the element ");
		int pos  = scan.nextInt();
		System.out.println("Deleted element is "+arr[pos]);
		arr[pos]=0;
	}
	public void display() {
		System.out.print("The array is  ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
