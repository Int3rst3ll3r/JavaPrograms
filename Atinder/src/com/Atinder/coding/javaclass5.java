package com.Atinder.coding;

import java.util.Scanner;

public class javaclass5 {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.takeOrdr();

	}

}
class product{
	 final int items=10;
	    int usr_ordr;
	    
	    public void acceptInput() {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("number of items");
	    	  usr_ordr= scan.nextInt();
	    }
	    public void verify_ordr() throws InputInvalidException,minimumValueException{
	    	if(usr_ordr<4) {
	    	 minimumValueException m = new minimumValueException();
	    	 System.out.println(m.getmessage());
	    	 throw m;
	    	}
	       else if(usr_ordr<=items) {
	     	  System.out.println("Order Accepted");
	    	}
	    	else {
	    	InputInvalidException iie= new InputInvalidException();
	    	  System.out.println(iie.message());
	    	  throw iie;
	    	}
	    }
}

class Amazon{
	public void takeOrdr() {
		product p = new product();
		try {
		p.acceptInput();
		p.verify_ordr();
		}
		catch(InputInvalidException|minimumValueException e1) {
			try {
				p.acceptInput();
				p.verify_ordr();
			}
			catch(InputInvalidException|minimumValueException e2) {
				try {
					p.acceptInput();
					p.verify_ordr();
				}
				catch (InputInvalidException|minimumValueException e3) {
					System.out.println("Not avaiable ");
				}
			}
		}
		
	}
}
class InputInvalidException extends Exception{
	
	public String message() {
		return "Limit exceeded";
	}
}
class minimumValueException extends Exception{
	
	public String getmessage() {
		return "minimum Limit preceeded";
	}
}
