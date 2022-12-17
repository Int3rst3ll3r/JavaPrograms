package com.Atinder.DataStructures;

import java.util.Scanner;

public class CircularQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of queue");
		int n =scan.nextInt();
		cirque cq = new cirque(n);
		scan.close();
			while(true) {
				System.out.println("PRESS 1 ------->INSERTING");
				System.out.println("PRESS 2 ------->DELETING");
				System.out.println("PRESS 3 ------->DISPLAY");
				System.out.println("PRESS ANY------>TO GET OUT OF THE PROGRAM");
				int choice= scan.nextInt();
				switch(choice) {
				case 1: cq.insert();
				        break;
				case 2: cq.delete();
				        break;
				case 3: cq.display();
				        break;
			    default:System.exit(0);
				}
			}
			}

}
class cirque{
	   private int arr[];
	   private int count =0;
	   private int front = 0;
	   private int rear=-1;
	   private int size;
	  private  Scanner scan = new Scanner(System.in);
	  public cirque(int a ) {
		  arr= new int[a];
		 size = a;
	}
	    public void insert() {
			System.out.println("Enter the element");
			int elem = scan.nextInt();
			if(count==size-1) {
				System.out.println("Insertion not possible");
			}
			else {
				rear = (rear+1)%size;
				arr[rear]=elem;
				count++;
			}
		}
	    public void delete() {
	    	if(count==0) {
	    		System.out.println("Deletion is not possible,Queue is empty");
	    	}
	    	else {
	    		System.out.println("Element deleted is "+arr[front]);
	    		front = (front+1)%size;
	    		count--;
	    	}
	    }
	    public void display() {
	    	 if(count ==0) {
	    		 System.out.println("Display not possible,Queue is empty");
	    	 }
	    	 else {
	    		 int f1=front;
	    		 for(int i =1;i<=count;i++) {
	    			 System.out.print(arr[f1]+" ");
	    			 f1=(f1+1)%size;
	    		 }
	    		 System.out.println();
	    	 }
	    }
	    }
