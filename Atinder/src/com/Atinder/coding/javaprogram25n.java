package com.Atinder.coding;

import java.util.Scanner;

public class javaprogram25n {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length ");
		int len = scan.nextInt();
        EmployeeApp ea =  new EmployeeApp();
       Employee arr[]= ea.createArray(len);
       for(Employee x: arr) {
    	   System.out.println("The name of the employee is "+x);
       }
	}

}
 class EmployeeApp{
	 Scanner scan = new Scanner(System.in);
	public Employee[] createArray(int len) {
		 Employee  []e=new  Employee[len];
		
		
		for(int i=0;i<len;i++) {
			System.out.println("Enter the name of an employee  "+ (i+1));
			String name=scan.next();
	         
			System.out.println("Enter the age of an employee  "+ (i+1));
			int age=scan.nextInt();
			
			System.out.println("Enter the gender  of an employee  "+(i+1));
			String gen=scan.next();
		    
			System.out.println("Enter the id  of an employee  "+(i+1));
			String id=scan.next();
			
			System.out.println("Enter the salary of an employee  "+(i+1));
			int salary=scan.nextInt();
			
			e[i]=new Employee(age ,name,gen,id,salary );
		
		}
		return e;
	}
}
 class Employee{
	 int age;
	 String name;
	 String gen;
	 String id;
	 int salary;
	 public void work() {
		 System.out.println("Employee works in a Company");
	 }
	public Employee(int age, String name, String gen, String id, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.gen = gen;
		this.id = id;
		this.salary = salary;
	}
	
 }
