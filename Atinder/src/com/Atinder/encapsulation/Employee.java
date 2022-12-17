package com.Atinder.encapsulation;

public class Employee {

	  int id;
	  String name;
	  float height;
	  public Employee(int n,String nam,float m) {
		this.id=n;
		this.name=nam;
		this.height=m;
	}
	  public Employee(int n,String nam) {
		  this(768,"ram",9.09f);
			this.id=n;
			this.name=nam;
			
		}
	  public Employee(int n) {
		  this();
			this.id=n;
			
		}
	  public Employee() {
			super();
		}
	  public void attend() {
		  System.out.println("hello");
	  }
}
