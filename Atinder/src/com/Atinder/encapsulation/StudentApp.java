package com.Atinder.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
        
		Student st = new Student();
		st.setData("ram",78,990);
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getMarks());
		

	}

}
