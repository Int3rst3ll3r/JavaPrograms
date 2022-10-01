package com.Atinder.methods;

public class Container {
  
          boolean container(String str,char k) {
        	   for(int i=0;i<str.length();i++) {
        		   
        		   if( k==str.charAt(i)) {
        			   return true;
        		   }
        	   }
        	   return false;
          }
}
