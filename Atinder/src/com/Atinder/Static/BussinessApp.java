package com.Atinder.Static;

public class BussinessApp {

	public static void main(String[] args) {


		Bussiness b1 = new Bussiness();
		Bussiness b2 = new Bussiness();
		Bussiness b3 = new Bussiness();
		
		System.out.println("Calculation of SI for B1");
		b1.takeinput();
		b1.calculate();
		b1.output();
		System.out.println("Calculation of SI for B2");
		b2.takeinput();
		b2.calculate();
		b2.output();
		System.out.println("Calculation of SI for B3");
		b3.takeinput();
		b3.calculate();
		b3.output();
		
	}

}
