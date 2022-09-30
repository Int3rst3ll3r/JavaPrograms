package com.Atinder.encapsulation;

public class Constructor {
	 private int cost;
     private int id;
     private String name;
     
     public  Constructor(String x,int y,int z) {
    	 if(z>0&&y>0) {
  	   name=x;
  	   id=y;
  	   cost=z;
    	 }
     }
     public int getId() {
  	   return id;
     }
     public String getName() {
  	   return name;
     }
     public int getCost() {
  	   return cost;
     }
}
