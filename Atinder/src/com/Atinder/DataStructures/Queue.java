package com.Atinder.DataStructures;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of queue");
		int n =scan.nextInt();
		Que q = new Que(n);
		scan.close();
			while(true) {
				System.out.println("PRESS 1 ------->INSERTING");
				System.out.println("PRESS 2 ------->DELETING");
				System.out.println("PRESS 3 ------->DISPLAY");
				System.out.println("PRESS ANY------>TO GET OUT OF THE PROGRAM");
				int choice= scan.nextInt();
				switch(choice) {
				case 1: q.insert();
				        break;
				case 2: q.delete();
				        break;
				case 3: q.display();
				        break;
			    default:System.exit(0);
				}
			}
		}
	}


class Que{
	private int size;
	private int que[];
	private int front = 0;
	private int rear =-1;
	private Scanner scan = new Scanner(System.in);
	
	public Que(int n) {
		que = new int[n];
		size= n-1;
	}
	
	public void insert() {
		if(rear==size) {
			System.out.println("Insertion not possible");
		}
		else {
			System.out.println("Enter the element ");
			++rear;
			que[rear]=scan.nextInt();
		}
	}
	public void delete(){
		if(rear==-1|| front>rear) {
			System.out.println("Deletion not possible");
		}
		else {
			System.out.println("Deleted element is "+que[front]);
			++front;
		}
	}
	public void display() {
		if(rear==-1||front>rear) {
			System.out.println("Display not possible");
		}
		else {
			for(int i=front;i<=rear;i++) {
			System.out.print(que[i]+" ");
		}
			System.out.println();
	}
	}
}
