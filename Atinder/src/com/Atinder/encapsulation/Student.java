package com.Atinder.encapsulation;

public class Student {
                       private int id;
                       private int marks;
                       private String name;
                       
                       public void setData(String x,int y,int z) {
                    	   name=x;
                    	   id=y;
                    	   marks=z;
                       }
                       public int getId() {
                    	   return id;
                       }
                       public String getName() {
                    	   return name;
                       }
                       public int getMarks() {
                    	   return marks;
                       }
}
