package com.Atinder.multiThreading;

public class ProducerConsumerproblem {

	public static void main(String[] args) {
		Factory f = new Factory();
		producer p = new producer(f);
		consumer c = new consumer(f);
		Thread t1= new Thread(p);
		Thread t2= new Thread(c);
		t1.start();
		t2.start();

	}

}
class Factory{
	  int x;
	 boolean  value_of_x=false;
	synchronized  void put(int j) {
		try {
		if(value_of_x==true) {
			wait();
		}
			x=j;
			System.out.println("I have put "+j+" in x");
			value_of_x=true;
				notify();
		}
	catch(Exception e ) {
		System.out.println("Exception occurs ");
	}
}
	synchronized  void get() {
		try {
			if(value_of_x==false) {
				wait();
			}
			System.out.println("I have consumed "+x);
			value_of_x=false;
			notify();
		}
		catch (Exception e) {
			System.out.println("Exception found");
		}
	}
}
	
class producer implements Runnable{
	Factory ref;
	public producer(Factory ref) {
		this.ref=ref;
	}
	public void run() {
		int i=0;
		while(true) {
			ref.put(i++);	
	}
	}
}
class consumer implements Runnable{
	Factory ref;
	public consumer(Factory ref) {
		this.ref=ref;
	}
	public void run() {
				while(true) {
					ref.get();
				}
	}
}
