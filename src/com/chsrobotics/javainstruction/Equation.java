package com.chsrobotics.javainstruction;

public class Equation {
 	
 	     public static void main(String []args)
 	     {
 	        myMethod();
 	     }
 
 	     public static void myMethod()
 	     {
 	    	 for (int x = 0 ; x <= 3; x++)
 	    	 {
 	    		 float y = (x+4)*(x+4);
 	 	         float z = x-3;
 	 	         float a = y/z;
 	 	         System.out.println(a);
 	 	         }
 	    	 for (int x = 4 ; x <= 10; x++)
 	    	 {
 	    		 float y = (x+4)*(x+4);
 	 	         float z = x-3;
 	 	         float a = y/z;
 	 	         System.out.println(a);
 	    	 }
 	    	
 
 	     }    
 	} 