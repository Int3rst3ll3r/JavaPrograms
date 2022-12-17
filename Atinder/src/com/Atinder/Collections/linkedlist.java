package com.Atinder.Collections;


import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		System.out.println("ll--> "+ll);
		System.out.println("---------------------------------------");
		
		LinkedList ll1 =  new LinkedList();
		ll1.add(600);
		ll1.add(700);
		ll1.add(800);
		ll1.add(900);
		ll1.add(1000);
		System.out.println("ll1--> "+ll1);
		System.out.println("---------------------------------------");
		ll.addAll(ll1);
		System.out.println("ll--> "+ll);
		System.out.println("---------------------------------------");
		
		LinkedList ll2 =  new LinkedList();
		ll2.add(9);
		ll2.add(19);
		ll2.add(29);
		ll2.add(39);
		ll2.add(49);
		System.out.println("ll2--> "+ll2);
		System.out.println("---------------------------------------");
	    ll.addAll(3,ll2);
		System.out.println("ll--> "+ll);
		System.out.println("---------------------------------------");
		System.out.println(ll.containsAll(ll2));
		System.out.println("---------------------------------------");
		System.out.println(ll2.contains(99));
		System.out.println("---------------------------------------");
		System.out.println(ll2.isEmpty());
		System.out.println("---------------------------------------");
		System.out.println(ll2.get(4));
		System.out.println("---------------------------------------");
		System.out.println(ll1.remove(4));
		System.out.println("---------------------------------------");
		System.out.println("ll1--> "+ll1);
		System.out.println("---------------------------------------");
	    System.out.println(ll.set(2,ll2));
	    System.out.println("---------------------------------------");
	    System.out.println("ll--> "+ll);
	    System.out.println("---------------------------------------");
	    System.out.println(ll.set(2,66));
	    System.out.println("---------------------------------------");
	    System.out.println("ll--> "+ll);
	    System.out.println("---------------------------------------");
	    System.out.println(ll.retainAll(ll2));
	    System.out.println("---------------------------------------");
	    System.out.println("ll--> "+ll);
	    System.out.println("---------------------------------------");
	    System.out.println(ll.set(2,999));
	    System.out.println("---------------------------------------");
        System.out.println("ll--> "+ll);
        System.out.println("---------------------------------------");
        ll.addAll(3,ll2);
        System.out.println("---------------------------------------");
        System.out.println("ll--> "+ll);
        System.out.println("---------------------------------------");
        System.out.println(ll.set(3,ll1));
        System.out.println("---------------------------------------");
        System.out.println("ll--> "+ll);
        System.out.println("---------------------------------------");
        System.out.println(ll.set(3,444));
        System.out.println("---------------------------------------");
        System.out.println("ll--> "+ll);

	}

}
