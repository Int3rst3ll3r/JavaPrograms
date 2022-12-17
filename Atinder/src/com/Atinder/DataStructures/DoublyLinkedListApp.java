package com.Atinder.DataStructures;

import java.util.Scanner;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dll= new DoublyLinkedList();
			while(true) {
				System.out.println("PRESS 1 ------->INSERTING-REAR");
				System.out.println("PRESS 2 ------->INSERTING-FRONT");
				System.out.println("PRESS 3 ------->DELETING-REAR");
				System.out.println("PRESS 4 ------->DELETING-FRONT");
				System.out.println("PRESS 5 ------->DISPLAY-FORWARD");
				System.out.println("PRESS 6 ------->DISPLAY-REVERSE");
				System.out.println("PRESS ANY------>TO GET OUT OF THE PROGRAM");
			    System.out.println("Enter the choice ");
				int choice= scan.nextInt();
				switch(choice) {
				case 1: dll.insertRear();
				        break;
				case 2: dll.insertFront();
		                break;
				case 3:dll.deleteRear();
				        break;
				case 4:dll.deleteFront();
		               break;
				case 5: dll.displayForward();
				        break;
				case 6: dll.displayReverse();
				        break;
			    default:System.exit(0);
				}
			}

	}

}
class DoublyLinkedList{
	class Node{
		Node prevlink;
		int data;
		Node nextlink;
	}
	Node first;
	Scanner scan = new Scanner(System.in);
	public void insertFront() {
		System.out.println("Enter the element");
		int elem=scan.nextInt();
		Node newnode = new Node();
		newnode.data=elem;
		newnode.nextlink=null;
		newnode.prevlink=null;
		
	if(first==null) {
		first=newnode;
	}
	else {
		newnode.nextlink=first;
		first.prevlink=newnode;
		first=newnode;
	}
	}
	public void insertRear() {
		Node temp;
		System.out.println("Enter element");
		int elem=scan.nextInt();
		Node newnode = new Node();
		newnode.data=elem;
		newnode.nextlink=null;
		newnode.prevlink=null;
		if(first==null) {
			first=newnode;
		}
		else {
			temp=first;
			while(temp.nextlink!=null) {
				temp=temp.nextlink;
			}
			temp.nextlink=newnode;
			newnode.prevlink=temp;
			}
		}
	public void deleteFront() {
		if(first==null) {
			System.out.println("Deletion is not possible");
		}
		else if(first.nextlink==null) {
			System.out.println("Deleted element  is "+first.data);
			first=null;
		}
		else {
			System.out.println("Deleted element is "+first.data);
			first=first.nextlink;
			first.prevlink=null;
		}
	}
	public void deleteRear() {
		if(first==null) {
			System.out.println("Deletion is not possible");
		}
		else if(first.nextlink==null) {
			System.out.println("Deleted element  is "+first.data);
			first=null;
		}
		else {
			Node temp=first;
			while(temp.nextlink.nextlink!=null) {
				temp=temp.nextlink;
			}
			System.out.println("Element deleted is "+temp.nextlink.data);
			temp.nextlink=null;
		}
	}
	public void displayForward() {
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.nextlink==null) {
			System.out.println(first.data);
		}
		else {
			Node temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.nextlink;
			}
		}
		System.out.println();
	}
	public void displayReverse() {
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.nextlink==null) {
			System.out.println(first.data);
		}
		else {
			Node temp=first;
			while(temp.nextlink!=null) {
				temp=temp.nextlink;
			}
			while(temp!=null) {
				System.out.print(temp.data);
				temp=temp.prevlink;
			}
			System.out.println();
		}
	}
}
