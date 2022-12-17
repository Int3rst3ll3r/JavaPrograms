package com.Atinder.coding;

import java.util.Scanner;


class Student {
	static public Student ref =null;
	String name;
	int age;
	String gender;
	int marks;
	int sem;
	int id;
	String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	private Student(String name, int age, String gender, int marks, int sem, int id, String college) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.sem = sem;
		this.id = id;
		this.college = college;
	}
	public void sleep() {
		System.out.println("student is slepping");
	}
	public void eat() {
		System.out.println("student is eating");
	}
	public void study() {
		System.out.println("student is studying");
	}
	static public Student getObject() {
		if(ref==null) {
			ref=new Student("ram",12,"male",76,3,6,"RVCJ");
			return ref;
		}
		return ref;
	}
	
}
class javaclass{
	       public static void main(String[] args) {
		  Student s = Student.getObject();
		  System.out.println(s.name);
		}
}
