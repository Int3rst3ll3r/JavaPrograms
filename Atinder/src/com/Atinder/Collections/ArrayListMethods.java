package com.Atinder.Collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al =  new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println("al--> "+al);
		System.out.println("---------------------------------------");
		
		ArrayList al1 =  new ArrayList();
		al1.add(600);
		al1.add(700);
		al1.add(800);
		al1.add(900);
		al1.add(1000);
		System.out.println("al1--> "+al1);
		System.out.println("---------------------------------------");
		al.addAll(al1);
		System.out.println("al--> "+al);
		System.out.println("---------------------------------------");
		
		ArrayList al2 =  new ArrayList();
		al2.add(9);
		al2.add(19);
		al2.add(29);
		al2.add(39);
		al2.add(49);
		System.out.println("al2--> "+al2);
		System.out.println("---------------------------------------");
	    al.addAll(3,al2);
		System.out.println("al--> "+al);
		System.out.println("---------------------------------------");
		System.out.println(al.containsAll(al2));
		System.out.println("---------------------------------------");
		System.out.println(al2.contains(99));
		System.out.println("---------------------------------------");
		System.out.println(al2.isEmpty());
		System.out.println("---------------------------------------");
		System.out.println(al2.get(4));
		System.out.println("---------------------------------------");
		System.out.println(al1.remove(4));
		System.out.println("---------------------------------------");
		System.out.println("al1--> "+al1);
		System.out.println("---------------------------------------");
	    System.out.println(al.set(2,al2));
	    System.out.println("---------------------------------------");
	    System.out.println("al--> "+al);
	    System.out.println("---------------------------------------");
	    System.out.println(al.set(2,66));
	    System.out.println("---------------------------------------");
	    System.out.println("al--> "+al);
	    System.out.println("---------------------------------------");
	    System.out.println(al.retainAll(al2));
	    System.out.println("---------------------------------------");
	    System.out.println("al--> "+al);
	    System.out.println("---------------------------------------");
	    System.out.println(al.set(2,999));
	    System.out.println("---------------------------------------");
        System.out.println("al--> "+al);
        System.out.println("---------------------------------------");
        al.addAll(3,al2);
        System.out.println("---------------------------------------");
        System.out.println("al--> "+al);
        System.out.println("---------------------------------------");
        System.out.println(al.set(3,al1));
        System.out.println("---------------------------------------");
        System.out.println("al--> "+al);
        System.out.println("---------------------------------------");
        System.out.println(al.set(3,444));
        System.out.println("---------------------------------------");
        System.out.println("al--> "+al);
	}
}
