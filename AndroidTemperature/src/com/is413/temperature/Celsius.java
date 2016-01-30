package com.is413.temperature; 

/* 
 * Compile with
 * javac path/*.java

 */

public class Celsius
{
	private float celsius; 
		
	public Celsius(String c) 
	{
			this.celsius = Float.parseFloat(c);
	}
		
	//c to f
	public String convert()
	{
		double fahrenheit; 
		fahrenheit = ((9.0 / 5.0) * celsius) + 32.0;
		return Double.valueOf(fahrenheit).toString();
	}
	
		
}


