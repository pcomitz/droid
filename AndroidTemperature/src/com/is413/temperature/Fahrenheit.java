package com.is413.temperature; 

/* 
 * Compile with
 * javac fall2011Temperature/*.java

 */

public class Fahrenheit
{
	private float fahrenheit; 
		
	public Fahrenheit(String f) 
	{
			this.fahrenheit = Float.parseFloat(f);
	}
		
		
	//f to c
	public String convert()
	{
		double celsius;
		celsius = 5.0 / 9.0 * ( fahrenheit - 32.0 );
		return new Float(celsius).toString();		
	}
		
		
		
}


