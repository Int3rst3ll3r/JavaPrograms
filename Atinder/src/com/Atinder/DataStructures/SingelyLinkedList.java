package com.Atinder.DataStructures;

import java.util.Scanner;

public class SingelyLinkedList {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList ll= new LinkedList();
			while(true) {
				System.out.println("PRESS 1 ------->INSERTING-REAR");
				System.out.println("PRESS 2 ------->INSERTING-FRONT");
				System.out.println("PRESS 3 ------->INSERTING-Nth POSITION");
				System.out.println("PRESS 4 ------->DELETING-REAR");
				System.out.println("PRESS 5 ------->DELETING-FRONT");
				System.out.println("PRESS 6 ------->DELETING-Nth POSITION");
				System.out.println("PRESS 7 ------->DISPLAY");
				System.out.println("PRESS ANY------>TO GET OUT OF THE PROGRAM");
			    System.out.println("Enter the choice ");
				int choice= scan.nextInt();
				switch(choice) {
				case 1: ll.insertRear();
				        break;
				case 2: ll.insertFront();
		                break;
				case 3: System.out.println("Enter the Nth position");
					         ll.insertNpos(scan.nextInt());
                             break;
				case 4: ll.deleteRear();
				        break;
				case 5: ll.deleteFront();
		               break;
				case 6:  System.out.println("Enter the Nth position");
				              ll.deleteNpos(scan.nextInt());
	                          break;
				case 7: ll.display();
				        break;
			    default:System.exit(0);
				}
			}
	}
}
class LinkedList{
	class Node{
		int data;
	    Node link;
	}
	 Node first;
	 Scanner scan = new Scanner(System.in);
	 public void insertRear() {
		 System.out.println("Enter an element");
		 int elem = scan.nextInt();
		 Node newnode= new Node();
		 newnode.data=elem;
		 newnode.link=null;
		  if(first==null) {
			  first=newnode;
		  }
		  else {
			   Node temp =first;
			  while(temp.link!=null) {
				  temp=temp.link;
			  }
			  temp.link=newnode;
		  }
	 }
	 public void deleteRear() {
		 if(first==null) {
			 System.out.println("Deletion not possible,because LinkedList is empty");
		 }
		 else if(first.link==null){
			 first = null;	 
			 }
		 else {
			 Node temp=first;
			 while(temp.link.link!=null) {
				 temp=temp.link;
			 }
			 System.out.println("The deleted element is "+temp.link.data);
			 temp.link=null;
		 }
	 }
	 public void insertFront() {
		 System.out.println("Enter an element");
		 int elem = scan.nextInt();
		 Node newnode= new Node();
		 newnode.data=elem;
		 newnode.link=null;
		  if(first==null) {
			  first=newnode;
		  }
		  else {
			  newnode.link=first;
			 first=newnode;
		  }
	 }
	 public void insertNpos(int n) {
		 int size = sizeofLinkedList();
		 if(n<1||n>size) {
			 System.out.println("Cannot insert the elements ");
		 }
		 else {
			 System.out.println("Enter an element");
			 int elem = scan.nextInt();
			 Node newnode= new Node();
			 newnode.data=elem;
			 newnode.link=null;
			 Node temp=first;
			 while(--n>0) {
				 temp = temp.link;
			 }
			 newnode.link=temp.link;
             temp.link=newnode;
		 }
	 }
	 public void deleteFront() {
		 if(first==null) {
			 System.out.println("Deletion not possible,because LinkedList is empty");
		 }
		 else if(first.link==null){
			 first = null;	 
			 }
		 else {
			 System.out.println("The deleted element is "+first.data);
			 first=first.link;
		 }
	 }
	 public int sizeofLinkedList() {
		 int size=0;
		 Node temp=first;
		 while(temp!=null) {
			 temp=temp.link;
			 size++;
		 }
		 return size;
	 }
	 public void deleteNpos(int n) {
		 int size = sizeofLinkedList();
		 if(n<1||n>size) {
			 System.out.println("Deletion is not possibel");
		 }
		 else if(n==1) {
			 first=null;
		 }
		 else {
			 Node temp = first;
			 Node previous = null;
			 while(--n>0) {
				 previous=temp;
				temp=temp.link;
			 }
			 previous.link=temp.link;
		 }
	 }
	 public void display() {
		if(first==null) {
			System.out.println("Display not possibe,Linked list is empty");
		}
		else {
			Node temp=first;
			while(temp!=null) {
				System.out.print(temp.data+"  ");
				temp=temp.link;
			}
		}
		System.out.println();
	}
}
