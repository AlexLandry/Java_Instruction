package com.chsrobotics.javainstruction;

public class Equation {
	
	     public static void main(String []args)
	     {
	        myMethod();
	     }

	     public static void myMethod()
	     {
	    	 int x = 3;
	    	 for ( x = 3 ; ;)
	         if (x == 3) break;
	         float y = (x+4)*(x-4)/x-3;
	         System.out.println(x);
	     }    
	}