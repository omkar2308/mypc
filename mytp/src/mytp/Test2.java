package mytp;

//Java program to demonstrate functional interface

class Test2
{
	public static void main(String args[])
	{
		// create anonymous inner class object
		new Thread( 
				      ()->{ 
					
					
					
						System.out.println("IN RUN ... new threwd creATED");
						
					
				}) .start(); 
		
	
	
}}
