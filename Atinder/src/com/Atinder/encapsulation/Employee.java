package com.Atinder.encapsulation;

public class ConstructorOverloading {

	  int id;
	  String name;
	  float height;
	  public ConstructorOverloading(int n,String nam,float m) {
		this.id=n;
		this.name=nam;
		this.height=m;
	}
	  public ConstructorOverloading(int n,String nam) {
		  this(768,"ram",9.09f);
			this.id=n;
			this.name=nam;
			
		}
	  public ConstructorOverloading(int n) {
		  this();
			this.id=n;
			
		}
	  public ConstructorOverloading() {
			super();
		}
}
