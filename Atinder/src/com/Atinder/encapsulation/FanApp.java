package com.Atinder.encapsulation;

public class FanApp {

	public static void main(String[] args) {
		Fan st = new Fan();
		st.setData("crompton",-1,786);
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getCost());

	}

}
