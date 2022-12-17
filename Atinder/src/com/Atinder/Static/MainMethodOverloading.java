package com.Atinder.Static;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("hlo");
		MainMethodOverloading mm = new MainMethodOverloading();
		mm.main();
		System.out.println(mm.main(4,5));
	}
	public void main() {
		System.out.println("Zero parameterized main method");
	}
	public int main(int n,int m ) {
		return m+n;
	}

}
