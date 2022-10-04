package com.Atinder.OOP;

public class OPP1 {

	public static void main(String[] args) {
		Giny gg = new Giny(12,"giggy",4,'t');
		Giny g1 = new Giny();
		
//           gg.age=12;
//           gg.name="giny";
//           gg.div=4;
//          gg.gender='f';
           System.out.println(gg.name);
           System.out.println(gg.age);
           System.out.println(gg.div);
           System.out.println(gg.gender);
           System.out.println(g1.name);
           System.out.println(g1.age);
           System.out.println(g1.div);
           System.out.println(g1.gender);
          g1.greetings();
          g1.changename("bunny");
          System.out.println(g1.name);
          Giny g2 = new Giny();
          System.out.println(g2.name);
          System.out.println(g2.age);
          System.out.println(g2.div);
          System.out.println(g2.gender);
          
          Giny jacob= new Giny(gg);
          System.out.println(jacob.name);
          System.out.println(jacob.age);
          System.out.println(jacob.div);
          System.out.println(jacob.gender);
          Giny two= g2;
          System.out.println(g2.name);
          System.out.println(g2.age);
          
	}

}
class Giny {
	int age ;
	String name;
	int div ;
    char gender ='m';
    
//    Giny(){
//    	this.name="rani";
//    	this.age=32;
//    	this.div=5;
//    	this.gender='k';
//    }
  void  greetings() {
    	System.out.println("hello my name is "+ this.name);
    }
  void changename(String newname) {
	     name= newname;
  }
  Giny(int age,String name,int div,char gender){
	  this.age=age;
	  this.name=name;
	  this.div=div;
	  this.gender=gender;
  }
	 Giny(){
		 this(12,"ram",4,'j');
		
	 }
	 Giny (Giny other){
		 this.name=other.name;
		 this.age=other.age;
	}

}
